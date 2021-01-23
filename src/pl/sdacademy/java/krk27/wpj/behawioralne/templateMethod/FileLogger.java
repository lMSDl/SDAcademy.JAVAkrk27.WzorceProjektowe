package pl.sdacademy.java.krk27.wpj.behawioralne.templateMethod;

public class FileLogger extends BaseLogger {
    @Override
    protected void closeService() {
        System.out.println("Closing file");
    }

    @Override
    protected void writeLogMessage(String messageToLog) {
        System.out.println("Logging message to file: " + messageToLog);
    }

    @Override
    protected void openService() {
        System.out.println("Opening file");
    }
}
