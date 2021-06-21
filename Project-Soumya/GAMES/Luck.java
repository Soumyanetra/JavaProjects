package GAMES;
import java.io.*;
class Luck extends CH
{
    private int c100 = 0, c150 = 0, c200 = 0, c250 = 0;
    protected void play()throws IOException
    {   
        while(ch != 0)
        {
            System.out.print("\fPress 'Enter' to insert a chip : "); 
            if(br.readLine().equalsIgnoreCase("STOP"))
                break;
            ch--;
            System.out.print("CHIP ACCEPTED!!\nPress 'Enter' to roll the dice : "); br.readLine();
            int g = gcontroller((int)((Math.random()*40)+1));
            System.out.println("DEAR "+spec.nm+",\nPATTERN ACHIEVD FOR THIS ROUND IS : "+pat[g-1]+"\nYOU HAVE WON "+g+" CHIP(S)!!");
            if(g > 0 && g <= 6)
            {
                System.out.println("Oops!!\nBETTER LUCK, NEXT TIME!");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
            }
            else if(g <= 14)
            {
                System.out.println("DON'T LOOSE HOPE, TRY AGAIN!"); 
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 1; 
            }
            else if(g <= 18)
            {
                System.out.println("YOUR LUCK IS FAR BETTER, GO ON!!");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 2;
            }
            else if(g <= 22)
            {
                System.out.println("YOU DESERVE EVEN MORE, PROCCED!!");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 5;
            }
            else if(g <= 26)
            {
                System.out.println("WOW!!! '1:10'!!!!");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 10;
            }
            else if(g <= 28)
            {
                System.out.println("GREAT!!!\nYOU ARE DOING WELL");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 20;
            }
            else if(g <= 32)
            {
                System.out.println("Ooooo!!!\nYOU HAVE A FRESH LUCK\nGO FOR A BETTER ONE");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 50;
            }
            else if(g <= 36)
            {
                System.out.println("FASCINATING!!");
                c100 = 0; c150 = 0; c200 = 0; c250 = 0;
                ch += 75;
            }
            else if(g == 37)
            {
                System.out.println("TRIPPLE FIGURES!!!\nA CENTURY!!");
                c150 = 0; c200 = 0; c250 = 0;
                ch += 100; c100++;
            }
            else if(g == 38)
            {
                System.out.println("MINDBLOWING!!!\n'250' IS WAITING FOR YOU!!");
                c100 = 0; c200 = 0; c250 = 0;
                ch += 150; c150++;
            }
            else if(g == 39)
            {
                System.out.println("Ooooh!!ONE STEP SHORT!!!\nTRY FOR IT, YOU HAVE THE POTENTIAL!!");
                c100 = 0; c150 = 0; c250 = 0;
                ch += 200; c200++;
            }
            else if(g == 40)
            {
                System.out.println("SMASHING!!!!HIT IT AGAIN!!");
                c100 = 0; c150 = 0; c200 = 0;
                ch += 250; c250++;
            }
            new Time("", "4s");
            if(ch == 0)
            {
                System.out.print("Oops!!\nCHIPS FINISHED!!Visit counter? (Y/N) : ");
                if(br.readLine().equalsIgnoreCase("Y"))
                    cu.counter();
            }
        }
    }
    int gcontroller(int g)
    {
        if(c100 == 2 && g == 37)
        {
            System.out.println("GREAT LUCK!! A HAT-TRICK OF CENTURY!!!\nYOU ARE AWARDED WITH 200 CHIPS!!");
            c100++;
            return(0);
        }
        else if(c150 == 2 && g == 38)
        {
            System.out.println("GREAT LUCK!! A HAT-TRICK OF 150!!!\nYOU ARE AWARDED WITH 300 CHIPS!!");
            c150++;
            return(0);
        }
        else if(c200 == 4 && g == 39)
        {
            System.out.println("NICELY FLOWED!!\nYOU ARE AWARDED WITH 400 CHIPS!!");
            c200++;
            return(0);
        }
        else if(c250 == 4 && g == 40)
        {
            System.out.println("WHAT A HIT!!\nYOU ARE AWARDED WITH 500 CHIPS!!");
            c250++;
            return(0);
        }
        else if(c100 == 3 || c150 == 3 || c200 == 5 || c250 == 5)
            return(15);
        return g;
    }
}