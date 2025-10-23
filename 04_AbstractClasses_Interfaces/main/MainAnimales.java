package main;
import java.util.ArrayList;
import model.Animal;
import model.Gato;
import model.Perro;
import model.Volador;
import model.Nadador;

public class MainAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Mina", 2));
        animales.add(new Perro("Rex", 5));
        animales.add(new Gato("Luna", 1));
        //animales.add(new Pajaro("Piolin", 4));
        //animales.add(new Pez("Nemo", 0));

        for (int i=0;i< animales.size();i++) {
            Animal ani = animales.get(i);
            ani.mostrarInfo();
            ani.comer();
            ani.hacerSonido();
            System.out.println("-------------------");
        }

        Volador volador = new Volador("Águila", 5);
        volador.volar();

        Nadador nadador = new Nadador("Delfín", 8);
        nadador.nadar();
    }
}
