/*
Bubble sort time complexity = O(n^2)
*/

public class BubSort
{
	public static void main(String[] args)
	{
		int length = 100;

		int[] arr = new int[length];

		for (int i=length; i>0; i--)
			arr[Math.abs(i-length)] = i;

		for (int i=0; i<length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();

		//bubble sort
		for (int i=1; i<length; i++)
			for (int j=0; j<length-i; j++)
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

		for (int i=0; i<length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}
}