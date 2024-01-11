package com.methodOverridingtask;

public class Triangle extends GeometricFigure {

    public void area(){
        System.out.println("Triangle area SideA -> 10");
        System.out.println("Triangle area SideB -> 11");
        System.out.println("Triangle area SideC -> 12");
    }

    public void perimeter(){
        System.out.println("Triangle perimeter SideA -> 20");
        System.out.println("Triangle perimeter SideB -> 40");
        System.out.println("Triangle perimeter SideC -> 30");
    }

}
