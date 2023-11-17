package nhlstenden.oopsubstitute23.tests;
import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void testCalculator() { //test the taxCalculator.calculateTaxes method
        // Given

        // When
        TaxCalculator taxCalculator = new TaxCalculator(); //make instance of TaxCalculator
        String taxLineOne = taxCalculator.calculateTaxes().split("\n")[1]; //make the output string, split it by newlines, then take the first line of text.

        // Then
        assertEquals( //are these 2 the same
                "frank inc owns a Boat, valued at $10 with a tax percentage of 1,52%. tax = $0,15 added to total tax", //currently the expected first string
                taxLineOne //generated String
        );
    }
}

