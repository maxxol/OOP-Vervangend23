public class House extends Property{ //class that creates House objects
    public House(int givenValue,String givenOwner) {
        value = givenValue; //set the values of the property to the assigned values
        owner = givenOwner;
        taxPercentage = 0.0085; //not truly a percentage, 0.85/100 for value * percentage
    }
}