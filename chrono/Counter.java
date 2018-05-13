/**
 * @file:    Counter.java
 * @package: helpers.chrono
 *
 * @proyect: TaskTimer
 * @author:  Moisés Alcocer, 2018
 * @link:    https://www.ironwoods.es
 * @license: http://www.apache.org/licenses/ - Apache License 2.0
 *
 */
package pruebas.chrono;

public class Counter {

    /**
     * Stops the execution during a second after to be called
     * 
     * @param seconds 
     */
    public static void delaySeconds(int seconds) {
        int ms = seconds * 1000;

        try {
            Thread.sleep(ms);
        } catch(InterruptedException e) {}
    }

    public static void delayOneSecond() {

        Counter.delaySeconds(1);
    }

} //class
