public class Main { //where everything comes together
    public static void main(String[] args) {
        ObjectCreator.createObjects();
        GUIWindow textWindow = new GUIWindow();
        TaxCalculator.CalculateTaxes();
    }
}