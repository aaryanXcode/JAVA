class Matrix
{
	int matrix[][]=new int[3][3];
	void setMatrix()
	{
		my_io in=new my_io();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=in.read_Int("enter element in"+i+j+"position\n");
			}
		}
	}
	void show()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println("\n");
		}
	}
	Matrix add(Matrix B)
	{
		Matrix Z=new Matrix();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Z.matrix[i][j]=matrix[i][j]+B.matrix[i][j];
			}
		}
		return Z;
	}
}
class MatrixAddition
{
	public static void main(String args[])
	{
		Matrix a=new Matrix();
		Matrix b=new Matrix();
		Matrix c=new Matrix();
		a.setMatrix();
		b.setMatrix();
		c=a.add(b);
		c.show();
	}
}
		