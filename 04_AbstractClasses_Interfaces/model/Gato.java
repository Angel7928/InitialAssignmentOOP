//package model;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre);
        super(edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau miau!");
    }
}
