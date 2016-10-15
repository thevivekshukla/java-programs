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

	public void insertRandom()
	{
		for (int i=0; i<a.length; i++)
			a[i] = (int) (Math.random() * 1000);
	}

	public void display()
	{
		for (int i=0; i<nElems; i++)
			System.out.print(a[i] +" ");
		System.out.println();
	}


	public void bSort()
	{
		for (int i=1; i<nElems; i++)
			for (int j=0; j<nElems-i; j++)
				if (a[j] > a[j+1])
					swap(j, j+1);
	}


	public void sSort()
	{
		int min;

		for (int i=0; i<nElems-1; i++)
		{
			min = i;
			for (int j=i+1; j<nElems; j++)
				if (a[j]<a[min])
					min = j;
			swap(i, min);
		}
	}


	public void swap(int one, int two)
	{
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}




public class SortApp
{
	public static void main(String[] args)
	{
		int size = 5;
		ArrayClass arr = new ArrayClass(size);

		arr.insert(99);
		arr.insert(88);
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);

		arr.display();

		arr.bSort();
		arr.display();

		arr.insertRandom();
		arr.display();
		arr.sSort();
		arr.display();
	}
}