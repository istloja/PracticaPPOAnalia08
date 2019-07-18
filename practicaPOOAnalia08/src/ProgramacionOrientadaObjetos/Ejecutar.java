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
public class Ejecutar {
    public static void main(String[] args) {
        Animal objeto=new Animal("Jirafa",10,14,"Amarillo",7);
        Aves objetoave=new Aves(12,false,"Pato",6,9,"Negro",2);
        Mamiferos objetomm=new Mamiferos(12,true,"vaca",3,79,"Blanca",45);
        System.out.println(objeto.informacionAnimal());
        System.out.println(objetoave.informacionAnimal());
        System.out.println(objetomm.informacionAnimal());
        }
            
        
    }

