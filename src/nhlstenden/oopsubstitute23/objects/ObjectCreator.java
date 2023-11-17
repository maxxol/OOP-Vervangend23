package nhlstenden.oopsubstitute23.objects;

import nhlstenden.oopsubstitute23.objects.propertyclasses.Property;
import nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses.Boat;
import nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses.House;

public class ObjectCreator {

    private Property[] listOfProperties;

    // Constructor
    public ObjectCreator() {
    }

    public void createObjects() {
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

        listOfProperties = new Property[]{
                boat1, boat2, boat3, boat4,
                house1, house2, house3, house4
        };
    }

    public Property[] returnList() {
        return listOfProperties;
    }
}
