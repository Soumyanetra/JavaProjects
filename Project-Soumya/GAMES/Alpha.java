package GAMES;
import java.util.*;
class Alpha
{
    int m = 10, ct = 0, k = 0;
    public void samp(int rc, char c)
    {
        SP sp = new SP();
        System.out.println("\fThe Sample Square : ");
        sp.hi(rc);
        for(int i = 1; i <= rc; i++)
        {
             for(int j = 1; j <= rc; j++)
             {
                   if(j == 1)
                   System.out.print("\t|\t"+(c++)+"\t|");
                   else
                   System.out.print("\t"+(c++)+"\t|");
             }   
             sp.hi(rc);
        }
    }
    public void time(int rc)
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
               samp(rc,'A');
               System.out.println("\nTime left : "+m);
           }
        }
    }
}