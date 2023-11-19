package nhlstenden.oopsubstitute23.main;

import nhlstenden.oopsubstitute23.ui.GUIWindow;
import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;
import nhlstenden.oopsubstitute23.arithmatic.taxCalculatorInterface;

public class Main { //where everything comes together
    public static void main(String[] args) {
        GUIWindow textWindow = new GUIWindow(); //create the window that shows the results

        taxCalculatorInterface taxCalculator = new TaxCalculator(); //make instance of taxCalculator
        taxCalculator.calculateTaxes(); //calculate the results
    }
}