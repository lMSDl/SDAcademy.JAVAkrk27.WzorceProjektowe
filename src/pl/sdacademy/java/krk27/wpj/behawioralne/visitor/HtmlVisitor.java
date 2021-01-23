package pl.sdacademy.java.krk27.wpj.behawioralne.visitor;

public class HtmlVisitor implements IVisitor {

    private String output = "";

    public String getOutput() {
        return output;
    }

    @Override
    public void visit(PlainText element) {
        output += element.getPlain();
    }

    @Override
    public void visit(BoldText element) {
        output += "<b>" + element.getBold() + "</b>";

    }

    @Override
    public void visit(Hyperlink element) {
        output += "<a href=\"" + element.getUrl() + "\">" + element.getLabel() + "</a>";
    }
}
