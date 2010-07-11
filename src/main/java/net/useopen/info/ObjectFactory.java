package net.useopen.info;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes
     * 
     */
    public ObjectFactory() 
    {
    }
    
    /**
     * Create an instance of {@link Useopen }
     * 
     * @return Useopen Useopen
     */
    public Useopen createDefinition()
    {
       return new Useopen();
    }
}
