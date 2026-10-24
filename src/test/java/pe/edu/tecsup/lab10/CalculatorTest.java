package pe.edu.tecsup.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sub() {
        final int EXPECTED = 1;

        Calculator app = new Calculator();
        int actual = app.sub(4, 3);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void add() {
        final int EXPECTED = 7;

        Calculator app = new Calculator();
        int actual = app.add(4, 3);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void multiply() {
        final int EXPECTED = 12;

        Calculator app = new Calculator();
        int actual = app.multiply(4, 3);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void divide() {
        final int EXPECTED = 4;

        Calculator app = new Calculator();
        int actual = app.divide(12, 3);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void divideByZero() {
        Calculator app = new Calculator();

        assertThrows(ArithmeticException.class, () -> app.divide(5, 0));
    }
}