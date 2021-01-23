package pl.sdacademy.java.krk27.wpj.behawioralne.command;

public class GardenCommand implements ICommand{

    private Garden garden;
    private String plant;
    private GardenAction action;

    public GardenCommand(Garden garden, String plant, GardenAction action) {
        this.garden = garden;
        this.plant = plant;
        this.action = action;
    }

    @Override
    public boolean execute() {
        switch (action) {
            case PLANT:
                return garden.plant(plant);
            case REMOVE:
                return garden.remove(plant);
        }
        return false;
    }

    @Override
    public void undo() {
        switch (action) {
            case PLANT:
                garden.remove(plant);
                break;
            case REMOVE:
                garden.plant(plant);
                break;
        }
    }
}
