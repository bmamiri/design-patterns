package behavioral.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Content content = new Content(50);
        System.out.println(content.getData());

        content.accept(new AddVisitor());
        System.out.println(content.getData());

        content.accept(cont -> cont.setData(cont.getData() * cont.getData()));
        System.out.println(content.getData());
    }
}
