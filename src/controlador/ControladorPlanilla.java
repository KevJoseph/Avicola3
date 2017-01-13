/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Planilla;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author UNDC-USI
 */
public class ControladorPlanilla {
    ControladorBaseDatos bd;

    public ControladorPlanilla() {
        this.bd = new ControladorBaseDatos();
    }
    
    public ArrayList select(){
        ArrayList lista = new ArrayList();
        String sql="select codpersonal,nombre,apellido,count(estado) dia,count(estado)*7.5 as adicional from repo where estado=1 group by(codpersonal)";        
        try {    
        this.bd.conectar();
        Statement st = this.bd.objconexion().createStatement();
        ResultSet rs = st.executeQuery(sql);             
            while(rs.next()){
                String codpersonal = rs.getString("codpersonal");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dia = rs.getString("dia");
                String adicional = rs.getString("adicional");
                Planilla p = new Planilla(codpersonal,nombre,apellido,dia,adicional);
                System.out.println(p.toString());
                lista.add(p);             
            }
            this.bd.desconectar();
            return lista;
        } catch (Exception e) {
            return null;
        }
      
    }
    public static void main(String[] args) {
        ControladorPlanilla cp = new ControladorPlanilla();
        cp.select();
    }
}
