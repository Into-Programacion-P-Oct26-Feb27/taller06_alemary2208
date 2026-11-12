/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Seleccione operación (1: suma, 2: resta, 3: multiplicacion, 4: division, 5: modulo, 6: potencia): ");
        int opcion = entrada.nextInt();

        boolean operacionValida = true;
        String nombreOperacion = "";
        double resultado = 0;

        if (num1 > num2) {

            if (opcion == 1) {
                nombreOperacion = "Suma";
                resultado = num1 + num2;
            } else if (opcion == 2) {
                nombreOperacion = "Resta";
                resultado = num1 - num2;
            } else if (opcion == 3) {
                nombreOperacion = "Multiplicación";
                resultado = num1 * num2;
            } else if (opcion == 4) {
                if (num2 != 0) {
                    nombreOperacion = "División";
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir para cero.");
                    operacionValida = false;
                }
            } else if (opcion == 5) {
                if (num2 != 0) {
                    nombreOperacion = "Módulo";
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: No se puede calcular el módulo con cero.");
                    operacionValida = false;
                }
            } else if (opcion == 6) {
                nombreOperacion = "Potencia";
                resultado = Math.pow(num1, num2);
            } else {
                System.out.println("La opción seleccionada no es válida.");
                operacionValida = false;
            }

            if (operacionValida) {
                System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                        + "Primer número: %.2f\n"
                        + "Segundo número: %.2f\n"
                        + "Operación seleccionada: %s\n\n"
                        + "Resultado: %.2f\n", num1, num2, nombreOperacion, resultado);
            }

        } else {
            System.out.println("No es posible realizar la operación: el primer número debe ser mayor que el segundo.");
        }
    }
}

