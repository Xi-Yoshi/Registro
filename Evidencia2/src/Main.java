//Ximena Restrepo Grisales
//Sebastian Rivera
//Yessenia Montoya

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido: ");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese el género (Masculino/Femenino): ");
            String genero = scanner.nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        System.out.println("\nNombres y géneros de las personas: ");
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + ", Género: " + p.getGenero());
        }

        System.out.println("\nPromedio de edades: " + calcularPromedioEdad(personas));

        System.out.println("Cantidad de personas de género Masculino: " + contarPorGenero(personas, "Masculino"));
        System.out.println("Cantidad de personas de género Femenino: " + contarPorGenero(personas, "Femenino"));
    }

    public static double calcularPromedioEdad(Persona[] personas) {
        int suma = 0;
        for (Persona p : personas) {
            suma += p.getEdad();
        }
        return (double) suma / personas.length;
    }

    public static int contarPorGenero(Persona[] personas, String genero) {
        int contador = 0;
        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }
}