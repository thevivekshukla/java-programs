class QueueClass
{
	private int[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	private int maxSize;

	public QueueClass(int s)
	{
		maxSize = s;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int value)
	{
		if (rear == maxSize-1)
			rear = -1;
		queueArray[++rear] = value;
		nItems++;
	}

	public int remove()
	{
		int temp = queueArray[front++];
		if (front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public int peek()
	{
		return queueArray[front];
	}

	public boolean isEmpty()
	{
		return (nItems == 0);
	}

	public boolean isFull()
	{
		return (nItems == maxSize);
	}

}




public class QueueTest
{
	public static void main(String[] args)
	{
		QueueClass q = new QueueClass(5);

		q.insert(43);
		q.insert(78);
		q.insert(96);
		q.insert(50);
		q.insert(18);

		System.out.println("is full: "+ q.isFull());

		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

		System.out.println("is empty: "+ q.isEmpty());

		q.insert(43);
		q.insert(78);
		q.insert(96);
		q.insert(50);
		q.insert(18);
		q.insert(1);

		System.out.println(q.peek());
	}
}