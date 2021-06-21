class Matrix_Multiplication extends M
{
    Matrix_Multiplication(){}
    Matrix_Multiplication(int a, int b,int c, int d, int e, int f)
    {
        A = new int[a][b];
        B = new int[c][d];
        R = new int[e][f];
    }
    protected void multh(int f)
    {
        if(f == 0)
            am.acceptM();
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < B[0].length; j++)
                for(int k = 0; k < B.length; k++)
                    R[i][j] += A[i][k]*B[k][j];
        if(f == 0)
            display();
    }
    private void display()
    {
        System.out.println("\fMatrix-1:\n");
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
                System.out.print(A[i][j]+"\t");
            System.out.println();
        }
        System.out.println("\nMatrix-2:\n");
        for(int i = 0; i < B.length; i++)
        {
            for(int j = 0; j < B[0].length; j++)
                System.out.print(B[i][j]+"\t");
            System.out.println();
        }
        System.out.println("\nProduct Matrix:\n");
        for(int i = 0; i < R.length; i++)
        {
            for(int j = 0; j < R[0].length; j++)
                System.out.print(R[i][j]+"\t");
            System.out.println();
        }
    }
}