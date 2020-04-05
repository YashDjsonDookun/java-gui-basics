/*
 *StudentName: Yash Djson Dookun
 */

// Create a Nested Panel

import java.awt.*;
import javax.swing.*;

public class Task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up First Subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize(new Dimension(150, 100));
        subPanel1.setBackground(Color.green);
        JLabel label1 = new JLabel("One");
        subPanel1.add(label1);

        // Set up Second Subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(150, 100));
        subPanel2.setBackground(Color.red);
        JLabel label2 = new JLabel("Two");
        subPanel2.add(label2);

        // Set up primary Panel
        JPanel primary = new JPanel();
        primary.setBackground(Color.blue);
        primary.add(subPanel1);
        primary.add(subPanel2);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}
