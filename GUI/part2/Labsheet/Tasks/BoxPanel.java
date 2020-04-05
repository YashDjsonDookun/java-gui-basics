/* StudentID: 1810111
 *StudentName: Yash Djson Dookun
 */

// Create a Box Panel & Run

import javax.swing.*;
import java.awt.*;

public class BoxPanel extends JPanel {
	public BoxPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.green);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Long Named Button 4");
		JButton b5 = new JButton("Button 5");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}
