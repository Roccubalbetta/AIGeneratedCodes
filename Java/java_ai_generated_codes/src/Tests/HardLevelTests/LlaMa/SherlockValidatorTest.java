package Tests.HardLevelTests.LlaMa;

import HardLevel.LlaMa.SherlockValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SherlockValidatorTest  {

    @Test
    public void testValidString() {
        String str = "abc";
        String result = SherlockValidator.isValid(str);
        assertEquals("YES", result);
    }

    @Test
    public void testValidStringWithExtraCharacter() {
        String str = "abcc";
        String result = SherlockValidator.isValid(str);
        assertEquals("YES", result);
    }

    @Test
    public void testInvalidString() {
        String str = "abccc";
        String result = SherlockValidator.isValid(str);
        assertEquals("NO", result);
    }

    @Test
    public void testSingleCharacterString() {
        String str = "a";
        String result = SherlockValidator.isValid(str);
        assertEquals("YES", result);
    }

    @Test
    public void testEmptyString() {
        String str = "";
        String result = SherlockValidator.isValid(str);
        // non è valida quindi "NO" Llama ha sbagliato a scrivere l'asserzione
        assertEquals("YES", result);
    }
}