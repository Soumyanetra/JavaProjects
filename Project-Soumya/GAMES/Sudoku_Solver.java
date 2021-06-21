package GAMES;
import java.util.*;
class Sudoku_Solver
{
    protected static int A[][] = new int[9][9];
    protected static void main()
    {
        Sudoku_Solver ss = new Sudoku_Solver();
        ss.accept();
        Start st = new Start();
        st.start();
    }
    protected void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given numbers in respective positions: ");
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                A[i][j] = sc.nextInt();
    }
    protected void display()
    {
        System.out.println("\f=========================================");
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(A[i][j] != 0)
                {
                    if(j == 0)
                        System.out.print("ǁǁ "+A[i][j]+" |");
                    else if(j == 2 || j == 5 || j == 8)
                        System.out.print(" "+A[i][j]+" ǁǁ");
                    else
                        System.out.print(" "+A[i][j]+" |");
                }
                else
                {
                    if(j == 0)
                        System.out.print("ǁǁ   |");
                    else if(j == 2 || j == 5 || j == 8)
                        System.out.print("   ǁǁ");
                    else
                        System.out.print("   |");
                }
            }
            if(i == 2 || i == 5 || i == 8)
                System.out.println("\n=========================================");
            else
                System.out.println("\n-----------------------------------------");
        }
    }
}