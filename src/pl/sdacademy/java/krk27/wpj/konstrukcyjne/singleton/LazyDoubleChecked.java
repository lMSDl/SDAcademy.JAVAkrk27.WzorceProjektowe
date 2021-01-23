package pl.sdacademy.java.krk27.wpj.konstrukcyjne.singleton;

import java.util.ArrayList;
import java.util.List;

public class LazyDoubleChecked {
    private static LazyDoubleChecked instance;

    public static LazyDoubleChecked getInstance() {
        if (instance == null) { // (1)
            synchronized (LazyDoubleChecked.class) {
                if (instance == null) { // (2)
                    instance = new LazyDoubleChecked();
                }
            }
        }
        return instance;
    }

    private LazyDoubleChecked() {
    }

    private List<Integer> values = new ArrayList<>();

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}
