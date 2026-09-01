import java.util.ArrayList;
import java.util.Scanner;

class GestorNumeros {
    private ArrayList<Integer> numeros;

    public GestorNumeros() {
        numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    public void mostrarNumeros() {
        System.out.println("\nNúmeros ingresados:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    public ArrayList<Integer> filtrarPares() {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }
        return pares;
    }
}

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorNumeros gestor = new GestorNumeros();
        String entrada;

        System.out.println("Ingrese números (escriba 'fin' para terminar):");

        do {
            System.out.print("Número: ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                int numero = Integer.parseInt(entrada);
                gestor.agregarNumero(numero);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        gestor.mostrarNumeros();

        ArrayList<Integer> pares = gestor.filtrarPares();

        System.out.println("\nNúmeros pares encontrados:");
        if (pares.isEmpty()) {
            System.out.println("No hay números pares en la lista.");
        } else {
            for (int p : pares) {
                System.out.println(p);
            }
        }

        sc.close();
    }
}