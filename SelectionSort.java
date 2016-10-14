class SelectSort
{
	private int[] a;
	private int nElems;

	public SelectSort(int size)
	{
		a = new int[size];
		nElems = 0;
	}

	public void insert(int data)
	{
		a[nElems] = data;
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
		int min, out, in;

		for (out=0; out<nElems-1; out++)
		{
			min = out;
			for (in=out+1; in<nElems; in++)
				if (a[in] < a[min])
					min = in;
			swap(out, min);
		}
	}

	public void swap(int one, int two)
	{
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}





public class SelectionSort
{
	public static void main(String[] args)
	{
		SelectSort arr = new SelectSort(10);

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