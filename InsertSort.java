class ArrayIn
{
	private int[] a;
	private int nElems;

	public ArrayIn(int size)
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

	public void inSort()
	{
		for (int out=1; out<nElems; out++)
		{
			int temp = a[out];
			int in = out;
			while (in>0 && a[in-1]>=temp)
			{
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

}




public class InsertSort
{
	public static void main(String[] args)
	{
		ArrayIn arr = new ArrayIn(5);

		arr.insert(99);
		arr.insert(88);
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);

		arr.display();
		arr.inSort();
		arr.display();

	}
}