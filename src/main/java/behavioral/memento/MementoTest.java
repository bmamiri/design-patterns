package behavioral.memento;

import javax.swing.*;

public class MementoTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memento Design Pattern");
        jFrame.setSize(800, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new MainPanel());
        jFrame.setVisible(true);
    }
}
