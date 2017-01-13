/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author UNDC-USI
 */
public class Planilla {
    private String codigopersonal;
    private String nombre;
    private String apellido;
    private String dia;
    private String Adicional1;
    private String Adicional2;
    private String Adicional3;
    private String total;

    public Planilla() {
    }

    public Planilla(String codigopersonal, String nombre, String apellido, String dia, String Adicional1, String Adicional2, String Adicional3, String total) {
        this.codigopersonal = codigopersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.Adicional1 = Adicional1;
        this.Adicional2 = Adicional2;
        this.Adicional3 = Adicional3;
        this.total = total;
    }

    public Planilla(String codigopersonal, String nombre, String apellido, String dia, String Adicional1) {
        this.codigopersonal = codigopersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.Adicional1 = Adicional1;
    }
    

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAdicional1() {
        return Adicional1;
    }

    public void setAdicional1(String Adicional1) {
        this.Adicional1 = Adicional1;
    }

    public String getAdicional2() {
        return Adicional2;
    }

    public void setAdicional2(String Adicional2) {
        this.Adicional2 = Adicional2;
    }

    public String getAdicional3() {
        return Adicional3;
    }

    public void setAdicional3(String Adicional3) {
        this.Adicional3 = Adicional3;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Planilla{" + "codigopersonal=" + codigopersonal + ", nombre=" + nombre + ", apellido=" + apellido + ", dia=" + dia + ", Adicional1=" + Adicional1 + ", Adicional2=" + Adicional2 + ", Adicional3=" + Adicional3 + ", total=" + total + '}';
    }
    
    public Object[] toArray(){
       return new Object[]{this.codigopersonal,this.nombre,this.apellido,this.dia,this.Adicional1};
    }
    
}
