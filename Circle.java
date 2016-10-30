import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Circle
{
	CircleClass circle;
	public static int x=30, y=30;

	public static void main(String[] args)
	{
		Circle go = new Circle();
		go.run();
	}

	public void run()
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		circle = new CircleClass();
		frame.getContentPane().add(BorderLayout.CENTER, circle);
		circle.addMouseListener(new MouseClick());
	}

	public class MouseClick implements MouseListener
	{
		public void mouseExited(MouseEvent e) 
		{
			y+=10;
			circle.repaint();
		}
		public void mouseEntered(MouseEvent e) 
		{
			x +=10;
			circle.repaint();
		}
		public void mouseReleased(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e)
		{
			x += 3;
			y += 3;
			circle.repaint();
		}
	}

}


class CircleClass extends JPanel
{
	Circle c = new Circle();
	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		g.setColor(Color.RED);
		g.fillOval(c.x, c.y, 60, 60);
	}
}