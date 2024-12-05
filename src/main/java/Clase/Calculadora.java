/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import java.util.Stack;

/**
 *
 * @author USUARIO
 */
public class Calculadora {

    private Stack<Integer> pilaRealizadas;
    private Stack<Integer> pilaDeshechas;
    private int resultadoActual;

    //constructor
    public Calculadora() {
        pilaRealizadas = new Stack<>();
        pilaDeshechas = new Stack<>();
        resultadoActual = 0;
    }

    // metodo sumar
    public void sumar(int numero) {
        resultadoActual += numero;
        pilaRealizadas.push(numero);
        pilaDeshechas.clear();
        System.out.println("Operacion realizada: " + numero + ". Resultado actual: " + resultadoActual);
    }

    public void deshacer() {
        if (!pilaRealizadas.isEmpty()) {
            int ultimoNumero = pilaRealizadas.pop();
            resultadoActual -= ultimoNumero;
            pilaDeshechas.push(ultimoNumero);
            System.out.println("Operación deshecha: " + ultimoNumero + ". Resultado actual: " + resultadoActual);
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }

   public void rehacer() {
        if (!pilaDeshechas.isEmpty()) {
            pilaRealizadas.push(resultadoActual);
            resultadoActual = pilaDeshechas.pop();
        } else {
            System.out.println("No hay operaciones para rehacer.");
        }
    }
   
    public int getResultadoActual() {
        return resultadoActual;
    }

}
