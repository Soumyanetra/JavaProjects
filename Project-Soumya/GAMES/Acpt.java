package GAMES;
import java.io.*;
class Acpt extends BC
{
    Acpt(){}
    Acpt(int rc)
    {
         UA = new int[rc][rc];
         CA = new int[rc][rc];
         ar = new int[2*rc+2];
         ac = new int[2*rc+2];
    }
    protected void accept()throws IOException
    {
        int rc; jd.v = 1; jd.n1 = 0;
        System.out.print("\f\n\nDear user,\n\nPlease enter your full name : ");
        n = (sc.next()+sc.nextLine()).trim();
        do
        {
              System.out.print("\nPlease enter number of rows between (3-7) : ");
              if((rc = ck.checkv(sc.next(),0)) < 3 || rc > 7)
              System.out.println("INVALID ENTRY!!");
        }
        while(rc < 3 || rc > 7);
        new Acpt(rc);
        choice(0);
    }
    protected void you()throws IOException
    { 
        int p = 1;
        System.out.println("\f\nDear "+n+",\nPlease fill up your "+UA[0].length+" x "+UA[1].length+" - Bingogrid by entering any number between 1 - "+(UA[0].length*UA[1].length)+", without repeating.\nThe numbers will be stored row wise.\n");
        for(int i = 0; i < UA[0].length; i++)
        {
            for(int j = 0; j < UA[1].length; j++)
            {
                if(p == 1)
                System.out.print("Enter "+(p++)+"st unique number between (1 - "+(UA[0].length*UA[1].length)+"): ");
                else if(p == 2)
                System.out.print("Enter "+(p++)+"nd unique number between (1 - "+(UA[0].length*UA[1].length)+"): ");
                else if(p == 3)
                System.out.print("Enter "+(p++)+"rd unique number between (1 - "+(UA[0].length*UA[1].length)+"): ");
                else
                System.out.print("Enter "+(p++)+"th unique number between (1 - "+(UA[0].length*UA[1].length)+"): ");
                int c = (int)(sc.nextDouble());
                c = check(2,c);
                if(c < 1 || c > (UA[0].length*UA[1].length))
                {
                    System.out.println("Sorry!!\nThe entered number is not acceptable!!\nPlease re-enter a acceptable number.");
                    j--;p--;
                }
                else
                UA[i][j] = c;
            }
        }
        System.out.println("\f");
        dp.display();
        gd.mec(1);
    }
    protected int check(int d, int c)
    {
        for( int k = 0; k < UA[0].length; k++)
        {
             for(int l = 0; l < UA[1].length; l++)
             {
                  if(c == CA[k][l]||(d == 2 && c == UA[k][l]))
                  c = 0;
             }
             if(c == 0)
             break;
        }
        return(c);
    }
    protected void choice(int i)throws IOException
    {
        if(i == 0)
        System.out.print("\f\nDear "+n+",\nPlease choose :\n\n1. Fill your grid by yourself.\n2. Ask me to provide you a grid.\n\nPlease enter your choice : ");
        switch(ck.checkv(sc.next(),1))
        {
            case 1: //System.out.print("\f"); 
            you();
            break;
            case 2: //System.out.print("\f"); 
            gd.me();
            break;
            default: System.out.println("Invalid Choice !!!!\n\n\nRenter your choice : ");
                     choice(1);
        }
    }
}