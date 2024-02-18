import org.example.Calculator.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    @Test
    public void divide_10DividedBy2_ShouldEqual5() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.divide(10, 2), "The SimpleCalculator::divide value did not return the correct value of 5 for 10/2");
    }

    @Test
    public void divide_10DividedBy5_ShouldEqual2() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.divide(10, 5),"The SimpleCalculator::divide value did not return the correct value of 2 for 10/5");
    }

    @Test
    public void divide_minus10DividedBy5_ShouldEqualMinus2() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-2, calculator.divide(-10, 5), "The SimpleCalculator::divide value did not return the correct value of -2 for -10/5");
    }

    @Test
    public void divide_10DividedByMinus5_ShouldEqualMinus2() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-2, calculator.divide(10, -5),"The SimpleCalculator::divide value did not return the correct value of -2 for 10/-5");
    }

    @Test
    public void divide_10DividedBy0_ShouldThrowIllegalArgumentException() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Cannot divide by zero!");
    }

    @Test
    public void divide_10DivedBy1_ShrouldEquals10(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.divide(10,1));
    }
    @Test
    public void add_2Plus3_ShouldEqual5() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3),"The SimpleCalculator::add value did not return the correct value of 5 for 2+3");
    }

    @Test
    public void subtract_5Minus3_ShouldEqual2() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.subtract(5, 3),"The SimpleCalculator::subtract value did not return the correct value of 2 for 5-3");
    }

    @Test
    public void multiply_3Times5_ShouldEqual15() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(15, calculator.multiply(3, 5), "The SimpleCalculator::multiply value did not return the correct value of 15 for 3*15");
    }

    @Test
    public void add_minus2PlusMinus3_ShouldEqualMinus5() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-5, calculator.add(-2, -3),"The SimpleCalculator::add value did not return the correct value of -5 for -2+-3");
    }

    @Test
    public void subtract_10MinusMinus2_ShouldEqual12() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(12, calculator.subtract(10, -2),"The SimpleCalculator::subtract value did not return the correct value of 12 for 10 - (-2)");
    }

    @Test
    public void multiply_minus2Times3_ShouldEqualMinus6() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-6, calculator.multiply(-2, 3), "The SimpleCalculator::multiply value did not return the correct value of -6 for -2*3");
    }

}
