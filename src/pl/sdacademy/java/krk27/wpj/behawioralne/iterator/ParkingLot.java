package pl.sdacademy.java.krk27.wpj.behawioralne.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ParkingLot implements Iterable<ICar> {

    private static final int INITIAL_CAPACITY = 5;
    private int indexToAdd = 0;
    private Car[] cars = new Car[INITIAL_CAPACITY];

    public void add(final Car car) {
            if(indexToAdd <= INITIAL_CAPACITY)
                cars[indexToAdd++] = car;
    }

    @Override
    public Iterator<ICar> iterator() {
        return new CarIterator();
    }


    public class CarIterator implements Iterator<ICar> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < cars.length && cars[index] != null;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }

}
