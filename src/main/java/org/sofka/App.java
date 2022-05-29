package org.sofka;

import org.sofka.utilities.Perro;
import org.sofka.utilities.Gato;

/**
 * Clase encargada de realizar le ejecion de todos las clases 
 * E implementarlas para su correcta ejercución
 * @author Hernan Velasquez
 * @version 27/05/2022/A
 */

public class App 
{

    // Atributos de la clase
    private static Perro dog = new Perro();
    private static Gato cat = new Gato();
    /** 
     * Metodo principal, encargado de llamar a la funcion de la clase 
     * La cual esta encargada crear las inicializaciones
    */
    public static void main( String[] args )
    {
        init();
    }

    /**
     * Metodo privado, encargado de realizar el llamaod a los metodos
     * de los objetos y usar los metodos.
     */
    private static void init(){
       dog.animalInformation();
       dog.slepp();
       dog.toEat();
       dog.run();

       cat.animalInformation();
       cat.slepp();
       cat.toEat();
       cat.run();
       cat.rontoneo();
    }
}
