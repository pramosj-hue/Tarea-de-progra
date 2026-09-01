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
}

public class ListaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorNumeros gestor = new GestorNumeros();

        System.out.println("Ingrese 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            gestor.agregarNumero(num);
        }

        gestor.mostrarNumeros();

        sc.close();
    }
}