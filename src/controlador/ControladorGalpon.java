/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.BaseDatosResultados;
import entidades.Galpon;
import java.util.ArrayList;
import modelo.ModeloGalpon;


/**
 *
 * @author vek
 */
public class ControladorGalpon {
    ModeloGalpon mgalpon;

    public ControladorGalpon() {
        this.mgalpon = new ModeloGalpon();
    }
    
    public int guardar(Galpon g){
        if(BaseDatosResultados.EXITO_GUARDAR == mgalpon.insert(g.getNumero(),g.getDescripcion())){
            System.out.println("ControllerGalpon Guardar.. OK");
            return  BaseDatosResultados.EXITO_GUARDAR;
        }else{
            System.out.println("ControllerGalpon Guardar.. ERROR");
            return BaseDatosResultados.FALLO_GUARDAR;
        }
    }
    
    public ArrayList mostrar(){
        ArrayList lista = new ArrayList();
        lista = mgalpon.select();
        return lista;
    }
    
    public int modificar(){
        return 1;
    }
    
    public int eliminar(){
        return 1;
    }
    
    
}
