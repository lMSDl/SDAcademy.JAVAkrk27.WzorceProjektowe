package pl.sdacademy.java.krk27.wpj.solid;

public class L {

    public static abstract class Shape
    {
        public abstract int area();
    }

    public static class Rectangle extends Shape
    {
        protected int a ;
        protected int b ;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        @Override
        public int area()
        { return a * b; }
    }

//    public static class Square extends Rectangle
//    {
//        public void setA(int a) {
//            this.a = this.b = a;
//        }
//
//        public void setB(int b) {
//            this.a = this.b = b;
//        }
//    }

    public  static  class  Square extends Shape {
        int a;

        public void setA(int a) {
            this.a = a;
        }

        @Override
        public int area() {
            return a * a;
        }
    }

    public static class Test {

        public void Test(int a, int b, Rectangle rectangle) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            rectangle.setA(a);
            rectangle.setB(b);
            System.out.println("area = " + rectangle.area());
        }

    }
}
