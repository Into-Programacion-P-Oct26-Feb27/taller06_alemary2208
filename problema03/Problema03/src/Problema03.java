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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.print("Ingrese el nombre del empleado: ");
        String empleado = entrada.nextLine();
        System.out.print("Ingrese el tipo de empleado: ");
        int tipoEmpleado = entrada.nextInt();
        System.out.print("Ingrese los años de servicio: ");
        int aniosServicio = entrada.nextInt();
        System.out.print("Ingrese el sueldo inicial: ");
        double sueldoInicial = entrada.nextDouble();

        double porcentaje = 0;
        int porcentajeTexto = 0;
        double bonificacion = 0;
        double incrementoSalarial = 0;
        double nuevoSueldo = 0;

        switch (tipoEmpleado) {
            case 1:
                porcentaje = 0.05;
                porcentajeTexto = 5;
                break;
            case 2:
                porcentaje = 0.07;
                porcentajeTexto = 7;
                break;
            case 3:
                porcentaje = 0.09;
                porcentajeTexto = 9;
                break;
            case 4:
                porcentaje = 0.12;
                porcentajeTexto = 12;
                break;
            default:
                porcentaje = 0.15;
                porcentajeTexto = 15;
                break;
        }

        if (aniosServicio < 2) {
            bonificacion = 0.00;
        } else{
            if (aniosServicio >= 2 && aniosServicio < 5) {
            bonificacion = 30.00;
        } else {
            if (aniosServicio >= 5 && aniosServicio < 10) {
            bonificacion = 60.00;
        } else {
            bonificacion = 100.00;
        }

        incrementoSalarial = sueldoInicial * porcentaje;
        nuevoSueldo = sueldoInicial + incrementoSalarial + bonificacion;

        System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %d%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                empleado, tipoEmpleado, aniosServicio, sueldoInicial,
                porcentajeTexto, incrementoSalarial, bonificacion, nuevoSueldo);
    }
}
    }
}
