package ru.mipt.practice.homework1.factory;

import ru.mipt.practice.homework1.interfaces.ShapeInterface;
import ru.mipt.practice.homework1.shape.CircleShape;
import ru.mipt.practice.homework1.shape.RectangleShape;
import ru.mipt.practice.homework1.shape.SquareShape;

public class ShapeFactory {

    public static ShapeInterface createRectangleShape(double width, double height) {
        return new RectangleShape(width, height);
    }

    public static ShapeInterface createSquareShape(double width) {
        return new SquareShape(width);
    }

    public static ShapeInterface createCircleShape(double radius) {
        return new CircleShape(radius);
    }

}
