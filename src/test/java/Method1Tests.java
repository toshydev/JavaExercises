import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Method1Tests {

    @Test
    @DisplayName("2 + 3 = 5")
    void addsTwoNumbers() {
        assertEquals(5, Methods1.sum(2, 3));

    }

    @Test
    @DisplayName("One number out of '42, 255' is greater than 100")
    void checksGt100() {
        assertTrue(Methods1.gt100(42, 255));

    }
}
