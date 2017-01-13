/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Vector;

/**
 *
 * @author vek
 */
public class Galpon {
    private String id;
    private String numero;
    private String descripcion;

    public Galpon() {
    }

    public Galpon(String id, String numero, String descripcion) {
        this.id = id;
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public Galpon(String numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Galpon{" + "id=" + id + ", numero=" + numero + ", descripcion=" + descripcion + '}';
    }

    public Object[] toArray() {
        return new Object[]{this.id,this.numero, this.descripcion};
    }
   
    
}
