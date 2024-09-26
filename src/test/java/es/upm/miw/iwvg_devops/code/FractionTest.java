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
    void testIsProper() { assertFalse(fraction.getNumerator() < fraction.getDenominator()); }

    @Test
    void testIsImProper() { assertTrue(fraction.getNumerator() > fraction.getDenominator()); }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(8,4);
        assertTrue(fraction.isEquivalent(fraction1));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1,1);
        Fraction fractionResult = new Fraction(12,4);
        fraction = fraction.add(fraction1);
        assertSame(fractionResult.getNumerator(),fraction.getNumerator());
        assertSame(fractionResult.getDenominator(),fraction.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(2,2);
        Fraction fractionResult = new Fraction(16,8);
        fraction = fraction.multiply(fraction1);
        assertSame(fraction.getNumerator(),fractionResult.getNumerator());
        assertSame(fraction.getDenominator(),fractionResult.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(2,1);
        Fraction fractionResult = new Fraction(8,8);
        fraction = fraction.divide(fraction1);
        assertSame(fraction.getNumerator(),fractionResult.getNumerator());
        assertSame(fraction.getDenominator(),fractionResult.getDenominator());
    }

    @Test
    void testString() {
        assertEquals("Fraction{numerator=8, denominator=4}",fraction.toString());
    }
}