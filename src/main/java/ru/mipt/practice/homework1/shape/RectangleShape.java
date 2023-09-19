package ru.mipt.practice.homework1.shape;

import lombok.Value;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

@Value
public class RectangleShape implements ShapeInterface {

    double width;
    double height;

    @Override
    public double area() {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Значение(я) длины и/или ширины прямоугольника меньше или равно(ы) 0!");
        }

        return width * height;
    }

}
