package pl.sdacademy.java.krk27.wpj.demeter;

public class ClassOne {

    public static final String SOME_STRING = "some string";

    private ClassTwo classTwo;

    public void method1() {
        method2();
    }

    private void method2() {
        classTwo = new ClassTwo();
        classTwo.method1(this);
    }

    public ClassTwo getClassTwo() {
        return classTwo;
    }
}
