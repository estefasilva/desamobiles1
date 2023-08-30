package EjerciciosDeClase;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario[][] matrizUsuarios = new Usuario[3][3]; // Matriz de 3x3 para almacenar usuarios
        int cantidadUsuarios = 0; // Contador de usuarios existentes

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un nuevo usuario");
            System.out.println("2. Mostrar todos los usuarios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                    if (cantidadUsuarios < 3 * 3) { // Verificar que la matriz no esté llena
                        System.out.println("Ingrese los datos del usuario:");
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine(); // Consumir la línea en blanco
                        System.out.print("Correo: ");
                        String correo = sc.nextLine();

                        Usuario nuevoUsuario = new Usuario(nombre, edad, correo);
                        matrizUsuarios[cantidadUsuarios / 3][cantidadUsuarios % 3] = nuevoUsuario;
                        cantidadUsuarios++;
                        System.out.println("Usuario agregado con éxito.");
                    } else {
                        System.out.println("La matriz de usuarios está llena.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de usuarios:");
                    for (int i = 0; i < cantidadUsuarios; i++) {
                        System.out.println("Usuario " + (i + 1) + ":");
                        System.out.println("Nombre: " + matrizUsuarios[i / 3][i % 3].getNombre());
                        System.out.println("Edad: " + matrizUsuarios[i / 3][i % 3].getEdad());
                        System.out.println("Correo: " + matrizUsuarios[i / 3][i % 3].getCorreo());
                        System.out.println();
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

class Usuario {
    private String nombre;
    private int edad;
    private String correo;

    public Usuario(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }
}
