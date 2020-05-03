import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

import calculator.CalcPanel;


public class CalcMain {

	public static void main(String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("My Calculator");
		theGUI.setSize(220,350);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container pane = theGUI.getContentPane();
		JPanel myPanel = new CalcPanel();
		pane.add(myPanel);
		
		theGUI.setVisible(true);

	}

}
