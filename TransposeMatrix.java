import java.util.Scanner;

class Matrix
{
	private int[][] mat;
	private int[][] res;
	Scanner input;

	public Matrix(int x, int y)
	{
		mat = new int[x][y];
		res = new int[y][x];
		input = new Scanner(System.in);
	}

	public void insertData()
	{
		System.out.println("Insert data into matrix");
		for (int i=0; i<mat.length; i++)
			for (int j=0; j<mat[i].length; j++)
				mat[i][j] = input.nextInt();
	}

	public void display()
	{
		System.out.println("Matrix is:\n");
		for (int i=0; i<mat.length; i++)
		{
			for (int j=0; j<mat[i].length; j++)
				System.out.print(mat[i][j] +"\t");
			System.out.println();
		}
	}

	public void transpose()
	{
		for (int i=0; i<mat.length; i++)
			for (int j=0; j<mat[i].length; j++)
				res[j][i] = mat[i][j];
		displayResult();
	}

	private void displayResult()
	{
		System.out.println("Transpose matrix is:");
		for (int i=0; i<res.length; i++)
		{
			for (int j=0; j<res[i].length; j++)
				System.out.print(res[i][j] +"\t");
			System.out.println();
		}
	}

}//closed class Matrix



public class TransposeMatrix
{
	public static void main(String[] args)
	{
		Matrix m = new Matrix(2, 3);
		m.insertData();
		m.display();
		m.transpose();
	}
}