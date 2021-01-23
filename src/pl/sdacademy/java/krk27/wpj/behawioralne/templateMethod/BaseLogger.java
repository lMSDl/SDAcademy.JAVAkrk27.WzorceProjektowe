package pl.sdacademy.java.krk27.wpj.behawioralne.templateMethod;

public abstract class BaseLogger {

    public void Log(Object message)
    {
        String messageToLog = serializeMessage(message);
        openService();
        writeLogMessage(messageToLog);
        closeService();
    }

    protected abstract void closeService();

    protected abstract void writeLogMessage(String messageToLog);

    protected abstract void openService();

    protected String serializeMessage(Object message) {
        return message.toString();
    }
}
