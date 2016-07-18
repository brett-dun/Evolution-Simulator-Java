package userInterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutputUI {
	
	protected JFrame guiFrame;
	protected JFrame guiOutput;
	
	protected final JPanel comboPanel;
	
	protected JLabel gender, male, female;
	protected JLabel hairColor, black, brown, blond;
	protected JLabel bloodType, A, B, AB, o;
	
	public OutputUI() {
		
		guiFrame = new JFrame();
		comboPanel = new JPanel();
		
		gender = new JLabel("Gender");
		//male = new JLabel("Male" + )
	}
}
