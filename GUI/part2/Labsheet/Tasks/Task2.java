/*
 * StudentID: 1810111 
 * StudentName: Yash Djson Dookun
 */
import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Intro", new IntroPanel());
        tp.addTab("Flow", new FlowPanel());
        tp.addTab("Border", new BorderPanel());
        tp.addTab("Grid", new GridPanel());
        tp.addTab("Box", new BoxPanel());
        frame.getContentPane().add(tp);
        frame.pack();
        frame.setVisible(true);
    }
}
