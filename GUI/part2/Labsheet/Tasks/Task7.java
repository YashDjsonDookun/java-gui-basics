
/*
 * StudentName: Yash Djson Dookun
 */
import javax.swing.*;

// Create a new Frame
public class Task7 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Button Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTabbedPane tp = new JTabbedPane();
    tp.addTab("Grid", new GridPanel2());

    frame.getContentPane().add(tp);
    frame.pack();
    frame.setSize(600, 300);
    frame.setVisible(true);
  }
}
