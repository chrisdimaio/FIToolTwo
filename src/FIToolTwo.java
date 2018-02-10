/**
 * @(#)FIToolTwo.java
 *
 * FIToolTwo Applet application
 *
 * @author 
 * @version 1.00 2010/8/26
 */
 
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FIToolTwo extends JApplet {
  //private String[] tabLabels = { "Edit", "Source", "Test" };

  private JTabbedPane tabs = new JTabbedPane();

  private JTextField txt = new JTextField(20);

  public void init() {
    	// tabs.addTab(tabLabels[i], new JButton("Tabbed pane " + i));
    	tabs.addTab("Edit", new JTextField(20));
    	
    	tabs.addTab("Source", new JTextField(20));
    	
    	tabs.addTab("Test", new JTextField(20));
    
    tabs.addChangeListener(
    	new ChangeListener() {
      		public void stateChanged(ChangeEvent e) {
        		txt.setText("Tab selected: " + tabs.getSelectedIndex());
      		}
    	}
    );
    
    Container cp = getContentPane();
    cp.add(BorderLayout.SOUTH, txt);
    cp.add(tabs);
  }

  public static void main(String[] args) {
    run(new FIToolTwo(), 500, 450);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
}