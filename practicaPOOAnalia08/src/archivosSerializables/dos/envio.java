/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables.dos;

/**
 *
 * @author IST- LOJA
 */
public class envio {
    public int fechaenvio;
    public String Direccionenvio;
    private String direccionenvio;

    public envio() {
    }

    public envio(int fechaenvio, String Direccionenvio) {
        this.fechaenvio = fechaenvio;
        this.Direccionenvio = Direccionenvio;
    }

    public int getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(int fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getDireccionenvio() {
        return Direccionenvio;
    }

    public void setDireccionenvio(String Direccionenvio) {
        this.Direccionenvio = Direccionenvio;
    }
    public void envio(int fecaenvio, String direccionenvio){
        this.fechaenvio= fechaenvio;
        this. direccionenvio = direccionenvio;
    }
}
