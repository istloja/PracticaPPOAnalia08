/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes ;

/**
 *
 * @author IST- LOJA
 */
public class Equipo extends Deportes {
    private int Numerodejugadores;
    private String Nombredelcapitan;
    private float Primertiempo;
    private int Numerodecamiseta;
    private String nombredelcampeonato;

    public Equipo(String juventus, int i, String turin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumerodejugadores() {
        return Numerodejugadores;
    }

    public Equipo(int Numerodejugadores, String Nombredelcapitan, float Primertiempo, int Numerodecamiseta, String nombredelcampeonato, String NumbredelEquipo, float Tiempo, String DirectorTecnico, String Localidad, String Ambiente) {
        super(NumbredelEquipo, Tiempo, DirectorTecnico, Localidad, Ambiente);
        this.Numerodejugadores = Numerodejugadores;
        this.Nombredelcapitan = Nombredelcapitan;
        this.Primertiempo = Primertiempo;
        this.Numerodecamiseta = Numerodecamiseta;
        this.nombredelcampeonato = nombredelcampeonato;
    }

    public void setNumerodejugadores(int Numerodejugadores) {
        this.Numerodejugadores = Numerodejugadores;
    }

    public String getNombredelcapitan() {
        return Nombredelcapitan;
    }

    public void setNombredelcapitan(String Nombredelcapitan) {
        this.Nombredelcapitan = Nombredelcapitan;
    }

    public float getPrimertiempo() {
        return Primertiempo;
    }

    public void setPrimertiempo(float Primertiempo) {
        this.Primertiempo = Primertiempo;
    }

    public int getNumerodecamiseta() {
        return Numerodecamiseta;
    }

    public void setNumerodecamiseta(int Numerodecamiseta) {
        this.Numerodecamiseta = Numerodecamiseta;
    }

    public String getNombredelcampeonato() {
        return nombredelcampeonato;
    }

    public void setNombredelcampeonato(String nombredelcampeonato) {
        this.nombredelcampeonato = nombredelcampeonato;
    }

    public boolean getNumerotitulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

 