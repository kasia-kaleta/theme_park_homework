import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Matt", 4, 4.50);
        rollerCoaster = new RollerCoaster("Sprinkle", 5, 8.40);
        candyflossStall = new CandyflossStall("Flossy", "Janet Floss", ParkingSpot.A4);
        iceCreamStall = new IceCreamStall("Icey", "Janet Floss", ParkingSpot.A2);
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(iceCreamStall);
        themePark.addStall(candyflossStall);
        assertEquals(4, themePark.getAllReviewed().size());
    }
}
