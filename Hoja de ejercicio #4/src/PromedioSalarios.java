import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nombre + " - Q" + salario;
    }
}

class GestorEmpleados {
    private ArrayList<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("\nEmpleados registrados:");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public double calcularPromedioSalarios() {
        if (empleados.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }
}

public class PromedioSalarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
        String opcion;

        do {
            System.out.print("\nIngrese nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese salario: ");
            double salario = Double.parseDouble(sc.nextLine());

            Empleado empleado = new Empleado(nombre, salario);
            gestor.agregarEmpleado(empleado);

            System.out.print("¿Desea ingresar otro empleado? (si/no): ");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("si"));

        gestor.mostrarEmpleados();

        double promedio = gestor.calcularPromedioSalarios();
        System.out.printf("\nEl promedio de salarios es: Q%.2f%n", promedio);

        sc.close();
    }
}