package GAMES;
import java.io.*;
import java.util.*;
class SP
{
    Scanner sc = new Scanner(System.in);
    int m = 10, ct = 0, k = 0;
    public void display()throws IOException
    {
        int rc;
        System.out.print("\nEnter your 'Name' : ");
        String na = (sc.next()+sc.nextLine()).trim();
        System.out.print("Dear "+na+",\nDo you want to continue with the previous square(Y/N) : ");
        if(sc.next().toUpperCase().charAt(0) == 'Y')
        {
           Read_Write rw = new Read_Write();
           rw.read(na);
        }
        else
        {
            do
            {
                System.out.print("\nEnter Number of 'Rows or Columns' in\nthe grid within a range of 3 to 5   : ");
                rc = sc.nextInt();
                if(rc < 3 || rc > 5)
                System.out.println("INVALID RANGE!!");
            }
            while(rc < 3 || rc > 5);
            choice(rc,na);
        }
    }
    public void choice(int rc, String na)throws IOException
    {
        System.out.print("\n\t\tM E N U\n\n1. Number Square\n2. Alphabet Square\n\nEnter your choice : ");
        switch(sc.next().charAt(0))
        {
            case '1': time(rc); 
            Play pl = new Play();
            pl.ground(rc,na);
            break;
            case '2': Alpha al = new Alpha(); 
            al.time(rc);
            Plac pc = new Plac();
            pc.ground(rc,na);
            break;
            default:
            System.out.println("WRONG CHOICE!!");
        }
    }
    public void samp(int rc, int c)throws IOException
    {
        System.out.println("\fThe Sample Square : ");
        hi(rc);
        for(int i = 1; i <= rc; i++)
        {
             for(int j = 1; j <= rc; j++)
             {
                   if(j == 1)
                   System.out.print("\t|\t"+(c++)+"\t|");
                   else
                   System.out.print("\t"+(c++)+"\t|");
             }   
             hi(rc);
        }
    }
    public void time(int rc)throws IOException
    {
        while(m >= 0)
        {
           GregorianCalendar date = new GregorianCalendar();
           int c = date.get(Calendar.SECOND);
           if(ct == 0)
           {    k = c; ct++;}
           if(k == c-1)
           {
               k = c;
               if(k == 59)
               k = 0;
               if((m--) >= 0)
               samp(rc,1);
               System.out.println("\nTime left : "+m);
           }
        }
    }
    public void hi(int rc)
    {
        if(rc == 3)
        System.out.println("\n\t-------------------------------------------------");
        else if(rc == 4)
        System.out.println("\n\t-----------------------------------------------------------------");
        else
        System.out.println("\n\t---------------------------------------------------------------------------------");
    }
}