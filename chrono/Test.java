/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.chrono;

/**
 *
 * @author orici
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("Test -> impresión hasta 5 segundos");
        for (int i=0; i<5; i++) {
            System.out.println(Chrono.getCount( ));
        }

        Chrono.reset();
        System.out.println("Reiniciando -> impresión hasta 90 segundos");
        for (int i=0; i<90; i++) {
            System.out.println(Chrono.getCount( ));
        }

        System.out.println("Continua -> impresión 35 segundos más");
        for (int i=0; i<35; i++) {
            System.out.println(Chrono.getCount( ));
        }
    }

} // class
