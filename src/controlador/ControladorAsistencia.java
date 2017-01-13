/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Asistencia;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelo.ModeloAsistencia;


/**
 *
 * @author vek
 */
public class ControladorAsistencia{
    ModeloAsistencia modelasis;
    ControladorBaseDatos bd;
    
    public ControladorAsistencia() {
        this.modelasis = new ModeloAsistencia();
        this.bd = new ControladorBaseDatos();
        
    }
    
    public int guardar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public ArrayList mostrar(String eleccion,String date) {
        try {
            ArrayList lista = new ArrayList();
            lista =  this.modelasis.select(eleccion,date);
            System.out.println("[+]ControladorAsistencia... OK");
            return lista;

        } catch (Exception e) {
            System.out.println("[-]ControladorAsistencia... Error");
            return null;
        }

    }

    public int modificar(Object o) {
        Asistencia a = (Asistencia) o;
        modelasis.update(a.getIdpersonal(),a.getEstado(),a.getHora_extra(),a.getFecha());
        System.out.println("hahah: "+a.toString());
        System.out.println("ControladorAsistencia... OK");
        return 1;
    }

    public int eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    public int procedure1(){
        modelasis.proc_asis();
        modelasis.proc_fantasma();
        return 1;
    }
    public Boolean confiCbx(JComboBox cbx) {
        ArrayList lista = new ArrayList();
        String sql="SELECT fecha FROM repo GROUP BY fecha";
        try {    
        this.bd.conectar();
        Statement st = this.bd.objconexion().createStatement();
        ResultSet rs = st.executeQuery(sql);             
            while(rs.next()){
                String fecha = rs.getString("fecha");
                //cbx.addItem(fecha);
                lista.add(fecha); 
            }
            lista.add("0000-00-00");
            
            cbx.setModel(new DefaultComboBoxModel(lista.toArray()));

            this.bd.desconectar();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

