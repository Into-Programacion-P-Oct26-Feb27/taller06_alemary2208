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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.print("Seleccione tipo de auto: (1: Vehiculo liviano particular , 2: Vehiculo grande particular, "
                + "3: Taxi, 4: Bus urbano): ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese su nombre: ");
        String propetario = entrada.nextLine();
        System.out.print("Ingrese el avaluo: ");
        double avaluo = entrada.nextDouble();
        
        boolean opcionValida = true;
        String nombreVehiculo = "";
        double resultado = 0;
        double porcentaje = 0;
        double precioFijo = 0;
        double recargo = 0;
        double valorBase = 0;
        
        switch (opcion) {
                case 1:
                    nombreVehiculo = "Vehículo liviano particular";
                    porcentaje = 0.01/100;
                    precioFijo = 2.00;
                    valorBase = (avaluo * porcentaje) + precioFijo;
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    } else {
                         recargo = 0;
                    }
                    resultado = valorBase + recargo;
                    break;
                case 2:
                    nombreVehiculo = "Vehículo grande particular";
                    porcentaje = 0.02/100;
                    precioFijo = 2.50;
                    valorBase = (avaluo * porcentaje) + precioFijo;
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    } else {
                         recargo = 0;
                    }
                    resultado = valorBase + recargo;
                    break;
                case 3:
                    nombreVehiculo = "Taxi";
                    porcentaje = 0.04/100;
                    precioFijo = 1.50;
                    valorBase = (avaluo * porcentaje) + precioFijo;
                    recargo = 0;
                    resultado = valorBase;;
                    break;
                case 4:
                        nombreVehiculo = "Bus urbano";
                    porcentaje = 0.05/100;
                    precioFijo = 2.20;
                    valorBase = (avaluo * porcentaje) + precioFijo;
                    recargo = 0;
                resultado = valorBase;
                    break;

                default:
                    System.out.println("La opcion seleccionada no es valida.");
                    opcionValida = false;
                    break;
            }

            if (opcionValida) {
                System.out.printf("\nPeaje \"Buena Via\"\n"
                        + "Propetario: %s\n"
                        + "Tipo: %s\n\n"
                        + "Avaluo: %.2f\n"
                        + "Valor base del peaje: %.2f\n"
                        + "Recargo: %.2f\n\n"
                        + "Total a cancelar: %.2f\n", propetario, nombreVehiculo, 
                        avaluo, valorBase, recargo, resultado);
            }else {
            System.out.println("No es valido el reporte:");
    }
    
}
}
