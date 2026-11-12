/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.print("Ingrese el primer numero: ");
        double num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = entrada.nextDouble();
        System.out.print("Seleccione operación (1: suma, 2: resta, 3: multiplicacion, 4: division, 5: modulo, 6: potencia): ");
        int opcion = entrada.nextInt();

        boolean operacionValida = true;
        String nombreOperacion = "";
        double resultado = 0;

        if (num1 > num2) {

            switch (opcion) {
                case 1:
                    nombreOperacion = "Suma";
                    resultado = num1 + num2;
                    break;
                case 2:
                    nombreOperacion = "Resta";
                    resultado = num1 - num2;
                    break;
                case 3:
                    nombreOperacion = "Multiplicacion";
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        nombreOperacion = "Division";
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir para cero.");
                        operacionValida = false;
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        nombreOperacion = "Modulo";
                        resultado = num1 % num2;
                    } else {
                        System.out.println("Error: No se puede calcular el modulo con cero.");
                        operacionValida = false;
                    }
                    break;
                case 6:
                    nombreOperacion = "Potencia";
                    resultado = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida.");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.printf("\nOPERACIONES ARITMÉTICAS\n\n"
                        + "Primer numero: %.2f\n"
                        + "Segundo numero: %.2f\n"
                        + "Operacion seleccionada: %s\n\n"
                        + "Resultado: %.2f\n", num1, num2, nombreOperacion, resultado);
            }

        } else {
            System.out.println("No es posible realizar la operacion:");
        }
    }
}

