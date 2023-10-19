import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    public void testAddPositiveNumbers() {
        int result = Addition.add(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = Addition.add(-5, -7);
        assertEquals(-12, result);
    }

    @Test
    public void testAddZeroAndPositive() {
        int result = Addition.add(0, 8);
        assertEquals(8, result);
    }

    @Test
    public void testAddZeroAndNegative() {
        int result = Addition.add(0, -8);
        assertEquals(-8, result);
    }

    @Test
    public void testAddLargeNumbers() {
        int result = Addition.add(1000000, 2000000);
        assertEquals(3000000, result);
    }

}