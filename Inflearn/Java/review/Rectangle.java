package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void area() {
        System.out.println("넓이:" + calculateArea(width, height));
    }

    void perimeter() {
        System.out.println("둘레:" + calculatePerimeter(width, height));
    }

    void square() {
        System.out.println("정사각형 여부:" + isSquare(width, height));
    }

    int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    boolean isSquare(int width, int height) {
        return width == height;
    }
}
