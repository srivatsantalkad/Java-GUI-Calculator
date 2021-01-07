import javax.swing.JFrame;
/**
 * Views frame for calculating two numbers and displaying the result
 * @author SrivatsanTalkad
 *
 */
class Main 
{
  public static void main(String[] args) 
	{
		JFrame frame = new CalculatorFrame();
		frame.setTitle("Calculator by Srivatsan Talkad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
	}
}
