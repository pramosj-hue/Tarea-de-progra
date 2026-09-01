import java.util.ArrayList;
import java.util.Scanner;

class GestorNombres {
    private ArrayList<String> nombres;

    public GestorNombres() {
        nombres = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public void recorrerLista() {
        System.out.println("\nLista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

public class ListaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorNombres gestor = new GestorNombres();
        String entrada;

        System.out.println("Ingrese nombres (escriba 'fin' para terminar):");

        do {
            System.out.print("Nombre: ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                gestor.agregarNombre(entrada);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        gestor.recorrerLista();

        sc.close();
    }
}