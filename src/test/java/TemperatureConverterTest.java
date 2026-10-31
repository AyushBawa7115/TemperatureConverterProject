import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private final TemperatureConverter converter =
            new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        double actual = converter.celsiusToFahrenheit(0.0);

        assertEquals(32.0, actual, 0.001);
    }
    @Test
    void testFahrenheitToCelsius() {
        double actual = converter.fahrenheitToCelsius(212.0);

        assertEquals(100.0, actual, 0.001);
    }
    @Test
    void testCelsiusToKelvin() {
        double actual = converter.celsiusToKelvin(0.0);

        assertEquals(273.15, actual, 0.001);
    }
}