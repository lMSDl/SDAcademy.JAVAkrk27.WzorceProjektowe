package pl.sdacademy.java.krk27.wpj.behawioralne.templateMethod;

public class DatabaseLogger extends BaseLogger {
    @Override
    protected void closeService() {
        System.out.println("Closing connection to databse");
    }

    @Override
    protected void writeLogMessage(String messageToLog) {
        System.out.println("Logging message to database: " + messageToLog);
    }

    @Override
    protected void openService() {
        System.out.println("Opening connection to database");
    }
}
