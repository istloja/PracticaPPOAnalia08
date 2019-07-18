/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionOrientadaObjetos;

/**
 *
 * @author IST- LOJA
 */
public class Mamiferos extends Animal {
    private int tiempodegestacion;
    private boolean pelaje;

    public Mamiferos(int tiempodegestacion, boolean pelaje, String Nombre, double Peso, int edad, String color, int Altura) {
        super(Nombre, Peso, edad, color, Altura);
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }

    public Mamiferos() {
    }

    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
}
