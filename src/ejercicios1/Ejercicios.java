/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author turupawn
 */
public class Ejercicios {

    static int sumar(int x, int y) {
        return x + y;
    }

    static int restar(int x, int y) {
        return x - y;
    }

    static int multiplicar(int x, int y) {
        return x * y;
    }

    static int residuo(int x, int y) {

        return x % y;
    }

    static boolean esPar(int x) {

        return x % 2 == 0;
    }

    static boolean esMultiploDe3(int x) {
        return x % 3 == 0;
    }

    static int getMayor(int x, int y) {
        int respuesta;
        if (x > y) {
            respuesta = x;
        } else {
            respuesta = y;
        }

        return respuesta;

    }

    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    static boolean sonPares(int x, int y, int z) {
        return x % 2 == 0 && y % 2 == 0 && z % 2 == 0;
    }

    static int getMayorDe3(int x, int y, int z) {
        int respuesta;
        if (x > y && x > z) {
            respuesta = x;
        } else if (y > z) {
            respuesta = y;
        } else {
            respuesta = z;
        }

        return respuesta;

    }

}
