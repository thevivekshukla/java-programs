import javax.swing.JOptionPane;

public class Subtraction
{
	public static void main(String[] args)
	{
		String first = JOptionPane.showInputDialog("Enter first number:");
		String second = JOptionPane.showInputDialog("Enter second number:");

		int num1 = Integer.parseInt(first);
		int num2 = Integer.parseInt(second);

		int res = num1 - num2;

		JOptionPane.showMessageDialog(null, "Difference of number is: "+ res, "Subtraction", JOptionPane.PLAIN_MESSAGE);
	}
}