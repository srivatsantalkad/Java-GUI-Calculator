import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Contains frame for calculating two numbers and displaying the result
 * @author SrivatsanTalkad
 *
 */
public class CalculatorFrame extends JFrame 
{
	// size of frame
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 600;

	// label containing the result of the calculation
	private JLabel resultLabel = new JLabel("");
	
	// 2 text fields for user input of numeric data
	private JTextField inputField1;
	private JTextField inputField2;
	
	// 1 button indicating type of calculation (addition)
	private JButton additionButton;
	
	public CalculatorFrame() 
	{
		// 2 labels describing the operands of the calculator
		JLabel operandLabel1 = new JLabel("The calculator performs addition");
		JLabel operandLabel2 = new JLabel("Please enter 2 numeric values");
		add(operandLabel1, BorderLayout.NORTH);
		add(operandLabel2, BorderLayout.CENTER);
		
		createTextFields();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class AdditionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent event) 
		{
			try 
			{
				double number1 = Double.parseDouble(inputField1.getText());
				double number2 = Double.parseDouble(inputField2.getText());
				double sum = number1 + number2;
				resultLabel.setText("Result: " + sum);		
			} catch (NumberFormatException exception) 
			{
				resultLabel.setText("Error. Numeric values not entered");
			}
		}
	}
	
	private void createTextFields() 
	{
		final int FIELD_WIDTH = 10;
		inputField1 = new JTextField(FIELD_WIDTH);
		inputField2 = new JTextField(FIELD_WIDTH);
	}
	
	private void createButton() 
	{
		additionButton = new JButton("Add the 2 numbers");
		
		ActionListener listener = new AdditionListener();
		additionButton.addActionListener(listener);
	}
	
	private void createPanel() 
	{
		JPanel panel = new JPanel();
		panel.add(inputField1);
		panel.add(inputField2);
		panel.add(additionButton);
		panel.add(resultLabel, BorderLayout.EAST);
		add(panel, BorderLayout.SOUTH);
	}
}