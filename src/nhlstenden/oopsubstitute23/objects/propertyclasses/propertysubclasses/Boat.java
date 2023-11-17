package nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses;

import nhlstenden.oopsubstitute23.objects.propertyclasses.Property;

public class Boat extends Property implements propertyInterface{ //class that creates Boat objects
    public Boat(int givenValue,String givenOwner) {
        super("Boat", givenValue, givenOwner, 0.0152);
    }
    public void whatAmI() { //unused method to show polymorphism
        System.out.println("I am a Boat");
    }
}
