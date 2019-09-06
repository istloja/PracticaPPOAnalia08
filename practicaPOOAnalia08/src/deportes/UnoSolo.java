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
public class UnoSolo extends Deportes {
    private String categoria;
    private String TipodeRopa;
    private boolean Fisico;
    private String Ruta;
    private String Ciudad_representada;

    public UnoSolo() {
    }

    public UnoSolo(String categoria, String TipodeRopa, boolean Fisico, String Ruta, String Ciudad_representada, String NumbredelEquipo, float Tiempo, String DirectorTecnico, String Localidad, String Ambiente) {
        super(NumbredelEquipo, Tiempo, DirectorTecnico, Localidad, Ambiente);
        this.categoria = categoria;
        this.TipodeRopa = TipodeRopa;
        this.Fisico = Fisico;
        this.Ruta = Ruta;
        this.Ciudad_representada = Ciudad_representada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipodeRopa() {
        return TipodeRopa;
    }

    public void setTipodeRopa(String TipodeRopa) {
        this.TipodeRopa = TipodeRopa;
    }

    public boolean isFisico() {
        return Fisico;
    }

    public void setFisico(boolean Fisico) {
        this.Fisico = Fisico;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getCiudad_representada() {
        return Ciudad_representada;
    }

    public void setCiudad_representada(String Ciudad_representada) {
        this.Ciudad_representada = Ciudad_representada;
    }
    
            
    
}
////