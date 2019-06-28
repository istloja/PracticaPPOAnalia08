/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fIGURAS;

import java.util.Scanner;

/**
 *
 * @author IST- LOJA
 */
public class Ejecutar {
     public static void main(String[] args, String areacirculo, String areacuadrado){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingresae uno para circulo, dos para triangulo y tres para cuadrado ");
         int valor=entrada.nextInt();
         switch (valor){
             case 1:
                 System.out.println("Es un circulo");
                 double radio=entrada.nextInt();
                 Circulo objeto=new Circulo();
                 double areaCirlculo=objeto.calcularArea(radio);
    
                 double PerimetroCirlculo=objeto.calcularPerimetro(radio);
                 System.out.println("Este es el area"+AreaCirculo+"Este es el perimetro"+PerimetroCirculo);
                 
                 break;
             case 2:
                 System.out.println("Es un triangulo");
                 double lado=entrada.nextInt();
                 Triangulo objetoT=new Triangulo();
                 double areaTriangulo=objetoT.calcularArea(base*altura);
                 double perimetroTriangulo=objeto.calcularPerimetro(lado);
                 System.out.println("Este es el Area"+areaTriangulo+"Este es el perimetro"+perimetroTriangulo);
                 break;
             case 3:
                 System.out.println("Es un cuadrado");
                  double lado=entrada.nextInt();
                 Cuadrado objetoC=new Cuadrado();
                 double areaCuandrado=objetoC.calcularArea(lado);
                 double perimetroCuadradd=objeto.calcularPerimetro(lado);
                 System.out.println("Este es el Area"+areacuadrado+"Este es el perimetro"+perimetrocuadrado);
                 break;
                 
         }
     }
}

