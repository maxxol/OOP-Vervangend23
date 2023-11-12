public class Boat extends Property{
    public Boat(int givenValue,String givenOwner) {
        value = givenValue;
        owner = givenOwner;
        taxPercentage = 0.0152; //not truly a percentage, 1.52/100 for value * percentage
    }
}
