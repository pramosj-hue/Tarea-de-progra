import java.util.ArrayList;
import java.util.Scanner;

class GestorCalificaciones {
    private ArrayList<Double> calificaciones;

    public GestorCalificaciones() {
        calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }

    public void mostrarCalificaciones() {
        System.out.println("\nCalificaciones ingresadas:");
        for (double c : calificaciones) {
            System.out.println(c);
        }
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double c : calificaciones) {
            suma += c;
        }
        return suma / calificaciones.size();
    }
}

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorCalificaciones gestor = new GestorCalificaciones();
        String entrada;

        System.out.println("Ingrese calificaciones (escriba 'fin' para terminar):");

        do {
            System.out.print("Calificación: ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                double calificacion = Double.parseDouble(entrada);
                gestor.agregarCalificacion(calificacion);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        gestor.mostrarCalificaciones();

        double promedio = gestor.calcularPromedio();
        System.out.printf("\nEl promedio es: %.2f%n", promedio);

        sc.close();
    }
}