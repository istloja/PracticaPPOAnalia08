/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author IST- LOJA
 */
public class Familiares {
    private String nombre;
    private  String apellido;
    private int edad;
    private int nacimiento;
    public String colordepiel;
    public String genero;
    public int estatura;
    

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getColordepiel() {
        return colordepiel;
    }

    public void setColordepiel(String colordepiel) {
        this.colordepiel = colordepiel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstatura() {
        return estatura;
    }
 
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public static void main(String[] args) {
        Familiares objeto= new Familiares ();
        objeto.setApellido("Armijos");
        System.out.println(objeto.getApellido());
    }
}
