package murach.agecalculator;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AgeDialog extends JDialog {
	
	private JTextField dialogAgeField;
	
	public AgeDialog(java.awt.Frame parent, String name) {
		super(parent, "Age Dialog", true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		dialogAgeField = new JTextField();
		dialogAgeField.setColumns(20);
		dialogAgeField.setText(name);
		
		JButton okayB = new JButton("Okay");
		okayB.addActionListener((ActionEvent) -> {
//			AgeCalculatorAppProjectFrame frame1 = (AgeCalculatorAppProjectFrame) getOwner();
//			frame1.setNameText(dialogAgeField.getText());
			dispose();
		});
		
		JButton cancelB = new JButton("Cancel");
		cancelB.addActionListener((ActionEvent) -> {
			dispose();
		});
		
		this.add(new JLabel("Enter your date of birth in the format (YYYY-DD-MM): "));
		this.add(dialogAgeField);
		this.add(okayB);
		this.add(cancelB);
		this.pack();
		
		this.setVisible(true);
		
	}

}
