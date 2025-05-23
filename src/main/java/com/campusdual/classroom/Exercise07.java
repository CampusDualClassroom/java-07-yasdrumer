package com.campusdual.classroom;

import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(8);
        positionInAList(20);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(5);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i >= 0; i--) {
            list.add(i);
        }
        int index = list.indexOf(num);
        if (index != -1) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + index);
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " numeros positivos es: " + sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros numeros positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
