import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void givenTwoPositiveNumbers_whenSumar_thenReturnsSum() {
        assertEquals(5.0, calc.sumar(2.0, 3.0), 0.0001);
    }

    @Test
    public void givenNegativeAndPositiveNumbers_whenSumar_thenReturnsSum() {
        assertEquals(0.0, calc.sumar(-1.0, 1.0), 0.0001);
    }

    @Test
    public void givenZero_whenSumar_thenReturnsOtherNumber() {
        assertEquals(2.0, calc.sumar(2.0, 0.0), 0.0001);
        assertEquals(-1.0, calc.sumar(-1.0, 0.0), 0.0001);
    }

    @Test
    public void givenTwoPositiveNumbers_whenRestar_thenReturnsDifference() {
        assertEquals(1.0, calc.restar(3.0, 2.0), 0.0001);
    }

    @Test
    public void givenNegativeAndPositiveNumbers_whenRestar_thenReturnsDifference() {
        assertEquals(-2.0, calc.restar(-1.0, 1.0), 0.0001);
    }

    @Test
    public void givenZero_whenRestar_thenReturnsOtherNumberOrNegation() {
        assertEquals(2.0, calc.restar(2.0, 0.0), 0.0001);
        assertEquals(-2.0, calc.restar(0.0, 2.0), 0.0001);
    }

    @Test
    public void givenTwoPositiveNumbers_whenMultiplicar_thenReturnsProduct() {
        assertEquals(6.0, calc.multiplicar(2.0, 3.0), 0.0001);
    }

    @Test
    public void givenNegativeAndPositiveNumbers_whenMultiplicar_thenReturnsProduct() {
        assertEquals(-1.0, calc.multiplicar(-1.0, 1.0), 0.0001);
    }

    @Test
    public void givenZero_whenMultiplicar_thenReturnsZero() {
        assertEquals(0.0, calc.multiplicar(0.0, 2.0), 0.0001);
        assertEquals(0.0, calc.multiplicar(2.0, 0.0), 0.0001);
    }

    @Test
    public void givenTwoPositiveNumbers_whenDividir_thenReturnsQuotient() {
        assertEquals(2.0, calc.dividir(6.0, 3.0), 0.0001);
    }

    @Test
    public void givenNegativeAndPositiveNumbers_whenDividir_thenReturnsQuotient() {
        assertEquals(-1.0, calc.dividir(-2.0, 2.0), 0.0001);
    }

    @Test
    public void givenZeroNumerator_whenDividir_thenReturnsZero() {
        assertEquals(0.0, calc.dividir(0.0, 2.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void givenZeroDenominator_whenDividir_thenThrowsException() {
        calc.dividir(2.0, 0.0);
    }

    @Test
    public void givenSameNumbers_whenDividir_thenReturnsOneOrMinusOne() {
        assertEquals(1.0, calc.dividir(2.0, 2.0), 0.0001);
        assertEquals(1.0, calc.dividir(-2.0, -2.0), 0.0001);
        assertEquals(-1.0, calc.dividir(-2.0, 2.0), 0.0001);
    }
}