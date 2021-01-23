package pl.sdacademy.java.krk27.wpj.behawioralne.visitor;

public class PlainText implements IElement {
    private String plain;

    public PlainText(String plain) {
        this.plain = plain;
    }

    public String getPlain() {
        return plain;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
