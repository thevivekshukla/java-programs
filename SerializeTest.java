import java.io.*;

class GameStatus implements Serializable
{
	private int health;
	private String playerName;
	private int progress;

	public GameStatus(int h, String name, int p)
	{
		health = h;
		playerName = name;
		progress = p;
	}

	public int getHealth()
	{
		return health;
	}

	public String getPlayerName()
	{
		return playerName;
	}

	public int getProgress()
	{
		return progress;
	}
}




public class SerializeTest
{
	public static void main(String[] args)
	{
		GameStatus game1 = new GameStatus(100, "Vivek", 22);
		GameStatus game2 = new GameStatus(85, "Lucifer", 18);

		try
		{
			FileOutputStream fs = new FileOutputStream("GameStatus.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(game1);
			os.writeObject(game2);
			os.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		game1 = null;
		game2 = null;

		try
		{
			FileInputStream fis = new FileInputStream("GameStatus.ser");
			ObjectInputStream is = new ObjectInputStream(fis);
			GameStatus game1Restore = (GameStatus) is.readObject();
			GameStatus game2Restore = (GameStatus) is.readObject();
			System.out.println(game1Restore.getPlayerName());
			System.out.println(game2Restore.getPlayerName());
			is.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}