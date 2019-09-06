/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecchas_Clase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author IST- LOJA
 */
public class Fechas {
    public static void main(String[] args) {
        Date fechaActual=new Date();
        System.out.println(fechaActual);
        SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd");
       Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la fechaen el formato yyyy/MM/dd");
        String  fecha=entrada.nextLine();
        Date fechadenacimiento=null;
        try{
            fechadenacimiento=formato.parse(fecha);
            System.out.println(fechadenacimiento);
            System.out.println(fechadenacimiento.before(fechaActual));
        }catch(Exception e){
            System.out.println(e);
        }
        GregorianCalendar calendario=new GregorianCalendar();
        calendario.setTime(fechaActual);
        int anioactual=calendario.get(GregorianCalendar.YEAR);
        int mesactual=calendario.get(GregorianCalendar.MONTH)+1;
        int diactual=calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Año"+anioactual+"Mes"+mesactual+"Dia"+diactual);
        GregorianCalendar calendario1=new GregorianCalendar();
        calendario1.setTime(fechadenacimiento);
        int aniodenacimiento=calendario.get(GregorianCalendar.YEAR);
        int mesdenacimiento=calendario.get(GregorianCalendar.MONTH);
        int diadenacimiento=calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Año"+aniodenacimiento+"Mes"+mesdenacimiento+"Dia"+diadenacimiento);
        
        
 
    }  
    }


   

      
        
        
        
            
        }
    
    

