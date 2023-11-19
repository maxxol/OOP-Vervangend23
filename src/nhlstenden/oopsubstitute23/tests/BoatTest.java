package nhlstenden.oopsubstitute23.tests;
import nhlstenden.oopsubstitute23.objects.propertyclasses.propertysubclasses.Boat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoatTest { //this is a test for the Boat object
    @Test
    public void testBoatConstructor() {
        // Given
        int givenValue = 123;
        String givenOwner = "Arnold Schwarzenegger";

        // When
        Boat boat = new Boat(givenValue, givenOwner);

        // Then
        assertEquals("Boat", boat.getObjectType());
        assertEquals(givenValue, boat.getValue());
        assertEquals(givenOwner, boat.getOwner());
        assertEquals(0.0152, boat.getTaxPercentage(), 0.0001); // Using delta for deviation due to doubles being imprecise
    }
}

