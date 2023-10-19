package Tests.HardLevelTests.chatGPT;
import static org.junit.jupiter.api.Assertions.*;

import HardLevel.chatGPT.SherlockValidator;
import org.junit.jupiter.api.Test;

public class SherlockValidatorTest {

    @Test
    public void testIsValidStringValidCase1() {
        String str = "abc";
        assertEquals("YES", SherlockValidator.isValidString(str));
    }

    @Test
    public void testIsValidStringValidCase2() {
        String str = "abcc";
        assertEquals("YES", SherlockValidator.isValidString(str));
    }

    @Test
    public void testIsValidStringInvalidCase1() {
        String str = "";
        assertEquals("NO", SherlockValidator.isValidString(str));
    }

    @Test
    public void testIsValidStringInvalidCase2() {
        String str = "aabbcc";
        assertEquals("YES", SherlockValidator.isValidString(str));
    }

    @Test
    public void testIsValidStringInvalidCase3() {
        String str = "abcdefghij";
        // In realtà la string è valida quindi ChatGPT ha sbagliato a scrivere l'asserzione
        assertEquals("NO", SherlockValidator.isValidString(str));
    }
}