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
public class Aves extends Animal {
private int numerodehuevo;
private boolean vuela;

    public Aves(int numerodehuevo, boolean vuela, String Nombre, double Peso, int edad, String color, int Altura) {
        super(Nombre, Peso, edad, color, Altura);
        this.numerodehuevo = numerodehuevo;
        this.vuela = vuela;
    }

    public Aves() {
    }

    public int getNumerodehuevo() {
        return numerodehuevo;
    }

    public void setNumerodehuevo(int numerodehuevo) {
        this.numerodehuevo = numerodehuevo;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    
}
