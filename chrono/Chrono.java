/**
 * @file:    Chrono.java
 * @package: helpers.chrono
 *
 * @proyect: TaskTimer
 * @author:  Moisés Alcocer, 2018
 * @link:    https://www.ironwoods.es
 * @license: http://www.apache.org/licenses/ - Apache License 2.0
 *
 */
package pruebas.chrono;

public class Chrono {

    private static int hour      = 0;
    private static int minute    = 0;
    private static int second    = 0;


    /**
     * Gets a string with actual time every second
     *
     * @return
     */
    public static String getCount() {

        while (true) {
            Counter.delayOneSecond();
            Chrono.second += 1;

            if (Chrono.second == 60) {
                Chrono.second = 0;
                Chrono.minute += 1;

                if (Chrono.minute == 60) {
                    Chrono.minute = 0;
                    Chrono.hour += 1;
                }
            }

            return Chrono.count(Chrono.hour, Chrono.minute, Chrono.second);
        }
    }

    /**
     * Resets properties
     *
     */
    public static void reset() {
        Chrono.hour   = 0;
        Chrono.minute = 0;
        Chrono.second = 0;
    }

    /**
     * Gets a string with actual time
     * Format: hh:mm:ss
     *
     * @param h
     * @param m
     * @param s
     * @return
     */
    private static String count(int h, int m, int s) {

        return (h < 10 ? "0" : "") + h + ":"
            + ( m < 10 ? "0" : "") + m + ":"
            + ( s < 10 ? "0" : "") + s;
    }

} // class
