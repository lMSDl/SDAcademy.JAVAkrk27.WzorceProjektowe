package pl.sdacademy.java.krk27.wpj.konstrukcyjne.factoryMethod;

public class ElevatorDown implements IElevatorOperation {
    @Override
    public void operate(int floor) {
        System.out.printf("Winda zatrzyma się na pięrze %d podczas jazdy w dół\n", floor);
    }
}
