package ru.mipt.practice.homework1.shape;

import lombok.Value;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

@Value
public class CircleShape implements ShapeInterface {

    double radius;

    @Override
    public double area() {

        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус круга меньше или равен 0!");
        }

        return Math.PI * Math.pow(radius, 2);
    }
}
