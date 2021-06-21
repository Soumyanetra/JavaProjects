import java.util.*;
import java.io.*;
class Welth
{
    private int c = 0;
    private String n = "";
    void welcome()throws IOException
    {
        if(c == 0)
        {
            n = "W E L C O M E\t T O\tT H E\tW O R L D\tO F\t Q U I Z";
            System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t   ");
        }
        else
        {
           n = "KNOWLEDGE IS WHAT WE COUNT!!";
           System.out.print("\n\n\t\t\t\t\t\t\t\t\t");
        }
        di(n,"500");
        if(++c == 1)
            welcome();
        c = 0;
        new Delay("","2s");
    }
    void thank()throws IOException
    {
        System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t  ");
        n = "T H A N K\t   Y O U!!";
        di(n,"600");
        new Delay("","2s");
    }
    void bol()throws IOException
    {
        System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t   ");
        n = "B E S T\t\tO F\t\tL U C K !!";
        di(n,"750");
        new Delay("","3s");
        wish();
    }
    void wish()throws IOException
    {
        if(c == 0)
        {
            System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t!! ");
            n = "T H I N K\tB I G";
        }
        else
        {
           n = "A C T\t  B I G G E R";
           System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t ");
        }
        di(n,"550");
        if(++c == 1)
            wish();
        if(c == 2)
        {
            System.out.println(" !!");
            new Delay("","850");
            System.out.println("\f");
            new Delay("","400");
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t!! T H I N K\tB I G\n\n\t\t\t\t\t\t\t\t\t\t\t A C T\t  B I G G E R !!");
        }
        c = 0;
        new Delay("","2s");
    }
    void di(String n,String d)throws IOException
    {
        int i = 0;
        while(i < n.length())
        {
              if( (n.charAt(i++) != ' ' && c == 0) || (i < n.length() && n.charAt(i) == ' ' && c != 0) )
              new Delay(n.charAt(i-1)+" ",d);
              else if(n.charAt(i-1) == ' ')
              continue;
              else
              new Delay(n.charAt(i-1)+"",d);
        }
    }
}