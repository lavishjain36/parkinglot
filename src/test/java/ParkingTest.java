import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParkingTest {

    @Test
    public void TestEntry() {
        System.out.println("Test entry");
        Parking p = new Parking(4);
        p.entry("MH01HH1234", "White");
        p.entry("UP01HH9999", "White");
        p.entry("RJ01HH9999", "White");


        assertEquals(4, p.entry("RJ01BB248", "Black"));

        assertNotEquals(4, p.entry("Rj01P123", "Black"));

    }
    @Test
    public void TestExit() {

        Parking p = new Parking(2);
        p.entry("RJ21HH1234", "White");
        p.entry("RJ01HH9999", "White");

        assertEquals(2, p.exit(2));

        assertNotEquals(4, p.exit(4));
    }

}
