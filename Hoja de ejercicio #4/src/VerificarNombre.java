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

    public boolean existeNombre(String nombre) {
        return nombres.contains(nombre);
    }

    public void mostrarNombres() {
        System.out.println("\nNombres en la lista:");
        for (String n : nombres) {
            System.out.println("- " + n);
        }
    }
}

public class VerificarNombre {
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

        gestor.mostrarNombres();

        System.out.print("\nIngrese el nombre que desea buscar: ");
        String buscado = sc.nextLine();

        if (gestor.existeNombre(buscado)) {
            System.out.println("El nombre \"" + buscado + "\" SÍ existe en la lista.");
        } else {
            System.out.println("El nombre \"" + buscado + "\" NO existe en la lista.");
        }

        sc.close();
    }
}