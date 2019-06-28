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
public class Cuadrado extends FiguraBidimiensional {
    public double calcular(double lado){
        return Math.pow(lado, 2);
    }
    public double CalcularPerimetro(double lado){
        return lado+lado+lado+lado;
    }
    
}
