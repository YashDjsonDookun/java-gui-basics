/*
 *StudentName: Yash Djson Dookun
 */

// Create a Panel with 2 Labels

import java.awt.*;
import javax.swing.*;
public class Task2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary = new JPanel();
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(250, 75));
		JLabel label1 = new JLabel("Wow!");
		JLabel label2 = new JLabel("This is my GUI Hello World");
		primary.add(label1);
		primary.add(label2);
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}
}
