package como;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class LeeryEscribir {

    public void escribirObjeto(String direccion, Persona objeto) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(objeto);
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se produjo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona objeto = (Persona) auxiliar;
            System.out.println(objeto.getMascota().getNombre() + " su edad es es: " + objeto.getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void EscribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {
                escritor.writeObject(persona);

            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona ob = new Persona("Jose1", "Capo", 909 , 18, new Mascota("Banda1", 6, 4));
        Persona obe = new Persona("Jose2", "Capo", 89989, 18, new Mascota("Banda2", 6, 4));
        Persona obej = new Persona("Jose3", "Capo", 7897, 18, new Mascota("Banda3", 6, 4));
        Persona objec = new Persona("Jose4", "Capo", 788, 18, new Mascota("Banda4", 6, 4));
        List<Persona> lista = new ArrayList<>();//creamos la lista para guardar objetos
        //una vez que creamos la lista, ponemos los objetos dentro de ella
        lista.add(ob );
        lista.add(obe);
        lista.add(obej);
        lista.add(objec);
        objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", lista);
        objeto.leer_archivo("C:\\Users\\SATBOY-DJ\\Desktop\\name.txt");
        List<Persona> lista1 = objeto.lista("C:\\Users\\SATBOY-DJ\\Desktop\\name.txt");
    }

    public void leer_archivo(String ruta) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();

//          System.out.println(persona.getMascota());
            Persona persona = (Persona) auxiliar;
            System.out.println(auxiliar);
            while (auxiliar != null) {
                System.out.println(persona.getNombre());
                auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void escribirLista(String direccion_archivo, List<Persona> listapersona) {
        try {
            ObjectOutputStream ejemplo1 = new ObjectOutputStream(new FileOutputStream(direccion_archivo));
            for (Persona listapersona1 : listapersona) {
                ejemplo1.writeObject(listapersona1);

            }
        } catch (Exception e) {
            
        }

    }

    public List<Persona> lista(String direccion) {

        List<Persona> lista1 = new ArrayList<Persona>();

        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = leer.readObject();
   
               
                while (auxiliar != null) {
                    Persona persona = (Persona) auxiliar;
                    lista1.add(persona);
                   
                    auxiliar =leer.readObject();
                }
            
        } catch (Exception e) {
            

        }
        return null;

    }
}

        

        //objeto.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", ob);
        //objeto.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
    
