package nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses;

import nhlstenden.oopsubstitute23.objects.propertyclasses.Property;

public class House extends Property implements propertyInterface { //class that creates House objects
    public House(int givenValue,String givenOwner) {

        super("House", givenValue, givenOwner, 0.0085);//call superconstructor from Property class
    }
    public void whatAmI() { //unused method to show polymorphism
        System.out.println("I am a House");
    }
}