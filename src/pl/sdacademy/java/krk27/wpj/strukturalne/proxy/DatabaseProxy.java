package pl.sdacademy.java.krk27.wpj.strukturalne.proxy;

import java.util.concurrent.Semaphore;

public class DatabaseProxy implements IDatabase {

    private IDatabase database;
    private final Semaphore semaphore;
    private final int permits;



    public DatabaseProxy(IDatabase database) {
        this.database = database;
        permits = 5;
        semaphore = new Semaphore(permits);
    }

    public DatabaseProxy(IDatabase database, int maxConnections) {
        this.database = database;
        permits = maxConnections;
        this.semaphore = new Semaphore(permits);
    }


    public DatabaseProxy(int maxConnections) {
        permits = maxConnections;
        this.semaphore = new Semaphore(permits);
    }

    @Override
    public int request(int parameter) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (semaphore) {
            if (database == null) {
                database = new Database();
                System.out.println("Opening database connection");
            }
        }

        int result = database.request(parameter);
        semaphore.release();

            if (semaphore.availablePermits() ==  permits && database != null) {
                System.out.println("Closing database connection");
                database = null;
            }

        return result;
    }
}
