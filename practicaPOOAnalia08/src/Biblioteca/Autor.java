/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IST- LOJA
 */
public class Autor {
  private String Nombre;
  private String Apellido;
  private  int edad;
  private String fallecimiento;
  private String Sexo;

    public Autor() {
    }

    public Autor(String Nombre, String Apellido, int edad, String fallecimiento, String Sexo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.fallecimiento = fallecimiento;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(String fallecimiento) {
        this.fallecimiento = fallecimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
        
    
     
     
      public void escribirLibro(String direccion, Libro libro) {
        try {
            ObjectOutputStream ejemplo1 = new ObjectOutputStream(new FileOutputStream(direccion));
                ejemplo1.writeObject(libro);
                ejemplo1.close();
        }catch (Exception e){
            System.out.println(e);

            }
     
            
      }
          public int masAntiguo(List<Libro> lista) {
        int masAntiguo = lista.get(0).getDiapublicacion();

        for (Libro libro : lista) {
            if (libro.getDiapublicacion() < masAntiguo) {
                masAntiguo = libro.getDiapublicacion();
                System.out.println(" el libro mas antiguo es " + masAntiguo);
            } else {

            }
     
     public static void main(String[] args) {
      Libro objeto1= new Libro("Alicia", "Salon", "17","Agosto", "Femenino");
      Libro objeto2= new Libro("Luciano", "Sarango", "77","Diciembre", "Masculino");
      Libro objeto3= new Libro("Fernando", "Velazco", "54","Enero", "Masculino");
      Libro objeto4= new Libro("Karen", "Valdivieso", "65","Febrero", "Femenino");
      Libro objeto5= new Libro("Karen", "Valdivieso", "65","Febrero", "Femenino");
    List <Libro> lista=new ArrayList<>(); 
    lista.add(objeto1);
    lista.add(objeto2);
    lista.add(objeto3);
    lista.add(objeto4);
     lista.add(objeto5);
    Objeto.escribirLibro("‪C:\\Users\\IST- LOJA\\Desktop\\Libro.txt",objeto1);
  }
   
}

