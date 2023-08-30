package EjerciciosDeClase;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ingresos = 0;
        double egresos = 0;
        System.out.println("ingrese los ingresos(0 para finalizar):");
        double ingreso = scanner.nextDouble();
        while (ingreso >= 0) {
            ingresos = ingreso;
            System.out.println("ingreso registrado:" + ingreso);
            System.out.println("ingrese los ingresos (0 para finalizar):");
            ingreso = scanner.nextDouble();
        }
        System.out.println("ingrese los egresos (0 para finalizar):");
        double egreso = scanner.nextDouble();
        while (egreso >= 0) {
            egresos = egreso;
            System.out.println("egreso registrado: " + egreso);
            System.out.println("ingrese los egresos (0 para finalizar):");
            egreso = scanner.nextDouble();
        }
        double balance = ingresos - egresos;
        System.out.println("el balance es positivo");
        if (balance < 0) {
            System.out.println(" el balance es negativo");
        } else {
            System.out.println("el balance es cero");
        }
    }
}





