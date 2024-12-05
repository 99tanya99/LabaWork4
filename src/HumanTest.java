import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    @Test
    public void testHumanToString() {
        Division division = new Division("IT");
        Human human = new Human(1, "John Doe", "Male", division, 50000, "1990-01-01");

        String expectedOutput = "Id = 1, Name: John Doe, Sex: Male, Salary: 50000, DateOfBirth: 1990-01-01, Division: ID = 0, Title IT";
        assertEquals(expectedOutput, human.toString());
    }

    @Test
    public void testHumanConstructor() {
        Division division = new Division("HR");
        Human human = new Human(2, "Jane Doe", "Female", division, 60000, "1992-02-02");

        assertEquals(2, human.id);
        assertEquals("Jane Doe", human.name);
        assertEquals("Female", human.sex);
        assertEquals(60000, human.salary);
        assertEquals("1992-02-02", human.dateOfBirth);
        assertEquals(division, human.division);
    }
}