/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fIGURAS;

/**
 *
 * @author IST- LOJA
 */
public class Triangulo extends FiguraBidimensional {
  
  
    public double  CalcularPerimetro(double lado1, double lado2, double lado3){
     return lado1+lado2+lado3;
   
    }
    
    public double clacularArea (double base, double altura){
        double area = (base*altura)/2;
        return area;
    }
}  
    

