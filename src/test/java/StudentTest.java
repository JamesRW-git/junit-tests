import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {
    private Student student;


    @Before
    public void setUp() {
        student = new Student("James", 1);
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("James", student.getName());
    }
}
