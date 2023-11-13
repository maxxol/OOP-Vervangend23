import java.util.Objects;

public class ObjectCreator {

    public static void createObjects(){ //creates all the objects so main stays clean


        //boats
        Boat boat1 = new Boat(10,"frank inc"); //all of these are placeholder objects currently
        Boat boat2 = new Boat(20,"frank inc");
        Boat boat3 = new Boat(30,"frank inc");
        Boat boat4 = new Boat(40,"vexigo inc");

        //houses
        House house1 = new House(100,"frank inc");
        House house2 = new House(200,"frank inc");
        House house3 = new House(300,"frank inc");
        House house4 = new House(400,"Bernard jr");

        Property[] listOfProperties = { //make a list with all the properties in it
              boat1, boat2, boat3, boat4,
              house1, house2, house3, house4
        };

        String taxCountsBooleanMessage; //initiating some variables for the loop
        double taxesOwed=0;

        for (Property property:listOfProperties) { //goes through every object in the list. "Property" because all object inherit from it and can thus be called by it
            if (Objects.equals(property.getOwner(), "frank inc")){ //using .equals instead of == because it's null safe(I totally thought of that myself and not because intellij put a yellow line of depression under it)
            taxesOwed+=property.getValue()*property.getTaxPercentage();
            taxCountsBooleanMessage = " added to total tax"; //conditional message at the end of line
            }
            else {taxCountsBooleanMessage=" NOT added to total tax";} //if owner is not targeted owner
            System.out.println(
                    property.getOwner() //print the owner
                    +" owns a "+
                    property.getObjectType() //print what type the object is
                    +", valued at $"+
                    property.getValue() //print the value
                    +" with a tax percentage of "+
                    String.format("%.2f",property.getTaxPercentage()*100) //print the tax percentage as an actual percentage%, rounded to 2 decimals
                    +"%. tax = $"+
                    String.format("%.2f",property.getValue()*property.getTaxPercentage())//print owed taxes over the object, rounded to 2 decimals
                    +taxCountsBooleanMessage //add conditional message
            );
        }
        System.out.println("total tax: $"+String.format("%.2f",taxesOwed)); //print total owed taxes to target company, rounded to 2 decimals
    }
}
