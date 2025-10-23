//package model;

public class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre);
        super(edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pío pío!");
    }

    void volar() {
        System.out.println(nombre + " puede volar.");
    }
}
