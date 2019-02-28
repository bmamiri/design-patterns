package structural.bridge.solution;

public class MainSolution {
    public static void main(String[] args) {
        Circle circle = new Circle(new Blue());
        circle.applyColor();
        circle.draw();
    }
}
