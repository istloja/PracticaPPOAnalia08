/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooanalia08.Metodos;

import java.util.Scanner;

/**
 *
 * @author IST- LOJA
 */
public class voidydatos {
    public void sumar(int numero1, int numero2){ //muestra dos numeros
        System.out.println("la suma es" +(numero1+numero2));//presenta el resultado
    }
    //los metodos que vuelven datos pueden ser tipo
    //int, double, String, booleano
    public int sumar1(int numero1, int numero2){
        return  numero1+numero2;
    }
    public String unirCadenas(String cadena1, String cadena2){
        return cadena1+cadena2;
    }
    public boolean iniciasSesion(String usuario,String password){
        boolean valor=false;
   
        if(usuario.equals("admin") && password.equals("1234")){
        }
        return valor;
    }   
   
    public static void maid(String[] arg){
        voidydatos objeto=new voidydatos();//creamos un sujeto
        objeto.sumar(10,8);//lamamos al metodo sumar y enviamos  2 numeros
        objeto.sumar(11,23);
        objeto.sumar(80,7);
        int resultado=objeto.sumar1(40, 10);
        System.out.println("la suma es"+ resultado);
        String cadena=objeto.unirCadenas("Hola","mundo");
        System.out.println("La cadena unida es"+cadena);
        boolean variableinicio=objeto.iniciasSesion("admi","1234");
        System.out.println(variableinicio);
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el usuario");
        String usuario=entrada.next();
        System.out.println("Ingrese la contraseña");
        String password=entrada.next();
        boolean inicioSesion=objeto.iniciasSesion(usuario, password);
        if(inicioSesion){
            System.out.println("Bienvenido al sistema");
        }else{
            System.out.println("Credenciales incorrectos");
            
            
        }
    }
}
