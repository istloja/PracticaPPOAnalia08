/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sociali;

/**
 *
 * @author IST- LOJA
 */
public class Equipo {
    private String nombre;
    private int numerotitulos;
    private String ciudad;

    public Equipo() {
    }

    Equipo(String gg, int i, String tl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerotitulos() {
        return numerotitulos;
    }

    public void setNumerotitulos(int numerotitulos) {
        this.numerotitulos = numerotitulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}