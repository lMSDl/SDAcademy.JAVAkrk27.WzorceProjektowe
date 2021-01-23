package pl.sdacademy.java.krk27.wpj.demeter;

public class ClassTwo {

    public void method1(ClassOne classOne) {
        classOne.method1();
        String someString = ClassOne.SOME_STRING;
    }

    public void method2(ClassTwo classTwo) {//(ClassOne classOne) {
        //classOne.getClassTwo().method1(new ClassOne());
        classTwo.method1(new ClassOne());
    }

}
