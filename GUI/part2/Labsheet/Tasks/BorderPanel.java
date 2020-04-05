/* 
 *StudentName: Yash Djon Dookun
 */

// Create a Border Panel & Run

import javax.swing.*;
import java.awt.*;

public class BorderPanel extends JPanel {
	public BorderPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.green);
		JButton b1 = new JButton("Button 1 (PAGE_START)");
		JButton b2 = new JButton("Button 2 (CENTER)");
		JButton b3 = new JButton("Button 3 (LINE_START)");
		JButton b4 = new JButton("Long-Named Button 4 (PAGE_END)");
		JButton b5 = new JButton("5 (LINE_END)");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.CENTER);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.SOUTH);
		add(b5, BorderLayout.EAST);
	}
}
