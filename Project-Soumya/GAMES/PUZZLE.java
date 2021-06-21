package GAMES;
import java.io.*;
class PUZZLE
{
    static SP sp = new SP();
    public static void main()throws IOException
    {
        Time tm = new Time("P U Z Z L E","10s");
        System.out.println("\f\t\t\tW E L C O M E !! TO THE WORLD OF PUZZLES\n\n");
        sp.display();
        System.out.println("\n\n\t\t\tT H A N K     Y O U\n\t\t    P L A Y\t\tA G A I N");
    }
    public void display(String pz[][], String na, char w)
    {
        if(w == 'W')
        System.out.println("\nYour square : ");
        else
        System.out.println("\fNOTE : To Exit instatntly, you can enter 'EXIT' while playing.\n\nDear "+na+",\nYour square : ");
        sp.hi(pz[0].length);
        for(int i = 0; i < pz[0].length; i++)
        {
            for(int j = 0; j < pz[1].length; j++)
            {
               if(j == 0)
                System.out.print("\t|\t"+pz[i][j]+"\t|");
                else
                System.out.print("\t"+pz[i][j]+"\t|");
            }
            sp.hi(pz[0].length);
        }
    }
}