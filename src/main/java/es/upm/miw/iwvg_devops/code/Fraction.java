package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper(){ return this.numerator < this.denominator; }

    public boolean isImproper(){ return this.numerator > this.denominator; }

    public boolean isEquivalent(Fraction fraction){
        int numerador1 = this.numerator * fraction.denominator;
        int numerador2 = this.denominator * fraction.numerator;
        return numerador1 == numerador2; }

    public Fraction add(Fraction fraction){
        int denominador = this.denominator * fraction.denominator;
        int numerador1 = this.numerator * denominador;
        int numerador2 = fraction.numerator * denominador;
        this.setNumerator(numerador1 + numerador2);
        this.setDenominator(denominador);
        return this; }

    public Fraction multiply (Fraction fraction){
        int denominador = this.denominator * fraction.denominator;
        int numerador = this.numerator * fraction.numerator;
        this.setNumerator(numerador);
        this.setDenominator(denominador);
        return this; }

    public Fraction divide (Fraction fraction){
        int denominador = this.denominator * fraction.numerator;
        int numerador = this.numerator * fraction.denominator;
        this.setNumerator(numerador);
        this.setDenominator(denominador);
        return this; }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}