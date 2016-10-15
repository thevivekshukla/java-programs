import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyWall
{
	int x=30;
	int y=30;
	Brick brick;

	public static void main(String[] args)
	{
		MyWall wall = new MyWall();
		wall.build();
	}


	public void build()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

		brick = new Brick();
		frame.getContentPane().add(brick);

		int i;
		for (i=0;i<200;i++)
		{
			x++;
			bgWork();
		}

		for (i=0;i<150;i++)
		{
			y++;
			bgWork();
		}

		for (i=0;i<200;i++)
		{
			x--;
			bgWork();
		}

		for (i=0;i<150;i++)
		{
			y--;
			bgWork();
		}

	}


	public void bgWork()
	{
		brick.repaint();
			try
			{
				Thread.sleep(5);
			}
			catch(Exception e)
			{}
	}


	class Brick extends JPanel
	{
		
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.RED);
			g.fillRect(x, y, 10, 10);
		}
	}

}