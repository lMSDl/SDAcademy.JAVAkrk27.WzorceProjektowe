package pl.sdacademy.java.krk27.wpj.strukturalne.proxy;

import java.text.MessageFormat;

public class Database implements IDatabase {

    public static final int NUMBER_OF_MAX_CONNECTIONS = 5;

    private int connectionCounter = 0;

    @Override
    public int request(int parameter) {
        if(connectionCounter >= NUMBER_OF_MAX_CONNECTIONS)
        {
            System.out.println(MessageFormat.format("Request {0} dropped!", parameter));
            return -1;
        }

        connectionCounter++;
        System.out.println(MessageFormat.format("Opening connection {0}", connectionCounter));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(MessageFormat.format("Request {0} completed ({1})", parameter, connectionCounter));
        connectionCounter--;
        return parameter;
    }
}
