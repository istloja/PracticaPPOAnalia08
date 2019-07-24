/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.File;
import java.util.Scanner;

/**
 *
 * 
 * @author IST- LOJA
 */
public class ArchivoDeber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. archivos de documentos");
        System.out.println("2.Archivo de musica");
        System.out.println("3. Archivos de imagenes");
        System.out.println("4. Archivos Netsbeans");
        System.out.println("5. Archivos videos");
        int valor;
        valor = entrada.nextInt();
        System.out.println("Elija el correcto");
        switch (valor) {
            case 1:
                System.out.println("Las listas de los archivos que estan en documentos son");
                File archivo = new File("C:\\Users\\IST- LOJA\\Documents");
                String[] arregloarchivo = archivo.list();
                for (int i = 0; i < arregloarchivo.length; i++) {
                    System.out.println(arregloarchivo);
                }
            case 2:
                System.out.println("Las listas de los archivos que estan en musica son");
                File archivos = new File("C:\\Users\\IST- LOJA\\Music");
                String[] arregloarchivos = archivos.list();
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos);
                }
            case 3:
                System.out.println("Las listas de los archivos que estan en Imagenes son");
                File archivoss = new File("C:\\Users\\IST- LOJA\\Pictures");
                String[] arregloarchivoss = archivoss.list();
                for (int i = 0; i < arregloarchivoss.length; i++) {
                    System.out.println(arregloarchivoss);
                }
            case 4:
                System.out.println("Las listas de los archivos que estan en Netbeans son");
                File archivosss = new File("C:\\Users\\IST- LOJA\\Documents");
                String[] arregloarchivosss = archivosss.list();
                for (int i = 0; i < arregloarchivosss.length; i++) {
                    System.out.println(arregloarchivosss);
                }
            case 5:
                System.out.println("Las listas de los archivos que estan en Videos son");
                File archivossss = new File("C:\\Users\\IST- LOJA\\Pictures");
                String[] arregloarchivossss = archivossss.list();
                for (int i = 0; i < arregloarchivossss.length; i++) {
                    System.out.println(arregloarchivossss);
                    

        }
    }
    
    
    }
}