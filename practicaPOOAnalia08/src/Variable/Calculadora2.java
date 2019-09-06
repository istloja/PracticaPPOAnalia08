/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable;

import java.util.Scanner;

/**
 *
 * @author IST- LOJA
 */
public class Calculadora2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        int n1;
        int n2;
        int r;
        System.out.println("Operacion que quieras  realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingresaste a la suma");
                System.out.println("Escribe el primer numero");
                n1 = leer.nextInt();
                System.out.println("Escribe el segundo numero");
                n2 = leer.nextInt();
                try {
                    r = n1 + n2;
                    System.out.println("La respuesta es: " + r);
                } catch (Exception e) {
                    System.out.println("Hay un error" + e);

                }
                break;
            case 2:
                System.out.println("Ingresaste a la suma");
                System.out.println("Escribe el primer numero");
                n1 = leer.nextInt();
                System.out.println("Escribe el segundo numero");
                n2 = leer.nextInt();
                try {
                    r = n1 - n2;
                    System.out.println("La respuesta es: " + r);
                } catch (Exception e) {
                    System.out.println("Hay un error" + e);

                }
                break;
            case 3:
                System.out.println("Ingresaste a la suma");
                System.out.println("Escribe el primer numero");
                n1 = leer.nextInt();
                System.out.println("Escribe el segundo numero");
                n2 = leer.nextInt();
                try {
                    r = n1 * n2;
                    System.out.println("La respuesta es: " + r);
                } catch (Exception e) {
                    System.out.println("Hay un error" + e);

                }
                break;
            case 4:
              System.out.println("Ingresaste a la suma");
                System.out.println("Escribe el primer numero");
                n1 = leer.nextInt();
                System.out.println("Escribe el segundo numero");
                n2 = leer.nextInt();
                try {
                    r = n1 / n2;
                    System.out.println("La respuesta es: " + r);
                } catch (Exception e) {
                    System.out.println("Hay un error" + e);

                }
                break;

        }

    }
}
