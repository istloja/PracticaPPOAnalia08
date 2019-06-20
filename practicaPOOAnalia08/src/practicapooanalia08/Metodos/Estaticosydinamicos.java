/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooanalia08.Metodos;

/**
 *
 * @author IST- LOJA
 */
public class Estaticosydinamicos {
      public static void main(String[] args) {
  
        saludar();// para llamar un metodo estatico
         //Si quiero llamar a despedir debo crear un objeto
        Estaticosydinamicos objeto=new Estaticosydinamicos();
        objeto.despedir();
      }
    public static void saludar(){
        System.out.println("hola");
    }
    public static void  despedir(){
        System.out.println("chao");
    }
}

