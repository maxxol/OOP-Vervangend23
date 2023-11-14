public class Property {
    //initialising the default variables of properties
    private String objectType;
    private int value; // integer that represents the value of the property
    private String owner; // string that represents the owner of the property
    private double taxPercentage; // double that represents the tax rate devided by 100 for ease of multiplication

    public Property(String objectType, int value, String owner, double taxPercentage) {
        this.objectType = objectType;
        this.value = value;
        this.owner = owner;
        this.taxPercentage = taxPercentage;
    }

    //getters
    public int getValue(){
        return value;
    }
    public String getOwner(){return owner;}
    public double getTaxPercentage(){
        return taxPercentage;
    }
    public String getObjectType(){return objectType;}

    //setters
    public void setValue(int value){this.value=value;}
    public void setOwner(String owner){this.owner=owner;}
    public void setTaxPercentage(double taxPercentage ){this.taxPercentage=taxPercentage;}
    public void setObjectType(String objectType){this.objectType=objectType;}
}
