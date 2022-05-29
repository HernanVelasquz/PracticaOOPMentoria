package org.sofka.utilities.abstractions;

import org.jboss.logging.Logger;

/**
 * Clase encargada de inicializar los atributos que necesitara cada clase 
 * que extienda de ella. 
 * @author Hernan Velasquez
 * @version 27/05/2022/A
 */
public abstract class AnimalAbstact {
    
    protected static final Logger logger = Logger.getLogger(AnimalAbstact.class);
    
    // Atributos de la clase
    protected String name;
    protected String rice;
    protected String color;
    protected Double age;
    
}
