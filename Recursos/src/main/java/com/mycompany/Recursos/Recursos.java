/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursos;

/**
 *
 * @author gesle
 */
public class Recursos {

    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2021";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "David Gomez es mayor de edad";
        }
        return "David Gomez es menor de edad";
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int[] generarLista(int limite) {
        int[] numeros = new int[limite];
        for (int i = 0; i < limite; i++) {
            numeros[i] = i + 1;
        }
        return numeros;
    }

    public static void main(String[] args) {
        Recursos instancia = new Recursos();

        System.out.println(instancia.obtenerMensaje());
        System.out.println(instancia.verificarEdad(20));
        System.out.println("Resultado de multiplicacion: " + instancia.multiplicar(5, 3));

        int[] lista = instancia.generarLista(10);
        System.out.print("Lista generada: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
