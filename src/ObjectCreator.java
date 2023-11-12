import java.util.ArrayList;
public class ObjectCreator {

    public static void createObjects(){ //creates all the objects so main stays clean
        ArrayList<Boat> boats = new ArrayList<>();
        ArrayList<House> houses = new ArrayList<>();
        //boats
        Boat boot1 = new Boat(10,"frank inc"); //all of these are placeholder objects currently
        Boat boot2 = new Boat(10,"frank inc");
        Boat boot3 = new Boat(10,"frank inc");
        Boat boot4 = new Boat(10,"frank inc");
        boats.add(boot1);
        boats.add(boot2);
        boats.add(boot3);
        boats.add(boot4);

        //houses
        House house1 = new House(10,"frank inc");
        House house2 = new House(10,"frank inc");
        House house3 = new House(10,"frank inc");
        House house4 = new House(10,"frank inc");
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
    }
}
