package ru.mipt.practice.homework1.shape;

import lombok.Value;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

@Value
public class SquareShape implements ShapeInterface {

    double width;

    @Override
    public double area() {

        if (width <= 0) {
            throw new IllegalArgumentException("Длина квадрата меньше или равна 0!");
        }

        return Math.pow(width, 2);
    }

}
