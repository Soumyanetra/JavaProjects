class Matrix extends M
{
    protected static void main()
    {
        System.out.print(" \f 1. Multiply Matrix\n 2. Find Inverse of Matrix\n 3. Solve Equations\nEnter your choice : ");
        switch(sc.nextInt())
        {
            case 1: new Matrix_Multiplication().multh(0); return;
            case 2: iv.invh(); return;
            case 3: se.solveq(); return;
            default : System.out.println("\n\nWRONG CHOICE!!");
        }
    }
}