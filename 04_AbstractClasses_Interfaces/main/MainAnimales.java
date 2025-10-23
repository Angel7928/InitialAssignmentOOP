//package main;
import java.util.ArrayList;
import model.Animal;
import model.Gato;
import model.Perro;
import model.Pajaro;
import model.Pez;
import model.Nadador;
import model.Volador;

public class MainAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Misu"));
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Luna"));

        for (int i=0;i< animales.size();i++) {
            Animal a = animales.get(i);
            a.mostrarInfo();
            a.comer();
            a.hacerSonido();
        }
    }
}
