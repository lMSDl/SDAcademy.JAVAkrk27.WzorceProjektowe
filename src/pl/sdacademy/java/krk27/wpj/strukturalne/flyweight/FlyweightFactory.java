package pl.sdacademy.java.krk27.wpj.strukturalne.flyweight;

import java.util.HashMap;

public class FlyweightFactory<T> {

    protected HashMap<String, T> cache = new HashMap<>();

    public T getFlyweight(T flyweight) {
        String key = getKey(flyweight);
        if(cache.containsKey(key))
            return cache.get(key);

        cache.put(key, flyweight);
        return flyweight;
    }

    protected String getKey(T flyweight) {
        return flyweight.toString();
    }



}
