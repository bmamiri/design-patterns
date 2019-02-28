package structural.bridge.problem;

public class MainProblem {
    public static void main(String[] args) {
        BlueCircle blueCircle = new BlueCircle();
        GreenSquare greenSquare = new GreenSquare();

        blueCircle.applyColor();

        greenSquare.applyColor();
    }
}
