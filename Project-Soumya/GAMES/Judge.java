package GAMES;
import java.io.*;
class Judge extends Acpt
{
    protected static int v = 1, n1 = 0;
    protected void judge() throws IOException
    {
        int c1 = 0, c2 = 0, ct = 0; String z = "";
        for(int i = 0; i < ar.length; i++)
        {
            if(ar[i] == UA[0].length)
            c1++; 
            if(ac[i] == UA[0].length)
            c2++;
        }
        if((c1 >= UA[0].length || c2 >= UA[0].length))
        {
            FileWriter fw = new FileWriter("Bingo Save.doc");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            System.out.print("\n\n GAME OVER!!\nPress 'Enter' to continue : ");
            br.readLine();
            System.out.print("\f");
            v = 0; n1++;
            if(c1 >= UA[0].length && c2 >= UA[0].length)
                System.out.println("\t\tRESULT\n\nDear "+n+",\nIt's a Tie!!");
            else if(c1 >= UA[0].length)
            {
                System.out.println("\t\tRESULT\n\nDear "+n+",\nCongrats!!!\nYou WON!!");
                ct = 1;
            }
            else if(c2 >= UA[0].length)
            {
                System.out.println("\t\tRESULT\n\nSorry!! "+n+",\nYou LOST!!\nBetter luck next time.");
                ct = -1;
            }
            st.write(ct,UA[0].length);
            dp.display();
        }
    }
}