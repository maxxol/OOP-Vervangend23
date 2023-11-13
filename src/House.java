public class House extends Property{ //class that creates House objects
    public House(int givenValue,String givenOwner) {
        setObjectType("House");
        setValue(givenValue); //set the values of the property to the assigned values
        setOwner(givenOwner);
        setTaxPercentage(0.0085); //not truly a percentage, 1.52/100 for value * percentage
    }
}