package pl.sdacademy.java.krk27.wpj.behawioralne.command;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private int size;
    private List<String> plants = new ArrayList<>();

    public Garden(int size) {
        this.size = size;
    }

    public boolean plant(String name) {
        if(plants.size() < size)
        {
            plants.add(name);
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        return plants.remove(name);
    }

    @Override
    public String toString() {
        return "Garden{" +
                "plants=" + plants.size() +
                '}';
    }
}
