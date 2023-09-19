package ru.mipt.practice.shape;

import org.junit.jupiter.api.Test;
import ru.mipt.practice.homework1.factory.ShapeFactory;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleShapeTest {

    @Test
    public void givenCorrectArgumentsForCircle_whenCalculateArea_thenOk() {
        ShapeInterface circleShape = ShapeFactory.createCircleShape(3.0);
        assertEquals(circleShape.area(), 28.274333882308138);
    }

    @Test
    public void givenWrongArgumentsForCircle_whenCalculateArea_thenThrowException() {
        ShapeInterface circleShape = ShapeFactory.createCircleShape(-3.0);
        assertThrows(IllegalArgumentException.class, circleShape::area);
        String message = assertThrows(IllegalArgumentException.class, circleShape::area).getMessage();
        assertEquals("Радиус круга меньше или равен 0!", message);
    }

}
