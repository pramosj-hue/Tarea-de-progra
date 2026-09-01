import java.util.ArrayList;
import java.util.Random;

class GestorAleatorios {
    private ArrayList<Integer> numeros;

    public GestorAleatorios() {
        numeros = new ArrayList<>();
    }

    public void generarNumeros(int cantidad, int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
            numeros.add(numero);
        }
    }

    public void mostrarNumeros() {
        System.out.println("\nNúmeros generados:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}

public class NumerosAleatorios {
    public static void main(String[] args) {
        GestorAleatorios gestor = new GestorAleatorios();

        gestor.generarNumeros(20, 1, 100);
        gestor.mostrarNumeros();
    }
}