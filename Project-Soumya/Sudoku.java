import java.util.*;
class Sudoku
{
    Scanner sc = new Scanner(System.in);
    char c = 'A'; int r = 1,d; String n;
    int org[][] = new int[9][9];
    String play[][] = new String[9][9];
    public static void main()
    {
        Sudoku ob = new Sudoku();
        ob.accept();
    }
    public void accept()
    {
        System.out.print("Please enter your name : ");
        n = sc.nextLine();
        System.out.print("Choose level :\n1. Classical\n2. Gentle\n3. Diabolical\nPlease choose : ");
        switch((int)sc.nextDouble())
        {
            case 1: d = 15;
            break;
            case 2: d = 9;
            break;
            case 3: d = 5;
            break;
            default:
            System.out.print("WRONG CHOICE!!");
        }
        mboard();
    }
    public void mboard()
    {
        int i = 0, j = 0, h,k;
        while(i < 9)
        {
        }
        part();
    }
    public void part()
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(r == 10)
                {
                    c++;
                    r = 1;
                }
                play[i][j] = Integer.toString(r++)+c;
            }
        }
        for(int i = 0; i < 9; i++)
        {
            System.out.println("----------------------------------------------");
            for(int j = 0; j < 9; j++)
                System.out.print("| "+org[i][j]+" ");
         System.out.println("|");
        }
        System.out.println("----------------------------------------------");
    }
}