package org.sofka.utilities;

import org.sofka.utilities.interfaces.AnimalInterfaces;
import org.sofka.utilities.abstractions.AnimalAbstact;

/**
 * Clase perro, la cual describe a un perro, con programación orientada a Objetos
 * Pe
 */

public class Perro extends AnimalAbstact implements AnimalInterfaces {

    private String name;
    private String rice;
    private String color;
    private Double age;

    public Perro(){
        name = "Firulis";
        rice = "husky";
        color = "Blanco";
        age = 2.0;
    }

    @Override
    public void slepp() {
        logger.info(this.name + "Esta durmiendo");
    }

    @Override
    public void toEat() {
        logger.info(this.name + "Esta comiendo");
        
    }

    @Override
    public void run() {
        logger.info(this.name + "Esta corriendo");
        
    }

    @Override
    public void animalInformation() {
        logger.info(this.name + " Tiene " + age.toString() + " es de color " + color + " y es de rasa " + rice);
    }
    
}
