/*
 * StudentID: 1810111
 * StudentName: Yash Djson Dookun
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Create GridPanel
public class GridPanel2 extends JPanel {
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
  JLabel l1;
  JTextField textField;
  // Create Buttons and Add to Grid
  public GridPanel2() {
    setLayout(new GridLayout(3,4));
    setBackground(Color.green);
    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");

    // Exercise - create JTextField
    textField = new JTextField("Type of card: ");

    l1 = new JLabel("Enter your pin: ");
    add(l1);
    add(b0);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);

    // Add textField
    add(textField);

    // Add the Listeners
    b0.addActionListener(new ButtonListener());
    b1.addActionListener(new ButtonListener());
    b2.addActionListener(new ButtonListener());
    b3.addActionListener(new ButtonListener());
    b4.addActionListener(new ButtonListener());
    b5.addActionListener(new ButtonListener());
    b6.addActionListener(new ButtonListener());
    b7.addActionListener(new ButtonListener());
    b8.addActionListener(new ButtonListener());
    b9.addActionListener(new ButtonListener());
  }

// Implement Even Listeners
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String oldLabel = l1.getText();
      if (e.getSource() == b1) {
        l1.setText(oldLabel+"1");
      }
      else if (e.getSource() == b2) {
        l1.setText(oldLabel+"2");
      }
      else if (e.getSource() == b3) {
        l1.setText(oldLabel+"3");
      }
      else if (e.getSource() == b4) {
        l1.setText(oldLabel+"4");
      }
      else if (e.getSource() == b5) {
        l1.setText(oldLabel+"5");
      }
      else if (e.getSource() == b6) {
        l1.setText(oldLabel+"6");
      }
      else if (e.getSource() == b7) {
        l1.setText(oldLabel+"7");
      }
      else if (e.getSource() == b8) {
        l1.setText(oldLabel+"8");
      }
      else if (e.getSource() == b9) {
        l1.setText(oldLabel+"9");
      }
      else if (e.getSource() == b9) {
        l1.setText(oldLabel+"9");
      }
      else if (e.getSource() == b0) {
        l1.setText(oldLabel+"0");
      }
      else {
        l1.setText("Unknown Input!");
      }
    }
  }
}
