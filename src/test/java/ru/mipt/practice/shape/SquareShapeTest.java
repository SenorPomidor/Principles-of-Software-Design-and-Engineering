package ru.mipt.practice.shape;

import org.junit.jupiter.api.Test;
import ru.mipt.practice.homework1.factory.ShapeFactory;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareShapeTest {

    @Test
    public void givenCorrectArgumentsForSquare_whenCalculateArea_thenOk() {
        ShapeInterface squareShape = ShapeFactory.createSquareShape(3.0);
        assertEquals(squareShape.area(), 9.0);
    }

    @Test
    public void givenWrongArgumentsForSquare_whenCalculateArea_thenThrowException() {
        ShapeInterface squareShape = ShapeFactory.createSquareShape(-3.0);
        assertThrows(IllegalArgumentException.class, squareShape::area);
        String message = assertThrows(IllegalArgumentException.class, squareShape::area).getMessage();
        assertEquals("Длина квадрата меньше или равна 0!", message);
    }

}
