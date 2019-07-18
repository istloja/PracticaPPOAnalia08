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
public class Reptiles extends Animal{
    private String escamas;
    private String Vertebrados;

    public Reptiles() {
    }

    public Reptiles(String escamas, String Vertebrados) {
        this.escamas = escamas;
        this.Vertebrados = Vertebrados;
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    public String getVertebrados() {
        return Vertebrados;
    }

    public void setVertebrados(String Vertebrados) {
        this.Vertebrados = Vertebrados;
    }
    
    
}
