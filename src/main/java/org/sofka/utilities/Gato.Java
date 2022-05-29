package org.sofka.utilities;

import org.sofka.utilities.abstractions.AnimalAbstact;
import org.sofka.utilities.interfaces.AnimalInterfaces;

public class Gato extends AnimalAbstact implements AnimalInterfaces {
    public Gato(){
        name = "Michitu";
        rice = "Angula";
        color = "Naranja";
        age = 1.0;
    }

    /**
     * Metodo encarado de ralizar las acciones de la clase Gato
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
     * Metodo de la clase encargado de realzar la informacion de la clase gato
     */
    @Override
    public void animalInformation() {
        logger.info(this.name + " Tiene " + age.toString() + " es de color " + color + " y es de rasa " + rice);
    
    }

    public void rontoneo(){
        logger.info(this.name + " Esta ronroneando");
    }
}