package 03_Inheritance.model;

public class Empleado {
    private string nombre;
    private double salarioBase = 0;

    public Empleado(string nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
    }
}
