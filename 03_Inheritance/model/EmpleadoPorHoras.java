package model;

public class EmpleadoPorHoras extends Empleado {
    private int horasExtra;
    private double salarioHorasExtra;

public EmpleadoPorHoras(String nombre, double salarioBase, int horasExtra, double salarioHorasExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
        this.salarioHorasExtra = salarioHorasExtra;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double salarioExtra = horasExtra * salarioHorasExtra;
        return salarioBase + salarioExtra;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Salario por Hora Extra: " + salarioHorasExtra);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
