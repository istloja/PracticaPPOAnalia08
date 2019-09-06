/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

/**
 *
 * @author IST- LOJA
 */
public class Deportes {
    private String NumbredelEquipo;
    private float Tiempo;
    private String DirectorTecnico;
    private String Localidad;
    private String Ambiente;

    public Deportes() {
    }

    public Deportes(String NumbredelEquipo, float Tiempo, String DirectorTecnico, String Localidad, String Ambiente) {
        this.NumbredelEquipo = NumbredelEquipo;
        this.Tiempo = Tiempo;
        this.DirectorTecnico = DirectorTecnico;
        this.Localidad = Localidad;
        this.Ambiente = Ambiente;
    }

    public String getNumbredelEquipo() {
        return NumbredelEquipo;
    }

    public void setNumbredelEquipo(String NumbredelEquipo) {
        this.NumbredelEquipo = NumbredelEquipo;
    }

    public float getTiempo() {
        return Tiempo;
    }

    public void setTiempo(float Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getDirectorTecnico() {
        return DirectorTecnico;
    }

    public void setDirectorTecnico(String DirectorTecnico) {
        this.DirectorTecnico = DirectorTecnico;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getAmbiente() {
        return Ambiente;
    }

    public void setAmbiente(String Ambiente) {
        this.Ambiente = Ambiente;
    }
    
    public  void Nombresdedeportes(){
        System.out.println("Tipo de deporte");
    }
    public  String InformcacionDeportes(){
        String informe="Nombredelequipo"+"-"+"Tiempo"+"-"+"DirectorTecnico"+"-"+"Localidad"+"-"+"Ambiente";
        return informe;
    }
    public static void main(String[] args) {
        Deportes objeto=new Deportes();
        System.out.println(objeto.InformcacionDeportes());
            Deportes objeto1=new Deportes("Real Madrid",90,"Sidan","Madrid","Templado");
        
    }
     
}    

    

