import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Ball
{
	BallGUI ball;
	final int x = 120;
	int y = 240;

	public void run()
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);

		ball = new BallGUI();
		BallMovement moveBall = new BallMovement();
		ball.addMouseListener(moveBall);
		frame.getContentPane().add(BorderLayout.CENTER, ball);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	public class BallMovement implements MouseListener
	{
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e)
		{
			for (int i=0; i<140; i++)
			{
				y--;
				ball.repaint();
				try
				{
					Thread.sleep(5);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				ball.repaint();
			}//closed for
		}
	}



	public static void main(String[] args)
	{
		Ball b = new Ball();
		b.run();
	}



	public class BallGUI extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(Color.RED);
			g.fillOval(x, y, 60, 60);
		}
	}


}