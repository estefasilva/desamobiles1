package EjerciciosDeClase;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cosasFavoritas = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar una cosa favorita");
            System.out.println("2. Mostrar todas las cosas favoritas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una cosa favorita: ");
                    String cosa = sc.nextLine();
                    cosasFavoritas.add(cosa);
                    System.out.println("Cosa favorita agregada con éxito.");
                    break;
                case 2:
                    System.out.println("Cosas favoritas:");
                    for (String favorita : cosasFavoritas) {
                        System.out.println(favorita);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }













}
