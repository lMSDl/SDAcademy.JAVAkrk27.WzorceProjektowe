package pl.sdacademy.java.krk27.wpj.konstrukcyjne.singleton;

import java.util.ArrayList;
import java.util.List;

public class Lazy {
    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) { // (1)
            instance = new Lazy(); // (2)
        }
        return instance;
    }


    private Lazy() {
    }

    private List<Integer> values = new ArrayList<>();

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }

}
