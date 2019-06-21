/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooanalia08.Metodos.clase2;

/**
 *
 * @author IST- LOJA
 */
public class Proveedor extends Persona {
    private String VentadeProductos;
    private String EntregaDeProductos;

    public String getVentadeProductos() {
        return VentadeProductos;
    }

    public void setVentadeProductos(String VentadeProductos) {
        this.VentadeProductos = VentadeProductos;
    }

    public String getEntregaDeProductos() {
        return EntregaDeProductos;
    }

    public void setEntregaDeProductos(String EntregaDeProductos) {
        this.EntregaDeProductos = EntregaDeProductos;
    }
    
    public void vender(){
        System.out.println("Tengo variedad de productos");
   
    }
    public static void main(String[] args) {
        Proveedor objeto=new Proveedor();
        objeto.vender();
        
    }
        
    
    
}
