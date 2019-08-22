/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1;

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
public class Estudiante {
     private String Nombre;
    private String Apellido;
    private int edad;
    private String materia;
    private String direccion;

    public Estudiante() {
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Estudiante(String Nombre, String Apellido, int edad, String materia, String direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.materia = materia;
        this.direccion = direccion;
    }

    public void EscribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escritor.writeObject(estudiante);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrujo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante objeto = (Estudiante) auxiliar;
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                auxiliar = lector.readObject();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Estudiante> leerEstudiante(String direccion) {
        List<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante("Flavio", "Monterrey", 23, "Metodologia", "ISTL");
        Estudiante objeto1 = new Estudiante("Samaris", "Marchena", 19,"Mecanica", "ISTL");
        Estudiante objeto2 = new Estudiante("Mariana", "Soto", 29, "Contabilidad", "ISTL");
        Estudiante objeto3 = new Estudiante("Heydi", "Abad", 18, "Desarrollo", "ISTL");
        Estudiante objeto4 = new Estudiante("Carla", "Salazar", 22, "Contabilidad", "ISTL");
        Estudiante objeto5 = new Estudiante("Melissa", "Campoverde", 23, "Mecanica", "ISTL");
        Estudiante objeto6 = new Estudiante(" Dora ", "Sarmiento", 29, "Contabilidad", "ISTL");
        Estudiante objeto7 = new Estudiante("Daniela", "luzon", 26, "Desarrollo del software", "ISTL");
        Estudiante objeto8 = new Estudiante("Valeria", "Sarango", 25, "Mecanica", "ISTL");
        Estudiante objeto10 = new Estudiante("Jose", "Lazo", 18, "Desarrollo del Software", "ISTL");
        System.out.println(" Nombre y Apellido: " + objeto.getNombre() + "" + objeto.getApellido());
        System.out.println(" Edad: " + objeto.getEdad() + " Materia: " + objeto.getMateria() + " Direccion: " + objeto.getDireccion());
        List<Estudiante> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        lista.add(objeto7);
        lista.add(objeto8);
        lista.add(objeto10);
        int a = lista.size();
        System.out.println(a);
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.getNombre() + "" + estudiante.getApellido() + "" + estudiante.getMateria());
        }
        objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\Deber.txt");
        objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\Deber.txt", lista);

    }

}

