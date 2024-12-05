/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practicamvc.erika2025;

import Clase.Calculadora;
import java.util.Scanner;

public class Erika2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String opcion;
        int numero;

        do {
            System.out.println("\nResultado actual: " + calculadora.getResultadoActual());
            System.out.println("Elige una opción: sumar, deshacer, rehacer, salir");
            opcion = scanner.next();

            switch (opcion) {
                case "sumar":
                    System.out.println("Ingrese un número:");
                    numero = scanner.nextInt();
                    calculadora.sumar(numero);
                    break;
                case "deshacer":
                    calculadora.deshacer();
                    break;
                case "rehacer":
                    calculadora.rehacer();
                    break;
                case "salir":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("salir"));

        scanner.close();
    }
}
