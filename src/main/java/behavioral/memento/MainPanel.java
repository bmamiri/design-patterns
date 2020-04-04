package behavioral.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {
    private JLabel jLabel;
    private JTextField jTextField;
    private JTextFieldHistory jTextFieldHistory;
    private JButton jButton;

    public MainPanel() {
        jLabel = new JLabel("Enter your name (Press ctrl+z to undo): ");
        jTextField = new JTextField(20);
        jTextFieldHistory = new JTextFieldHistory(jTextField);
        jButton = new JButton("Save!");
        setLayout(new FlowLayout());
        add(jLabel);
        add(jTextField);
        add(jButton);
        jButton.addActionListener(event -> jTextFieldHistory.save());
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_Z) {
                    jTextFieldHistory.undo();
                }
            }
        });
    }
}
