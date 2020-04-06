package behavioral.visitor;

@FunctionalInterface
public interface ContentVisitor {
    void visit(Content content);
}
