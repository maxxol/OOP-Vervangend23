public class Main { //where everything comes together
    public static void main(String[] args) {
        Boat boot1 = new Boat(10,"frank inc"); //placeholder constructor calls
        Boat boot2 = new Boat(10,"frank inc");
        Boat boot3 = new Boat(10,"frank inc");
        Boat boot4 = new Boat(10,"frank inc");
        System.out.println(boot1.getTaxPercentage()+" "+boot1.getValue()+" "+boot1.getOwner()); //placeholder object checker
    }
}