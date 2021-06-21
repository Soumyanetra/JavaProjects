package GAMES;
import java.util.*;
import java.io.*;
class JUMBLE_WORDS
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        JW jw = new JW();
        Library lb = new Library();
        do
        {
            System.out.print("\f1. PLAY\n2. ADD NEW WORD TO LIBRARY");
            switch((int)sc.nextDouble())
            {
                case 1:
                jw.play();
                return;
                case 2:
                lb.library();
                return;
                default:
                System.out.print("WRONG CHOICE!!\n\n\nPress 'Enter' to continue : ");
                br.readLine();
            }
        }
        while(true);
    }
}