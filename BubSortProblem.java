class ArrayBub
{
	private int[] a;
	private int nElems;

	public ArrayBub(int size)
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

	public void sort()
	{
		for (int out=1; out<nElems/2+1; out++)
		{
			for (int in=0; in<nElems-out; in++)
			{
				if (a[in] > a[in+1])
					swap(in, in+1);
				if (in == nElems-out-1)
				{
					for (int out2=nElems-out; out2>out; out2--)
						if (a[out2] < a[out2-1])
						{
							swap(out2, out2-1);
							display();
						}
				}
				display();
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




public class BubSortProblem
{
	public static void main(String[] args)
	{
		ArrayBub arr = new ArrayBub(100);

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
		arr.sort();
		arr.display();
	}
}