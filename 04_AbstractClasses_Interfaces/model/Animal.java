package model;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    public abstract void hacerSonido();
}
