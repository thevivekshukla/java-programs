import javax.swing.JOptionPane;

public class Division
{
	public static void main(String[] args)
	{
		try
		{
			double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number:"));
			double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number:"));

			JOptionPane.showMessageDialog(null, "The result is: "+ (num1/num2), "Division", JOptionPane.PLAIN_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println("you cancelled");
		}
		
	}
}