import java.util.ArrayList;
import java.util.Scanner;

class GestorLista {
    private ArrayList<String> elementos;

    public GestorLista() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
        System.out.println("Elemento agregado correctamente.");
    }

    public void eliminarPorIndice(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            String eliminado = elementos.remove(indice);
            System.out.println("Elemento eliminado: " + eliminado);
        } else {
            System.out.println("Índice inválido. No existe ese elemento.");
        }
    }

    public void mostrarElementos() {
        if (elementos.isEmpty()) {
            System.out.println("\nLa lista está vacía.");
        } else {
            System.out.println("\nElementos actuales:");
            for (int i = 0; i < elementos.size(); i++) {
                System.out.println("[" + i + "] " + elementos.get(i));
            }
        }
    }
}

public class MenuArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorLista gestor = new GestorLista();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = sc.nextLine();
                    gestor.agregarElemento(elemento);
                    break;

                case 2:
                    gestor.mostrarElementos();
                    System.out.print("Ingrese el índice a eliminar: ");
                    int indice = sc.nextInt();
                    gestor.eliminarPorIndice(indice);
                    break;

                case 3:
                    gestor.mostrarElementos();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}