/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codificador_De_Herencias;

/**
 *
 * @author its
 */
public class Operario extends Empleado {

    //constructor con un parámetro

    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    //constructor por defecto
    public Operario() {
    }

    //modificación del método toString() para mostrar el mensaje adecuado
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
