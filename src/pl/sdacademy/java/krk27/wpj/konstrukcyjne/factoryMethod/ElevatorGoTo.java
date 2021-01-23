package pl.sdacademy.java.krk27.wpj.konstrukcyjne.factoryMethod;

public class ElevatorGoTo implements IElevatorOperation {

    @Override
    public void operate(int floor) {
        System.out.printf("Winda rusza na piętro %d\n", floor);
    }
}
