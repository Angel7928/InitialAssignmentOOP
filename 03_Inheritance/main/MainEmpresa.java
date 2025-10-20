package 03_Inheritance.main;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 160, 25);
        empleados[1] = new EmpleadoPorHoras("Luis", 20, 30);

        System.out.println("Detalles de Empleados:");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
            System.out.println("-----------------------");
        }
    }
}
