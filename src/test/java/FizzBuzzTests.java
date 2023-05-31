import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTests {
    @Test
    @DisplayName("4 returns '4'")
    void numString() {
        assertEquals("4", Fizzbuzz.fizzbuzz(4));
    }
    @Test
    @DisplayName("9 returns 'fizz'")
    void fizz() {
        assertEquals("fizz", Fizzbuzz.fizzbuzz(9));
    }

    @Test
    @DisplayName("10 returns 'buzz'")
    void buzz() {
        assertEquals("buzz", Fizzbuzz.fizzbuzz(10));
    }

    @Test
    @DisplayName("15 returns 'fizzbuzz'")
    void fizzBuzz() {
        assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(15));
    }
}
