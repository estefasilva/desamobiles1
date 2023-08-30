package EjerciciosDeClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> ingresos = new ArrayList<>();
        ArrayList<Double> egresos = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar egreso");
            System.out.println("3. Mostrar ingresos");
            System.out.println("4. Mostrar egresos");
            System.out.println("5. Calcular balance");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el monto del ingreso: ");
                    double montoIngreso = sc.nextDouble();
                    ingresos.add(montoIngreso);
                    System.out.println("Ingreso registrado con éxito.");
                }
                case 2 -> {
                    System.out.print("Ingrese el monto del egreso: ");
                    double montoEgreso = sc.nextDouble();
                    egresos.add(montoEgreso);
                    System.out.println("Egreso registrado con éxito.");
                }
                case 3 -> {
                    System.out.println("Ingresos:");
                    for (double ingreso : ingresos) {
                        System.out.println("$" + ingreso);
                    }
                }
                case 4 -> {
                    System.out.println("Egresos:");
                    for (double egreso : egresos) {
                        System.out.println("$" + egreso);
                    }
                }
                case 5 -> {
                    double totalIngresos = calcularTotal(ingresos);
                    double totalEgresos = calcularTotal(egresos);
                    double balance = totalIngresos - totalEgresos;
                    System.out.println("Balance: $" + balance);
                    if (balance >= 0) {
                        System.out.println("Tiene un balance positivo.");
                    } else {
                        System.out.println("Tiene un balance negativo.");
                    }
                }
                case 6 -> {
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static double calcularTotal(ArrayList<Double> lista) {
        double total = 0;
        for (double valor : lista) {
            total += valor;
        }
        return total;
    }










}

