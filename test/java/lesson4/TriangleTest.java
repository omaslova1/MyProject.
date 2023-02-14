package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    @Test
    public void PositiveSide1() {
        Triangle t = new Triangle(3, 4, 5);
        boolean actual = t.isValid();
        assertFalse(actual, "Правильный треугольник");
    }


    @Test
    public void isValidNegativeSide2() {
        Triangle t = new Triangle(3, 4, -5);
        boolean actual = t.isValid();

        assertFalse(actual, "Треугольник с отрицательной стороной неправильный");
    }

    @Test
    public void isValidNegativeSide3() {
        Triangle t = new Triangle(0, 4, 5);
        boolean actual = t.isValid();

        assertFalse(actual, "Это не треугольник");


    }

    @Test
    void test() throws MyException {
        Class сlass = new Class();
        Assertions.assertEquals(6,сlass.myMethod(3, 4, 5));
        Assertions.assertThrows(MyException.class,()-> сlass.myMethod(-3, 4, 5));
    }
}




