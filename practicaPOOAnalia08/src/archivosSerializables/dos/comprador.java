/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables.dos;

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
public class comprador {
    private static Object lj;

    private static void escribirlista(String cUsersISTLOJA1DesktopLecciontxt, Object lj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void leerlista(String cUsersISTLOJA1DesktopLecciontxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int precio;

    private comprador(String cristiano, int i, articulo articulo, envio envio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private comprador(String cristiano, int i, articulo articulo, envio envio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private comprador(String cristiano, int i, articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private comprador(String cristiano, int i, articulo articulo, envio envio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private comprador(String cristiano, int i, articulo articulo, envio envio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nombre;
    private String apellido;
    private String Direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public comprador() {
    }

    public comprador(String nombre, String apellido, String Direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Direccion = Direccion;
    }
   
      public void leerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                comprador c1 = (comprador) auxiliar;
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

        }

    }
    public List<comprador> leercomprador(String dir) {

        List<comprador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                comprador m = (comprador) auxiliar;
                lista.add(m);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }
      public void escrbirLista(String direccion, List<comprador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (comprador comprador : lista) {//para recorrer una lista
                //Persona:clase    //persona:objeto
                //por cada vez que se recorre la lista se crea un objeto de la clase persona
                escritor.writeObject(comprador);
            }
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
               }
        
         public int Mayorprecio (List<comprador> lista) {
        int edadmax = lista.get(0).getprecio();
        for (comprador precio : lista) {

            if (precio.getprecio() >
                    edadmax) {
                edadmax = precio.getprecio();

            }

        }
        return precio;
    }

    public int menorprecio(List<comprador> lista) {
        int edadmin = 27;
        for (comprador comprador : lista) {
            if (comprador.getprecio()> edadmin) {
                edadmin = comprador.getprecio();

            }
        }
        return precio;
    


        }
        public static void main(String[] args) {
        comprador a = new comprador("cristiano",17,new articulo("lavadora",20), new envio(12, "Vilcabamba"));
        comprador b = new comprador("Daniel",15,new articulo("secadora",20), new envio(23, "Loja"));
        comprador c = new comprador("Ronaldo",17,new articulo("Mesa",20), new envio(32, "Quinara"));
        comprador d = new comprador("Luisa",17,new articulo("Silla",20), new envio(12, "Yangana"));
        comprador f = new comprador("Veronica",17,new articulo("microondas",20), new envio(151, "Vilcabamba"));
        comprador g = new comprador("Danielka",17,new articulo("Lavadora",20), new envio(22, "Vilcabamba"));
        comprador h = new comprador("Kia",17,new articulo("Televisor",20), new envio(52, "Malacatos"));
        comprador i = new comprador("Kevin",17,new articulo("Equipo",20), new envio(58, "Valladolid"));
        comprador j = new comprador("Brayan",17,new articulo("cocina",20), new envio(12, "Catamayo"));
        comprador k = new comprador("Salvador",17,new articulo("Horno",20), new envio(15, "Catamayo"));
        comprador l = new comprador("ERsperanza",17,new articulo("secadora",20), new envio(45, "Vilcabamba"));
           
    
        List<comprador> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(f);
        lista.add(g);
        lista.add(h);
        lista.add(i);
        lista.add(j);
        lista.add(k);
        lista.add(l);
 
         int a = lj.size();
        System.out.println("a");

        comprador.leerlista("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", e10);
        comprador.escribirlista("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", lj);
        comprador.leerlista("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
        System.out.println("el articulo con menor precio es" + comprador.mayorprecio(lj).getNombre());
        System.out.println("el articulo con mayor precio es" + comprador.menorprecio(lj).getNombre());
      
    }

    private int getprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    


      
   