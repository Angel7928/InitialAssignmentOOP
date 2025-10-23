package model;
import Nadador;

public class Pez extends Animal {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    void nadar() {
        System.out.println(nombre + " puede nadar.");
    }
}
