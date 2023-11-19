package nhlstenden.oopsubstitute23.objects.propertyclasses;

public class Property {
    //initialising the default variables of properties
    private String objectType;// string that contains the name of the subclass
    private int value; // integer that represents the value of the property
    private String owner; // string that represents the owner of the property
    private double taxPercentage; // double that represents the tax rate divided by 100 for ease of multiplication

    public Property(String objectType, int value, String owner, double taxPercentage) {//superconstructor for the subclasses
        this.objectType = objectType;
        this.value = value;
        this.owner = owner;
        this.taxPercentage = taxPercentage;
    }

    //getters
    public int getValue(){
        return this.value;
    }
    public String getOwner(){return this.owner;}
    public double getTaxPercentage(){
        return this.taxPercentage;
    }
    public String getObjectType(){return this.objectType;}

    //setters
    public void setValue(int value){this.value=value;}
    public void setOwner(String owner){this.owner=owner;}
    public void setTaxPercentage(double taxPercentage ){this.taxPercentage=taxPercentage;}
    public void setObjectType(String objectType){this.objectType=objectType;}
}
