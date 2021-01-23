package pl.sdacademy.java.krk27.wpj.behawioralne.visitor;

public class Hyperlink implements IElement {
    private String url;
    private String label;

    public Hyperlink(String url, String label) {
        this.url = url;
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
