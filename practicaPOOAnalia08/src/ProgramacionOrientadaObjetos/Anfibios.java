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
public class Anfibios extends Animal {
  private String pielfinayhumeda;
  private String Vertebrados;

    public Anfibios() {
    }

    public Anfibios(String pielfinayhumeda, String Vertebrados) {
        this.pielfinayhumeda = pielfinayhumeda;
        this.Vertebrados = Vertebrados;
    }

    public String getPielfinayhumeda() {
        return pielfinayhumeda;
    }

    public void setPielfinayhumeda(String pielfinayhumeda) {
        this.pielfinayhumeda = pielfinayhumeda;
    }

    public String getVertebrados() {
        return Vertebrados;
    }

    public void setVertebrados(String Vertebrados) {
        this.Vertebrados = Vertebrados;
    }
  
}
