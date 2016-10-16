import java.util.Scanner;

class Matrix
{
	private int[][] mat1;
	private int[][] mat2;
	private int[][] res;
	Scanner input;

	public Matrix(int x, int y, int p, int q)
	{
		if (y == p)
		{
			mat1 = new int[x][y];
			mat2 = new int[p][q];
			res = new int[x][q];
			input = new Scanner(System.in);
		}
		else
		{
			System.out.println("Given matrices cannot be multiplied.");
			System.exit(1);
		}
	}


	public void insertMat1()
	{
		System.out.println("Insert the data into matrix 1");
		for (int i=0; i<mat1.length; i++)
			for (int j=0; j<mat1[i].length; j++)
				mat1[i][j] = input.nextInt();
	}


	public void insertMat2()
	{
		System.out.println("Insert the data into matrix 2");
		for (int i=0; i<mat2.length; i++)
			for (int j=0; j<mat2[i].length; j++)
				mat2[i][j] = input.nextInt();
	}


	public void display()
	{
		System.out.println("Matrix 1:\n");
		for (int i=0; i<mat1.length; i++)
		{
			for (int j=0; j<mat1[i].length; j++)
				System.out.print(mat1[i][j] +"\t");
			System.out.println();
		}

		System.out.println();

		System.out.println("Matrix 2:\n");
		for (int i=0; i<mat2.length; i++)
		{
			for (int j=0; j<mat2[i].length; j++)
				System.out.print(mat2[i][j] +"\t");
			System.out.println();
		}
	}


	public void multiply()
	{
		int sum=0;
		for (int i=0; i<mat1.length; i++)
		{
			for (int j=0; j<mat2[0].length; j++)
			{
				for (int k=0; k<mat2.length; k++)				//or mat1[0].length can be used here
				{
					sum += mat1[i][k]*mat2[k][j];
				}
				res[i][j] = sum;
				sum=0;
			}
		}
		displayResult();

	}//closed multiply()

	private void displayResult()
	{
		System.out.println();
		System.out.println("Resultant matrix is:");
		for (int i=0; i<res.length; i++)
		{
			for (int j=0; j<res[i].length; j++)
				System.out.print(res[i][j] +"\t");
			System.out.println();
		}
	}

}//closed Matrix class





public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		Matrix m = new Matrix(2, 3, 3, 2);

		m.insertMat1();
		m.insertMat2();
		m.display();

		m.multiply();
	}
}