package nhlstenden.oopsubstitute23.main;

import nhlstenden.oopsubstitute23.ui.GUIWindow;
import nhlstenden.oopsubstitute23.objects.ObjectCreator;
import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;

public class Main { //where everything comes together
    public static void main(String[] args) {
        GUIWindow textWindow = new GUIWindow();

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTaxes();
    }
}