package main;
import model.Empleado;
import model.EmpleadoPorHoras;
import model.EmpleadoTiempoCompleto;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 3000, 160, 25);
        empleados[1] = new EmpleadoPorHoras("Luis", 2000, 20, 30);

        System.out.println("Detalles de Empleados:");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
            System.out.println("-----------------------");
        }
    }
}
