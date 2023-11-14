package nhlstenden.oopsubstitute23.main;

import nhlstenden.oopsubstitute23.ui.GUIWindow;
import nhlstenden.oopsubstitute23.objects.ObjectCreator;
import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;

public class Main { //where everything comes together
    public static void main(String[] args) {
        ObjectCreator.createObjects();
        GUIWindow textWindow = new GUIWindow();
        TaxCalculator.calculateTaxes();
    }
}