package com.methodOverridingtask;

public class GeometricFigure {

    public void area() {
        System.out.println("area");

    }

    public void perimeter(){
        System.out.println("perimeter");

    }

    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        Trapezium trapezium=new Trapezium();
        Rectangle rectangle=new Rectangle();


        triangle.area();
        triangle.perimeter();
        trapezium.area();
        triangle.perimeter();
        rectangle.area();
        rectangle.perimeter();
    }
}