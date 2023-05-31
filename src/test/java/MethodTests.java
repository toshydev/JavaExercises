import static org.example.project.Methods.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MethodTests {

    @Test
    @DisplayName("2 + 3 = 5")
    void addsTwoNumbers() {
        assertEquals(5, sum(2, 3));

    }

    @Test
    @DisplayName("One number out of '42, 255' is greater than 100")
    void checksGt100() {
        assertTrue(gt100(42, 255));

    }

    @Test
    @DisplayName("42 returns 'false', -255 returns 'true', 0 returns 'false'")
    void checksGtZero() {
        assertFalse(smallerThanZero(42));
        assertTrue(smallerThanZero(-255));
        assertFalse(smallerThanZero(0));
    }

    @Test
    @DisplayName("a=5, b=3, subtract=false, result=8; a=4, b=6, subtract=false, result=24; a=6, b=7, subtract=true, result=1")
    void sumSquareOrSubstractTest() {
        assertEquals(8, sumSquareOrSubstract(5, 3, false));
        assertEquals(24, sumSquareOrSubstract(4, 6, false));
        assertEquals(1, sumSquareOrSubstract(6, 7, true));

    }
}
