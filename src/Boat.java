public class Boat extends Property{ //class that creates Boat objects
    public Boat(int givenValue,String givenOwner) {
        objectType="Boat";
        value = givenValue; //set the values of the property to the assigned values
        owner = givenOwner;
        taxPercentage = 0.0152; //not truly a percentage, 1.52/100 for value * percentage
    }
}
