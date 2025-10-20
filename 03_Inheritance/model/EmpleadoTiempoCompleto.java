package 03_Inheritance.model;

public class EmpleadoTiempoCompleto extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double salarioTiempoCompleto = horasTrabajadas * tarifaHora;
        return salarioBase + salarioTiempoCompleto;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por Hora: " + tarifaHora);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
