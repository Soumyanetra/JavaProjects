package GAMES;
import java.io.*;
class HT extends Acpt
{
    protected boolean toss()throws IOException
    {
        System.out.print("\f\n\t~~~~~~~~~~*WELCOME TO THE TOSS CERYMONY*~~~~~~~~~~\n\nDear "+n+",\nPlease choose : \n\n1. Head\n2. Tail\n\nPlease enter your choice : ");
        if((int)(Math.random()*2) == ((int)sc.nextDouble()-1))
        {
            System.out.println("Congrats!! You won the toss!\nDear "+n+", try and win the game too!!!\n");
            new Time("","3s");
            System.out.println("\f");
            return(true);
        }
        else
        {
            System.out.println("Sorry!! You lost the toss!\nDear "+n+", don't be upset, try and win the game!!!\n");
            new Time("","3s");
            System.out.println("\f");
            return(false);
        }
    }
}