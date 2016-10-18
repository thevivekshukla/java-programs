import javax.swing.JOptionPane;


public class Multiplication
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));

		JOptionPane.showMessageDialog(null, "The result is: "+ (num1*num2), "Multiplication", JOptionPane.PLAIN_MESSAGE);
	}
}