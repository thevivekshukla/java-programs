import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleGUI
{
	int x=20;
	int y=20;
	MyPanel panel;
	JFrame frame;

	public static void main(String[] args)
	{
		Circle run = new Circle();
		run.gui();
	}

	public void gui()
	{
		frame = new JFrame("Circle");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new MyPanel();
		panel.addMouseListener(new MyPanel());

		frame.getContentPane().add(BorderLayout.CENTER, panel);
		//panel.repaint();

	}


	public class MyPanel extends JPanel implements MouseListener
	{
		@Override
		public void paintComponent(Graphics g)
		{
			int red = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);

			Color color = new Color(red, green, blue);

			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(color);
			g.fillOval(80, 80, x, y);
		}

		public void mouseClicked(MouseEvent ev)
		{
			x += 5;
			y += 5;
			panel.repaint();
		}

		public void mouseEntered(MouseEvent ev)
		{}

		public void mouseReleased(MouseEvent ev)
		{}

		public void mouseExited(MouseEvent ev)
		{}

		public void mousePressed(MouseEvent ev)
		{}
	}

}