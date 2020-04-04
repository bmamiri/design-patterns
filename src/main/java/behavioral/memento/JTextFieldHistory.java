package behavioral.memento;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Objects;

public class JTextFieldHistory {
    private LinkedList<JTextFieldMemento> linkedList = new LinkedList<>();
    private JTextField jTextField;

    public JTextFieldHistory(JTextField jTextField) {
        Objects.requireNonNull(jTextField);
        this.jTextField = jTextField;
    }

    public void save() {
        linkedList.push(new JTextFieldMemento(jTextField.getText()));
        jTextField.setText("");
    }

    public void undo() {
        if (linkedList.size() != 0) {
            jTextField.setText(linkedList.pop().getText());
        } else {
            jTextField.setText("");
        }
    }
}
