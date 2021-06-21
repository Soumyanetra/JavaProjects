package GAMES;
import java.io.*;
class Grid extends Acpt
{
    protected void me()throws IOException
    {
        int h = 0, x; String a = "";
        do
        {
            x = 0; mec(x); x = 1;
            for(int i = 0; i < UA[0].length; i++)
            {
                for(int j = 0; j < UA[1].length; j++)
                {
                    UA[i][j] = CA[i][j];
                    CA[i][j] = 0;
                }
            }
            dp.display(); 
            h++;
            System.out.print("\nEither Press 'Enter' to confirm your grid OR\nPress any key and then press 'Enter' for a new grid : ");
            a = br.readLine();
            if(a.equals("") == false && h > 4)
            {
                System.out.println("\nDear "+n+",\nYou have crossed your limits!!\nSorry!! We have no other choices for you.\nPlease fill your won grid yourself.\n");
                at.you();
                break;
            }
        }
        while(a.equals("") == false);
        mec(x);
    }
    protected void mec(int x)throws IOException
    {
        int m = 1, i = 0, j = 0;
        while(m <= (UA[0].length*UA[1].length))
        {
             int c = (int)((Math.random()*(UA[0].length*UA[1].length))+1);
             c = at.check(0,c);
             if(c > 0)
             {
                 CA[i][j] = c;
                 j++;
                 if(j == UA[0].length && i < UA[0].length)
                 {
                     i++; j = 0;
                 }
                 m++;
             }
        }
        if(x != 0)
        gr.ground();
    }
}