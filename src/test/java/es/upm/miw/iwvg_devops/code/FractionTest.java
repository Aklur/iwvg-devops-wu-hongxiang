package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;
    @BeforeEach
    void before() {
        this.fraction = new Fraction(8,4);
    }

    @Test
    void testFraction() {
        this.fraction = new Fraction();
        assertEquals(1,fraction.getNumerator());
        assertEquals(1,fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(8,fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4,fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(9);
        assertEquals(9,fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(2);
        assertEquals(2,fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2,fraction.decimal());
    }

    @Test
    void testString() {
        assertEquals("Fraction{numerator=8, denominator=4}",fraction.toString());
    }
}