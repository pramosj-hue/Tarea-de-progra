import java.util.ArrayList;
import java.util.Scanner;

class GestorTareas {
    private ArrayList<String> pendientes;
    private ArrayList<String> completadas;

    public GestorTareas() {
        pendientes = new ArrayList<>();
        completadas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        pendientes.add(tarea);
        System.out.println("Tarea agregada correctamente.");
    }

    public void marcarCompletada(int indice) {
        if (indice >= 0 && indice < pendientes.size()) {
            String tarea = pendientes.remove(indice);
            completadas.add(tarea);
            System.out.println("Tarea marcada como completada: " + tarea);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < pendientes.size()) {
            String eliminada = pendientes.remove(indice);
            System.out.println("Tarea eliminada: " + eliminada);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarPendientes() {
        if (pendientes.isEmpty()) {
            System.out.println("\nNo hay tareas pendientes.");
        } else {
            System.out.println("\n--- Tareas pendientes ---");
            for (int i = 0; i < pendientes.size(); i++) {
                System.out.println("[" + i + "] " + pendientes.get(i));
            }
        }
    }

    public void mostrarCompletadas() {
        if (completadas.isEmpty()) {
            System.out.println("\nNo hay tareas completadas.");
        } else {
            System.out.println("\n--- Tareas completadas ---");
            for (String t : completadas) {
                System.out.println("- " + t);
            }
        }
    }
}

public class ControlTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Mostrar tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String tarea = sc.nextLine();
                    gestor.agregarTarea(tarea);
                    break;

                case 2:
                    gestor.mostrarPendientes();
                    System.out.print("Ingrese el índice de la tarea completada: ");
                    int indiceCompletar = sc.nextInt();
                    gestor.marcarCompletada(indiceCompletar);
                    break;

                case 3:
                    gestor.mostrarPendientes();
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int indiceEliminar = sc.nextInt();
                    gestor.eliminarTarea(indiceEliminar);
                    break;

                case 4:
                    gestor.mostrarPendientes();
                    break;

                case 5:
                    gestor.mostrarCompletadas();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 6);

        sc.close();
    }
}