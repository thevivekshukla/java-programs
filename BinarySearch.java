class ArrayClass
{
	private int[] ar;
	private int nElems;

	public ArrayClass(int size)
	{
		ar = new int[size];
		nElems = 0;
	}

	public void insert(int value)
	{
		int j;
		for (j=0; j<nElems; j++)
			if (ar[j] > value)
				break;
		for (int k=nElems; k>j; k--)
			ar[k] = ar[k-1];
		ar[j] = value;
		nElems++;
	}

	public void display()
	{
		for (int j=0; j<nElems; j++)
			System.out.print(ar[j] +" ");
		System.out.println();
	}

	public int size()
	{
		return nElems;
	}

	public int bin_search(int value)
	{
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true)
		{
			curIn = (lowerBound + upperBound) / 2;

			if (ar[curIn] == value)
				return curIn;
			else if (lowerBound > upperBound)
				return nElems;
			else
			{
				if (ar[curIn] > value)
					upperBound = curIn - 1;
				else
					lowerBound = curIn + 1;
			}
		}
	}

	public boolean delete(int value)
	{
		int j = bin_search(value);
		if (j == nElems)
			return false;
		else
		{
			for (int k=j; k<nElems; k++)
				ar[k] = ar[k+1];
			nElems--;
			return true;
		}
	}

}





public class BinarySearch
{
	public static void main(String[] args)
	{
		ArrayClass arr = new ArrayClass(100);

		arr.insert(42);
		arr.insert(13);
		arr.insert(75);
		arr.insert(25);
		arr.insert(64);
		arr.insert(25);
		arr.insert(85);
		arr.insert(53);

		arr.display();

		arr.delete(85);

		int searchKey = 75;
		if (arr.bin_search(searchKey) != arr.size())
			System.out.println("Found "+ searchKey);

		arr.display();
	}
}