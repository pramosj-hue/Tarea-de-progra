import java.util.ArrayList;
import java.util.Scanner;

class ListaElementos {
    private ArrayList<String> elementos;

    public ListaElementos() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public void mostrarElementos() {
        System.out.println("\nElementos ingresados:");
        for (String e : elementos) {
            System.out.println("- " + e);
        }
    }

    public int obtenerCantidad() {
        return elementos.size();
    }
}

public class GestorElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaElementos gestor = new ListaElementos();
        String entrada;

        System.out.println("Ingrese elementos (escriba 'fin' para terminar):");

        do {
            System.out.print("Elemento: ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                gestor.agregarElemento(entrada);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        gestor.mostrarElementos();
        System.out.println("Total de elementos ingresados: " + gestor.obtenerCantidad());

        sc.close();
    }
}