import java.util.ArrayList;
public class ObjectCreator {

    public static void createObjects(){ //creates all the objects so main stays clean


        //boats
        Boat boot1 = new Boat(10,"frank inc"); //all of these are placeholder objects currently
        Boat boot2 = new Boat(20,"frank inc");
        Boat boot3 = new Boat(30,"frank inc");
        Boat boot4 = new Boat(40,"vexigo inc");

        //houses
        House house1 = new House(100,"frank inc");
        House house2 = new House(200,"frank inc");
        House house3 = new House(300,"frank inc");
        House house4 = new House(400,"Bernard jr");

        Property[] listOfProperties = {
              boot1, boot2, boot3, boot4,
              house1, house2, house3, house4
        };

        for (Property property:listOfProperties) {
            System.out.println(
                    property.getOwner()
                    +" owns a "+
                    property.getObjectType()
                    +", valued at $"+
                    property.getValue()
                    +" with a tax percentage of "+
                    String.format("%.2f",property.getTaxPercentage()*100)
                    +"%"
            );
        }
    }
}
