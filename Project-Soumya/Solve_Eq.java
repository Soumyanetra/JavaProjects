class Solve_Eq extends M
{
    Solve_Eq(){}
    Solve_Eq(int n)
    {
        B = new int[n][1];
        R = new int[n][1];
    }
    protected void solveq()
    {
        int d;
        am.acceptS();
        Display();
        iv.Adjugate();
        mm.multh(1);
        if((d = iv.Determinant()) == 0)
            if(R[0][0] != 0 || R[1][0] != 0 || R[2][0] != 0)
                System.out.println("\nTHE SYSTEM OF EQUATIONS IS INCONSISTENT!!");
            else
                System.out.println("\nTHE SYSTEM OF EQUATIONS HAS INFINITELY MANY SOLUTIONS!!");
        else if(B[0][0] == 0 && B[1][0] == 0 && B[2][0] == 0)
            if(d == 0)
            {
                System.out.println("\nTHE SYSTEM OF EQUATIONS IS HOMOGENEOUS!!\nONLY TRIVIAL SOLUTION EXIST\n\nx = 0\ny = 0");
                if(B.length == 3)
                   System.out.println("z = 0");
            }
            else
                System.out.println("\nTHE SYSTEM OF EQUATIONS IS HOMOGENEOUS!!\nTRIVIAL SOLUTION EXIST\nTHE SYSTEM OF EQUATIONS HAS INFINITELY MANY SOLUTIONS!!");
        else
        findsol(d);
    }
    protected void findsol(int d)
    {
        String C[][] = new String[R.length][1];
        int i = 0, h = 0;
        while(i < R.length)
        {
            if((R[i][0] % d) == 0)
                C[i][0] = Integer.toString((int)(R[i][0]/d));
            else
            {
                h = iv.gcd(R[i][0],d);
                if((d > 0 && h > 0) || (d < 0 && h < 0))
                    C[i][0] = (R[i][0]/h)+"/"+(d/h);
                else if(h != 0)
                     C[i][0] = -(R[i][0]/h)+"/"+(-(d/h));
            }
            i++;
        }
        System.out.println("\nSOLUTION:\n=========\n\nx = "+C[0][0]+"\ny = "+C[1][0]);
        if(R.length == 3)
           System.out.println("z = "+C[2][0]);
    }
    private void Display()
    {
        System.out.println("\fTHE GIVEN EQUATIONS:\n====================\n");
        for(int i = 0; i < A.length; i++)
            if(A.length == 2)
                System.out.println(A[i][0]+"x+"+A[i][1]+"y = "+B[i][0]);
            else
                System.out.println(A[i][0]+"x+"+A[i][1]+"y+"+A[i][2]+"z = "+B[i][0]);
    }
}