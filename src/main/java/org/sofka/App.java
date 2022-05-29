package org.sofka;

import org.sofka.utilities.Perro;
import org.sofka.utilities.Gato;

/**
 * Hello world!
 *
 */
public class App 
{
    static Perro dog = new Perro();
    static Gato gat = new Gato();
    public static void main( String[] args )
    {
        init();
    }

    private static void init(){
       dog.animalInformation();
       dog.slepp();
       dog.toEat();
       dog.run();
    }
}
