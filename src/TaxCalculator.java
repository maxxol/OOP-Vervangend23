import java.util.Objects;

public class TaxCalculator {
    public static String CalculateTaxes(){
        String taxCountsBooleanMessage; //initiating some variables for the loop
        double taxesOwed=0;
        String taxMessageFull = "";
        Property[] listOfProperties = ObjectCreator.ReturnList();

            for(Property property:listOfProperties) { //goes through every object in the list. "Property" because all object inherit from it and can thus be called by it
            if (Objects.equals(property.getOwner(), "frank inc")){ //using .equals instead of == because it's null safe(I totally thought of that myself and not because intellij put a yellow line of depression under it)
                taxesOwed+=property.getValue()*property.getTaxPercentage();
                taxCountsBooleanMessage = " added to total tax"; //conditional message at the end of line
            }
            else {taxCountsBooleanMessage=" NOT added to total tax";} //if owner is not targeted owner

            taxMessageFull+=(
                    property.getOwner() //print the owner
                            +" owns a "+
                            property.getObjectType() //print what type the object is
                            +", valued at $"+
                            property.getValue() //print the value
                            +" with a tax percentage of "+
                            String.format("%.2f",property.getTaxPercentage()*100) //print the tax percentage as an actual percentage%, rounded to 2 decimals
                            +"%. tax = $"+
                            String.format("%.2f",property.getValue()*property.getTaxPercentage())//print owed taxes over the object, rounded to 2 decimals
                            +taxCountsBooleanMessage //add conditional message
                            +"\n");
        }
        taxMessageFull+=("-----------\ntotal: $"+String.format("%.2f",taxesOwed));
        return taxMessageFull;
}}
