package pl.sdacademy.java.krk27.wpj.behawioralne.visitor;

public interface IVisitor {

    void visit(PlainText text);
    void visit(BoldText text);
    void visit(Hyperlink text);

}
