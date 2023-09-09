package ru.mipt.practice.shape;

import org.junit.jupiter.api.Test;
import ru.mipt.practice.homework1.factory.ShapeFactory;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest {

    @Test
    public void givenCorrectArgumentsForRectangle_whenCalculateArea_thenOk() {
        ShapeInterface rectangleShape = ShapeFactory.createRectangleShape(2.0, 6.0);
        assertEquals(rectangleShape.area(), 12.0);
    }

    @Test
    public void givenWrongArgumentsForRectangle_whenCalculateArea_thenThrowException() {
        ShapeInterface rectangleShape = ShapeFactory.createRectangleShape(-3.0, 5.0);
        assertThrows(IllegalArgumentException.class, rectangleShape::area);
        String message = assertThrows(IllegalArgumentException.class, rectangleShape::area).getMessage();
        assertEquals("Значение(я) длины и/или ширины прямоугольника меньше или равно(ы) 0!", message);
    }

}
