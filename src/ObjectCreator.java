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

        Property[] listOfProperties = {
              boat1, boat2, boat3, boat4,
              house1, house2, house3, house4
        };

        String taxCountsBooleanMessage;
        double taxesOwed=0;
        for (Property property:listOfProperties) {
            if (property.getOwner()=="frank inc"){
            taxesOwed+=property.getValue()*property.getTaxPercentage();
            taxCountsBooleanMessage = " added to total tax";
            }
            else {taxCountsBooleanMessage=" NOT added to total tax";}
            System.out.println(
                    property.getOwner()
                    +" owns a "+
                    property.getObjectType()
                    +", valued at $"+
                    property.getValue()
                    +" with a tax percentage of "+
                    String.format("%.2f",property.getTaxPercentage()*100)
                    +"%. tax = $"+
                    String.format("%.2f",property.getValue()*property.getTaxPercentage())
                    +taxCountsBooleanMessage
            );
        }
        System.out.println("total tax: $"+String.format("%.2f",taxesOwed));

    }
}
