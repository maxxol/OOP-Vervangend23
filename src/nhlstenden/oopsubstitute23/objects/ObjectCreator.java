package nhlstenden.oopsubstitute23.objects;

import nhlstenden.oopsubstitute23.objects.propertyclasses.Property;
import nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses.Boat;
import nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses.House;

//this class creates all Property objects and puts them in a returnable list
public class ObjectCreator {

    private Property[] arrayOfProperties; //initiate empty array

    // Constructor
    public ObjectCreator() { //constructor
    }

    public void createObjects() { //create all the property objects
        //boats
        Boat boat1 = new Boat(10, "frank inc");
        Boat boat2 = new Boat(20, "frank inc");
        Boat boat3 = new Boat(30, "frank inc");
        Boat boat4 = new Boat(40, "vexigo inc");

        //houses
        House house1 = new House(100, "frank inc");
        House house2 = new House(200, "frank inc");
        House house3 = new House(300, "frank inc");
        House house4 = new House(400, "Bernard jr");

        arrayOfProperties = new Property[]{//add all the objects to the array
                boat1, boat2, boat3, boat4,
                house1, house2, house3, house4
        };
    }

    public Property[] returnArray() { //gives the array with Property objects to the requesting class
        return arrayOfProperties;
    }
}
