/*
 *StudentName: Yash Djson Dookun
 */

// Create a Grid Panel & Run

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
	public GridPanel() {
		setLayout(new GridLayout(3,2));
		setBackground(Color.green);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Long-Named Button 4");
		JButton b5 = new JButton("Button 5");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}
