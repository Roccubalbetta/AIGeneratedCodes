package Tests.EasyLevelTests.LlaMa;

import EasyLevel.LlaMa.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void testAddPositiveNumbers() {
        int sum = Addition.add(2, 3);
        assertEquals(5, sum);
    }

    @Test
    public void testAddNegativeNumbers() {
        int sum = Addition.add(-2, -3);
        assertEquals(-5, sum);
    }

    @Test
    public void testAddZero() {
        int sum = Addition.add(0, 0);
        assertEquals(0, sum);
    }

    @Test
    public void testAddMaxValue() {
        int sum = Addition.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, sum);
    }

    @Test
    public void testAddMinValue() {
        int sum = Addition.add(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MAX_VALUE, sum);
    }
}