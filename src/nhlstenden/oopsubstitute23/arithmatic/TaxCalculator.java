package nhlstenden.oopsubstitute23.arithmatic;

import nhlstenden.oopsubstitute23.objects.propertyclasses.Property;
import nhlstenden.oopsubstitute23.objects.ObjectCreator;
import java.util.Objects;

public class TaxCalculator implements taxCalculatorInterface{
    public TaxCalculator() { //constructor
    }
    public String calculateTaxes(){ //this method creates and returns a string that contains all info about all properties and thei taxes
        //initiating some variables for the loop
        String taxCountsBooleanMessage; //string that says whether tax is added to total or not
        double totalTaxesOwed=0; //initiating final tax count at 0
        String taxMessageFull = ""; //initiating eventual string with results as empty
        String previousObjectType = ""; //checks the subclass of the previous property, if they differ whitespace is added to differentiate them

        ObjectCreator objectCreator = new ObjectCreator(); //creating instance of ObjectCreator in order to call its list of Properties
        objectCreator.createObjects();//creating the list
        Property[] listOfProperties = objectCreator.returnArray();//requesting the list

        for(Property property:listOfProperties) { //goes through every object in the list. "Property.Property" because all object inherit from it and can thus be called by it

            if (Objects.equals(property.getOwner(), "frank inc")){ //using .equals instead of == because it's null safe(I totally thought of that myself and not because intellij put a yellow line of depression under it)
                totalTaxesOwed+=property.getValue()*property.getTaxPercentage();
                taxCountsBooleanMessage = " added to total tax"; //conditional message at the end of line
            }
            else {taxCountsBooleanMessage=" NOT added to total tax";} //if owner is not targeted owner

            if(!(Objects.equals(property.getObjectType(),previousObjectType))){//if property subclass is different from the previous one
                taxMessageFull+="\n"; //add a whitespace line (skip a line of text)
            }
            previousObjectType = property.getObjectType(); //reset the previous type to the current type

            taxMessageFull+=( //iteration of creating the eventual full message
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
        }//looping through all properties is done
        taxMessageFull+=("-----------\ntotal: $"+String.format("%.2f",totalTaxesOwed));//round total taxes owed to 2 decimals
        return taxMessageFull; //return the results
    }
    public int windowHeight(){ //dynamically changes the height of the window that shows the results to fit the message
        int lineBreakCount = calculateTaxes().split("\n").length;//amount of lines in the message
        return lineBreakCount*20;//20 pixels for every line
    }
}
