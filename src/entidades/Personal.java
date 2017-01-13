/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author vek
 */
public class Personal {
    private String id;
    private String cod_p;
    private String nombre;
    private String apellido;
    private String fecha_i;
    private String tipo;
    private String galpon;

    public Personal(String id, String cod_p, String nombre, String apellido, String fecha_i, String tipo, String galpon) {
        this.id = id;
        this.cod_p = cod_p;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_i = fecha_i;
        this.tipo = tipo;
        this.galpon = galpon;
    }
    
    public Personal() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getCod_p() {
        return cod_p;
    }

    public void setCod_p(String cod_p) {
        this.cod_p = cod_p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_i() {
        return fecha_i;
    }

    public void setFecha_i(String date) {
        this.fecha_i = date;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGalpon() {
        return galpon;
    }

    public void setGalpon(String galpon) {
        this.galpon = galpon;
    }
    
    
    public Object[] toArray(){
       return new Object[]{this.id,this.cod_p, this.nombre, this.apellido,this.fecha_i,this.tipo,this.galpon};
    }

    @Override
    public String toString() {
        return "Personal{" + "id=" + id + ", cod_p=" + cod_p + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_i=" + fecha_i + ", tipo=" + tipo + ", galpon=" + galpon + '}';
    }

   
    
    
    
}
