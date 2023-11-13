public class ObjectCreator {

    private static Property[] listOfProperties;
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

        listOfProperties = new Property[]{
                boat1, boat2, boat3, boat4,
                house1, house2, house3, house4
        };
    }
    public static Property[] returnList(){
        return listOfProperties;
    }
}
