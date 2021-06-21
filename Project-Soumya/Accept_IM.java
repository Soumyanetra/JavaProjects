class Accept_IM extends M
{
    protected void Accept()
    {
        int n;
        do
        {
            System.out.print("\fEnter order of 'Matrix' n(2 ≥ n ≤ 3): ");
            n = sc.nextInt();
            if(n == 2 || n == 3)
               break;
        }
        while(true);
        new Inverse(n);
        System.out.println("\fEnter array elements :\n");
        int i = 0,j = 0;
        while(i < A.length)
        {
            A[i][j++] = sc.nextInt();
            if(j == A.length)
            {
                i++; j = 0;
            }
        }
    }
    protected void acceptM()
    {
        System.out.print("\fEnter  number  of Rows  of Matrix-1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number of Columns of Matrix-1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter number of Columns of Matrix-2: ");
        int m2 = sc.nextInt();
        new Matrix_Multiplication(n1,m1,m1,m2,n1,m2);
        System.out.println("\fEnter array elements of Matrix-1("+n1+"x"+m1+"): ");
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < A[0].length; j++)
                A[i][j] = sc.nextInt();
        System.out.println("\nEnter array elements of Matrix-1("+m1+"x"+m2+"): ");
        for(int i = 0; i < B.length; i++)
            for(int j = 0; j < B[0].length; j++)
                B[i][j] = sc.nextInt();
    }
    protected void acceptS()
    {
        int v;
        do
        {
            System.out.print("\fEnter Number of variables n(2 ≥ n ≤ 3): ");
            v = sc.nextInt();
            if(v == 2 || v == 3)
               break;
        }
        while(true);
        new Inverse(v);
        new Solve_Eq(v);
        if(v == 2)
        {
            System.out.print("\fThe Equation should be of the form: Ax+By = D\n\nFor 1st Equation:\nA: ");
            A[0][0] = sc.nextInt();
            System.out.print("B: ");
            A[0][1] = sc.nextInt();
            System.out.print("D: ");
            B[0][0] = sc.nextInt();
            System.out.print("\n\nFor 2nd Equation:\nA: ");
            A[1][0] = sc.nextInt();
            System.out.print("B: ");
            A[1][1] = sc.nextInt();
            System.out.print("D: ");
            B[1][0] = sc.nextInt();
        }
        else
        {
            System.out.print("\fThe Equation should be of the form: Ax+By+Cz = D\n\nFor 1st Equation:\nA: ");
            A[0][0] = sc.nextInt();
            System.out.print("B: ");
            A[0][1] = sc.nextInt();
            System.out.print("C: ");
            A[0][2] = sc.nextInt();
            System.out.print("D: ");
            B[0][0] = sc.nextInt();
            System.out.print("\n\nFor 2nd Equation:\nA: ");
            A[1][0] = sc.nextInt();
            System.out.print("B: ");
            A[1][1] = sc.nextInt();
            System.out.print("C: ");
            A[1][2] = sc.nextInt();
            System.out.print("D: ");
            B[1][0] = sc.nextInt();
            System.out.print("\n\nFor 3rd Equation:\nA: ");
            A[2][0] = sc.nextInt();
            System.out.print("B: ");
            A[2][1] = sc.nextInt();
            System.out.print("C: ");
            A[2][2] = sc.nextInt();
            System.out.print("D: ");
            B[2][0] = sc.nextInt();
        }
    }
}