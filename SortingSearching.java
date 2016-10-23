class ArrayClass
{
	private int[] a;
	private int nElems;

	public ArrayClass(int size)
	{
		a = new int[size];
		nElems = 0;
	}

	public void insert(int value)
	{
		a[nElems] = value;
		nElems++;
	}

	public void display()
	{
		for (int i=0; i<nElems; i++)
			System.out.print(a[i] +" ");
		System.out.println();
	}

	public boolean delete(int searchKey)
	{
		int res = find(searchKey);
		if (res == nElems)
			return false;
		else
		{
			for (int i=res; i<nElems-1; i++)
				a[i] = a[i+1];
			nElems--;
			return true;
		}
	}

	public void bubbleSort()
	{
		for (int i=1; i<nElems; i++)
			for (int j=0; j<nElems-i; j++)
				if (a[j] > a[j+1])
					swap(j, j+1);
	}

	public void selectionSort()
	{
		for (int i=0; i<nElems-1; i++)
		{
			int min = i;
			for (int j=i+1; j<nElems; j++)
				if (a[j] < a[min])
					swap(j, min);
		}
	}

	public void insertionSort()
	{
		for(int i=1; i<nElems; i++)
		{
			int temp = a[i];
			int j = i;
			while (j>0 && a[j-1] >= temp)
			{
				a[j] = a[j-1];
				--j;
			}
			a[j] = temp;
		}
	}


	public int find(int searchKey)
	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;

		while (true)
		{
			curIn = (lowerBound+upperBound)/2;
			if (a[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound)
				return nElems;
			else
			{
				if (a[curIn] > searchKey)
					upperBound = curIn - 1;
				else
					lowerBound = curIn + 1;
			}
		}
	}

	public void swap(int one, int two)
	{
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}





public class SortingSearching
{
	public static void main(String[] args)
	{
		ArrayClass arr = new ArrayClass(10);

		arr.insert(99);
		arr.insert(88);
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);
		arr.insert(44);
		arr.insert(33);
		arr.insert(22);
		arr.insert(11);
		arr.insert(00);

		arr.display();
		arr.insertionSort();
		arr.display();
		System.out.println(arr.find(44));
		System.out.println(arr.delete(44));
		arr.display();
		System.out.println(arr.delete(32));
	}
}