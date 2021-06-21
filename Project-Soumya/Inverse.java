import java.util.*;
class Inverse extends M
{
    Inverse(){}
    Inverse(int m)
    {
        A = new int[m][m];
    }
    protected void invh()
    {
        int d;
        am.Accept();
        Inverse(0);
        if((d = Determinant()) == 0)
        {
            System.out.println("The given Matrix is a ‘Singular Matrix!’\nSorry!! No Inverse Possible!!");
            return;
        }
        Adjugate();
        Inverse(d);
    }
    protected int Determinant()
    {
        if(A.length == 2)
            return A[0][0]*A[1][1] - A[0][1]*A[1][0];
        return A[0][0]*(A[1][1]*A[2][2] - A[2][1]*A[1][2]) - A[0][1]*(A[1][0]*A[2][2] - A[2][0]*A[1][2]) + A[0][2]*(A[1][0]*A[2][1] - A[2][0]*A[1][1]);
    }
    protected void Adjugate()
    {
        if(A.length == 2)
        {
            int t = A[0][0];
            A[0][0] = A[1][1];
            A[1][1] = t;
            A[0][1] = -A[0][1];
            A[1][0] = -A[1][0];
            return;
        }
        int B[][] = new int[A.length][A.length];
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                if(i == 0 && j == 0)
                    B[i][j] = A[1][1]*A[2][2]-A[2][1]*A[1][2];
                if(i == 0 && j == 1)
                    B[i][j] = -(A[1][0]*A[2][2]-A[2][0]*A[1][2]);
                if(i == 0 && j == 2)
                    B[i][j] = A[1][0]*A[2][1]-A[2][0]*A[1][1];
                if(i == 1 && j == 0)
                    B[i][j] = -(A[0][1]*A[2][2]-A[2][1]*A[0][2]);
                if(i == 1 && j == 1)
                    B[i][j] = A[0][0]*A[2][2]-A[2][0]*A[0][2];
                if(i == 1 && j == 2)
                    B[i][j] = -(A[0][0]*A[2][1]-A[2][0]*A[0][1]);
                if(i == 2 && j == 0)
                    B[i][j] = A[0][1]*A[1][2]-A[1][1]*A[0][2];
                if(i == 2 && j == 1)
                    B[i][j] = -(A[0][0]*A[1][2]-A[1][0]*A[0][2]);
                if(i == 2 && j == 2)
                    B[i][j] = A[0][0]*A[1][1]-A[1][0]*A[0][1];
            }
        }
        transpose(B);
    }
    private void Inverse(int d)
    {
        String C[][] = new String[A.length][A.length];
        if(d == 0)
        {
            for(int i = 0; i < C.length; i++)
                for(int j = 0; j < C.length; j++)
                    C[i][j] = A[i][j]+"";
            Display("\fORIGINAL MATRIX",C);
        }
        else
        {
            int i = 0,j = 0, h = 0;
            while(i < A.length)
            {
                if((A[i][j] % d) == 0)
                    C[i][j] = Integer.toString((int)(A[i][j]/d));
                else
                {
                    h = gcd(A[i][j],d);
                    if((d > 0 && h > 0) || (d < 0 && h < 0))
                        C[i][j] = (A[i][j]/h)+"/"+(d/h);
                    else
                        C[i][j] = -(A[i][j]/h)+"/"+(-(d/h)); 
                }
                if(++j == A.length)
                {
                    i++; j = 0;
                }
            }
            Display("\n\nINVERSE MATRIX",C);
        }
    }
    private void Display(String k,String C[][])
    {
        System.out.println(k+" :\n");
        int i = 0, j = 0;
        while(i < A.length)
        {
            if(A[i][j] >= 0)
                System.out.print("  "+C[i][j++]+"\t");
            else
                System.out.print(""+C[i][j++]+"\t");
            if(j == A.length)
            {
                i++; j = 0;
                System.out.println();
            }
        }
    }
    private void transpose(int B[][])
    {
        int i = 0, j = 0;
        while(i < A.length)
        {
            A[i][j] = B[j++][i];
            if(j == A.length)
            {
                i++; j = 0;
            }
        }
    }
    protected int gcd(int a, int b)
    {
        if(a%b == 0)
            return b;
        return gcd(b,a%b);
    }
}