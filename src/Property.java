public class Property {
    protected int value; // integer that represents the value of the property
    protected String owner; // string that represents the owner of the property
    protected double taxPercentage; // double that represents the tax rate devided by 100 for ease of multiplication

    public int getValue(){
        return value;
    }
    public String getOwner(){return owner;}
    public double getTaxPercentage(){
        return taxPercentage;
    }
}
