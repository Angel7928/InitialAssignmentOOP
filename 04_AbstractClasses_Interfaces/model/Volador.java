//package model;

public class Volador extends Animal {
    public Volador(String nombre, int edad) {
        super(nombre);
        super(edad);
    }
    
    void volar() {
        System.out.println(nombre + " puede volar.");
    }
}