public class House extends Property{
    public House(int givenValue,String givenOwner) {
        value = givenValue;
        owner = givenOwner;
        taxPercentage = 0.0085; //not truly a percentage, 0.85/100 for value * percentage
    }
}