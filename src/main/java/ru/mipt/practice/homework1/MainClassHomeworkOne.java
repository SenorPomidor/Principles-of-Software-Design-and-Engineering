package ru.mipt.practice.homework1;

import ru.mipt.practice.homework1.factory.ShapeFactory;
import ru.mipt.practice.homework1.interfaces.ShapeInterface;

import java.util.Scanner;

public class MainClassHomeworkOne {

    public void findAreaOfShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения длины и ширины сторон для прямоугольника:");
        ShapeInterface rectangle = ShapeFactory.createRectangleShape(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Введите значение длины стороны для квадрата:");
        ShapeInterface square = ShapeFactory.createSquareShape(scanner.nextDouble());

        System.out.println("Введите значение радиуса для круга:");
        ShapeInterface circle = ShapeFactory.createCircleShape(scanner.nextDouble());

        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Площадь квадрата: " + square.area());
        System.out.println("Площадь круга: " + circle.area());
    }
}
