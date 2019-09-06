/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author IST- LOJA
 */
public class Archivos {
//    public static void main(String[] args) {
//         File archivo=new File("C:\\Users\\IST- LOJA\\Desktop\\ejemplo.txt");
//         System.out.println(archivo.exists());
//         
//         System.out.println(archivo.isAbsolute());
//         
//         System.out.println(archivo.isFile());
//         //oculto
//         System.out.println(archivo.isHidden());
//         
//         System.out.println(archivo.lastModified());
//         archivo.delete();
//         File carpeta=new File("C:\\Users\\IST- LOJA\\Desktop\\");
//         String[]arregloarchivos=carpeta.list();
//         for(int i=0;  i<arregloarchivos.length; i++){
//             System.out.println(arregloarchivos[i]);
//        
//         
//         
//                 
//                 }
//               
//    }  

    public static void main(String[] args) {
        
    
        Archivos objeto = new Archivos();
        Scanner entrada=new Scanner (System.in);
        objeto.leerArchivo("C:\\Users\\IST- LOJA\\Desktop\\Knal.txt");
        System.out.println("iNGRESAR UN TEXTO");
        objeto.escribirArchivo("C:\\Users\\IST- LOJA\\Desktop\\Knal.txt","Participa y gana ");
        
        texto=entrada.nextLine();
    }
     public  void leerArchivo(String direccion){
         File archivo = new File(direccion);
        try {
            FileReader reader = new FileReader(archivo);
            BufferedReader recorrido = new BufferedReader(reader);
            String linea;
            while ((linea = recorrido.readLine()) != null) {
                System.out.println(linea);

            }
    } catch (Exception e) {
                System.out.println(e);
    }
}
    public void escribirArchivo(String direccion){
        try{
        FileWriter archivo=new FileWriter(direccion);
        PrintWriter escribir=new PrintWriter(archivo);
        escribir.pintln(texto);
        archivo.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
                
    }

    private void escribirArchivo(String cUsersIST_LOJADesktopKnaltxt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
