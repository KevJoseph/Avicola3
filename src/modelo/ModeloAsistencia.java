/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorBaseDatos;
import entidades.Asistencia;
import entidades.Personal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vek
 */
public class ModeloAsistencia {
    ControladorBaseDatos bd;

    public ModeloAsistencia() {
        this.bd = new ControladorBaseDatos();
    }


    public int insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ArrayList select(String eleccion,String date) {
        ArrayList lista = new ArrayList();
        String sql="select * from repo order by fecha";
        if(eleccion.equals("conWhere")){
            sql="select * from repo where fecha="+"'"+date+"'"+"order by idpersonal";
        }
        try {
        this.bd.conectar();
        Statement st = this.bd.objconexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
              
            while(rs.next()){
                String idpersonal = rs.getString("idpersonal");
                String codpersonal = rs.getString("codpersonal");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String idgalpon = rs.getString("idgalpon");
                String estado = rs.getString("estado");
                String hora_extra = rs.getString("hora_extra");
                String fecha = rs.getString("fecha");
                Asistencia tempasis = new Asistencia(idpersonal,codpersonal,nombre,apellido,idgalpon,estado,hora_extra,fecha);
                //System.out.println(tempasis.toString());
                lista.add(tempasis);
                
            }
            this.bd.desconectar();
            System.out.println("[+]ModelAsistencia Select... OK");
            return lista;
          
        } catch (Exception e) {
            System.out.println("[-] Error en ModeloAsisencia,method:select");
            return null;
        }
   
    }
    public int update(String idpersonal,String estado,String hora_extra,String fecha) {
        System.out.println("hehe: "+idpersonal+" "+estado+" "+hora_extra+" "+fecha);
        try {
            this.bd.conectar();
            String sql = "UPDATE repo SET estado=?,hora_extra=? WHERE idpersonal=? and fecha=?";
            PreparedStatement st = this.bd.objconexion().prepareStatement(sql);
            st.setString(1, estado);
            st.setString(2, hora_extra);
            st.setString(3, idpersonal);
            st.setString(4, fecha);
            st.execute();
            this.bd.desconectar();
            System.out.println("ModelAsistencias... UPDATE OK");
        } catch (Exception e) {
            System.out.println("ModelAsistencias... UPDATE ERROR");
        }
        return 1;
    }

    public int delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int proc_asis(){
        try {
            this.bd.conectar();
            String sql = "call proc_asis()";
            CallableStatement cs = this.bd.objconexion().prepareCall(sql);
            cs.execute();
            System.out.println("Procedure Store Model... OK");
            this.bd.desconectar();
            return 1;
        } catch (Exception e) {
            System.out.println("ProcedureStore Model... Error");
            return 0;
        }
    }
    public int proc_fantasma(){
        try {
            this.bd.conectar();
            String sql = "call proc_fantasma()";
            CallableStatement cs = this.bd.objconexion().prepareCall(sql);
            cs.execute();
            System.out.println("Procedure Store proc_fantasma() Model... OK");
            this.bd.desconectar();
            return 1;
        } catch (Exception e) {
            System.out.println("Procedure Store proc_fantasma() Model... ERROR");
            return 0;
        }
    }

}
