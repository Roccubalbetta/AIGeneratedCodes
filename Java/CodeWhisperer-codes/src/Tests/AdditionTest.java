package Tests;

import EasyLevel.Addition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    void additionTest() {
        assertEquals(4, Addition.addition(2, 2));
    }

    @Test
    void additionTest2() {
        assertEquals(0, Addition.addition(0, 0));
    }

    @Test
    void additionTest3() {
        assertEquals(-1, Addition.addition(-1, 0));
    }

    @Test
    void additionTest4() {
        assertEquals(1, Addition.addition(0, 1));
    }

    @Test
    void additionTest5() {
        assertEquals(-8, Addition.addition(-3, -5));
    }
}