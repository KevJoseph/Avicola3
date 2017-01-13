/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorBaseDatos;
import entidades.BaseDatosResultados;
import entidades.Galpon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vek
 */
public class ModeloGalpon {
    private ControladorBaseDatos bd;

    public ModeloGalpon() {
        this.bd = new ControladorBaseDatos();
    }
    
    public int insert(String numero, String descripcion){
        try {
            this.bd.conectar();
            String sql = "INSERT INTO galpones(numero_galpon,descripcion) values(?,?)";
            PreparedStatement st = this.bd.objconexion().prepareStatement(sql);
            st.setString(1,numero);
            st.setString(2,descripcion);
            st.execute();
            this.bd.desconectar();
            System.out.println("ModelGalpon INSERT: OK");
            return BaseDatosResultados.EXITO_GUARDAR;            
        } catch (Exception e) {
            System.out.println("ModelGalpon INSERT: ERROR");
            return BaseDatosResultados.FALLO_GUARDAR;
        }
    }
    public ArrayList select(){
        try {
            ArrayList lista = new ArrayList();
            String sql = "SELECT * FROM galpones";
            this.bd.conectar();
            Statement st = this.bd.objconexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = rs.getString("id");
                String numero = rs.getString("numero_galpon");
                String descripcion = rs.getString("descripcion");
                Galpon tmpgalpon = new Galpon(id,numero,descripcion);
                lista.add(tmpgalpon);
            }
            this.bd.desconectar();
            System.out.println("ModelGalpon SELECT... OK");
            return lista;            
        } catch (Exception e) {
            System.out.println("MODELGALPON SELECT... ERROR");
            return null;
        }
    }    
    public int update(){
        return 1;
    }
    public int delete(){
        return 1;
    }
    
    
}
