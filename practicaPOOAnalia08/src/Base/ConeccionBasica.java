/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author IST- LOJA
 */
public class ConeccionBasica {
    public void leerBaseDatos (String usuario, String Clave) {
        try{
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection coneccion = DriverManager.getConnection("jdbc:mysql://localhost/ventas?characterEncodig=latin1",usuario,Clave);
            System.out.println(coneccion.getCatalog());
            Statement coneccion2 = coneccion.createStatement();
            ResultSet result =coneccion2.executeQuery("selec*from empleados");
            while(result.next()){
            System.out.println(result.getString("Nombre"));
       
        }
            
 
        }catch (Exception e){
            System.out.println("soy un error "+e);  }
        
    }
    public static void main(String[] args) {
       ConeccionBasica  objeto=new ConeccionBasica();
       objeto.leerBaseDatos("Analia","12131415");
        
    }
}
