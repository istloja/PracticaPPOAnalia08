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
public class Animal {

    private String Nombre;
    private  double Peso;
    private int edad;
    private int Altura;
    private String Color;

 

    public Animal() {
    }

    public Animal(String Nombre, double Peso, int edad, int Altura, String Color) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.edad = edad;
        this.Altura = Altura;
        this.Color = Color;
    }

  
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }
  

        
    public static void nombreanimal (){
        System.out.println("Hola Soy un Animal");
        
    }
    public String informacionAnimal(){
        String informacion= Nombre+" "+Color+" "+edad+" "+Altura+" "+Peso;
         return informacion;
       
    }

    public static void main(String[] args) {
        Animal objeto= new Animal();
        objeto.setNombre("Perro");
        objeto.setEdad(10);
        objeto.setPeso(150);
        objeto.setColor("Rojo");
        System.out.println(objeto.informacionAnimal());
        
             
    }
    
    
    
}
    
    

