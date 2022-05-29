package org.sofka.utilities;

import org.sofka.utilities.interfaces.AnimalInterfaces;
import org.sofka.utilities.abstractions.AnimalAbstact;

/**
 * Clase perro, la cual describe a un perro, con programación orientada a Objetos
 * aplicando sobre escritura de metodos (Polimorfismo), la clase implemena 
 * una interfaz la cual tiene especificad 4 metodos que podra usar un objero de la clase 
 * Perro.
 * @author Hernan Velasquez
 * @version 27/05/2022/A
 */

public class Perro extends AnimalAbstact implements AnimalInterfaces {

    /**
     * Contructor el cual iniializa los atributos del perro.
     */
    public Perro(){
        name = "Firulis";
        rice = "husky";
        color = "Blanco";
        age = 2.0;
    }

    /**
     * Metodo encarado de ralizar las acciones del perro
     */
    @Override
    public void slepp() {
        logger.info(this.name + " Esta durmiendo");
    }

    @Override
    public void toEat() {
        logger.info(this.name + " Esta comiendo");
        
    }

    @Override
    public void run() {
        logger.info(this.name + " Esta corriendo");
    }

    /**
     * Metodo de la clase encargado de realzar la informacion de la clase Gato
     */
    @Override
    public void animalInformation() {
        logger.info(this.name + " Tiene " + age.toString() + " es de color " + color + " y es de rasa " + rice);
    }
    
}
