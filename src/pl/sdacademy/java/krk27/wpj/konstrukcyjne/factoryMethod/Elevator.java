package pl.sdacademy.java.krk27.wpj.konstrukcyjne.factoryMethod;

import java.util.HashMap;

public class Elevator {

    private HashMap<String, IElevatorOperation> actions = new HashMap<>();

    public IElevatorOperation CreateAction(String action) {
        if(actions.containsKey(action))
            return actions.get(action);

        IElevatorOperation operation = null;
        switch (action) {
            case "up":
                operation = new ElevatorUp();
                break;
            case "down":
                operation = new ElevatorDown();
                break;
            case "goTo":
                operation = new ElevatorGoTo();
                break;
        }
        if(operation != null)
            actions.put(action, operation);
        return  operation;
    }

    public void operate(IElevatorOperation action, int floor)
    {
        action.operate(floor);
    }
}
