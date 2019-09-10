package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor = new Visitor(17, 1.89, 76.50);
        visitor2 = new Visitor(12, 2.19, 50.50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor),0.01);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2),0.01);
    }

    @Test
    public void checkIfAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
}
