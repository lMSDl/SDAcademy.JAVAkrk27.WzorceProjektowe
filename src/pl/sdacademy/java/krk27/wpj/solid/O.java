package pl.sdacademy.java.krk27.wpj.solid;

public class O {

    abstract class Shape
    {
        abstract float area();
    }

    class Square extends Shape
    {
        int a;

        @Override
        float area() {
            return a*a;
        }
    }

    class Rectangle extends Shape
    {
        int a;
        int b;

        @Override
        float area() {
            return a * b;
        }
    }

    class  Circle extends Shape {
        int r;

        @Override
        float area() {
            return r * r * (float)Math.PI;
        }
    }

    class ShapeCalculator
    {
        float area(Shape shape)
        {
            return  shape.area();
        }
    }
}
