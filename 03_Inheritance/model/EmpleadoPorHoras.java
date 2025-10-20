package 03_Inheritance.model;

public class EmpleadoPorHoras extends Empleado {
    private int horasExtra;
    private double salarioHorasExtra;

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
