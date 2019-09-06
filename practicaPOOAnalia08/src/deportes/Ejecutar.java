/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

/**
 *
 * @author IST- LOJA
 */
public class Ejecutar {
     public static void main(String[] args) {
       Deportes objeto=new Deportes("Real Madrid",90,"Sidan","Madrid","Templado");
        Equipo objetoave=new Equipo(11,"Sergio Games",90,10,"lA COPA MFOD",);
        UnoSolo objetomm=new UnoSolo("Superior","Comoda","true,"Abierta","Loja","Dinamicos",60;"Mauricio Olmedo","Loja","Templado");
        System.out.println(objeto.InformcacionDeportes());
        System.out.println(objetoave.InformcacionDeportes());
        System.out.println(objetomm.InformcacionDeportes());
        }
            
        
    }