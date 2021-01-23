package pl.sdacademy.java.krk27.wpj.behawioralne.visitor;

public class BoldText implements IElement {
    private String bold;

    public BoldText(String bold) {
        this.bold = bold;
    }

    public String getBold() {
        return bold;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
