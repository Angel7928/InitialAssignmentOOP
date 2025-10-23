package model;

public class Nadador extends Animal {
    public Nadador(String nombre, int edad) {
        super(nombre);
        super(edad);
    }

    void nadar() {
        System.out.println(nombre + " puede nadar.");
    }
    
}
