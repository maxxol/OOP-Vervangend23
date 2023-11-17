package nhlstenden.oopsubstitute23.tests;
import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator taxCalculator = new TaxCalculator();
    @Test
    public void testCalculator() {
        // Given
        int givenValue = 123;
        String givenOwner = "Arnold Schwarzenegger";

        // When
        String taxLineOne = taxCalculator.calculateTaxes().split("\n")[0];

        // Then
        assertEquals(
                "frank inc owns a Boat, valued at $10 with a tax percentage of 1,52%. tax = $0,15 added to total tax",
                taxLineOne
        );
    }
}

