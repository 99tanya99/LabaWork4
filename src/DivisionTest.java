import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivisionConstructor() {
        Division division = new Division("Finance");

        assertEquals("Finance", division.getTitle());
    }

    @Test
    public void testGetDivision() {
        Division division = new Division("Marketing");

        String expectedOutput = "ID = 1, Title Marketing";
        assertEquals(expectedOutput, division.getDivision());
    }
}