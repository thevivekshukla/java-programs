class ThreadClass implements Runnable
{
	public void run()
	{
		System.out.println("In run method.");
		doMore();
	}

	public void doMore()
	{
		System.out.println("in doMore method");
	}
}


public class ThreadTest
{
	public static void main(String[] args)
	{
		Runnable myObject = new ThreadClass();
		Thread t = new Thread(myObject);
		t.start();
		System.out.println("in main");
	}
}