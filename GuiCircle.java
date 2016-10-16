import javax.swing.*;
import java.awt.*;


public class GuiCircle
{
	int x = 0;
	int y = 0;

	public static void main(String[] args)
	{
		GuiCircle gui = new GuiCircle();
		gui.go();
	}


	public void go()
	{
		JFrame frame = new JFrame();
		CircleClass circle = new CircleClass();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.getContentPane().add(circle);

		for (int i=0; i<200; i++)
		{
			x++;
			y++;
			circle.repaint();
			try
			{
				Thread.sleep(50);
			}
			catch(Exception e)
			{}
		}

	}


	class CircleClass extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(Color.BLUE);
			g.fillOval(0+x, 0+y, x, y);
		}
	}

}