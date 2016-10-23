import java.io.*;

class Game implements Serializable
{
	private String name;
	private int score;

	public Game(String n, int s)
	{
		name = n;
		score = s;
	}

	public String getName()
	{
		return name;
	}

	public int getScore()
	{
		return score;
	}
}



public class IOWrite
{
	public static void main(String[] args)
	{
		Game one = new Game("Vivek", 9999);
		try
		{
			FileOutputStream fs = new FileOutputStream("game.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(one);
			os.close();
			System.out.println("file created successfully");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}

		one = null;

		try
		{
			FileInputStream fi = new FileInputStream("game.ser");
			ObjectInputStream is = new ObjectInputStream(fi);
			Game oneRestore = (Game) is.readObject();
			System.out.println(oneRestore.getName());
			System.out.println("Object restored....");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassCastException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

	}
}