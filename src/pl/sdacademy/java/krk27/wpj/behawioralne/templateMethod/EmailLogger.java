package pl.sdacademy.java.krk27.wpj.behawioralne.templateMethod;

public class EmailLogger extends BaseLogger {
    @Override
    protected void closeService() {

    }

    @Override
    protected void writeLogMessage(String messageToLog) {
        System.out.println("Sending message via email: " + messageToLog);
    }

    @Override
    protected void openService() {
        //Zakładamy, że usługa wysyłania emaili jest statyczna, więc nie ma potrzeby otwierania i zamykania serwisu
    }
}
