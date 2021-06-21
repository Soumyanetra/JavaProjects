package GAMES;
import java.util.*;
class Check extends Acpt
{
    int checkv(String g,int f)
    {
        int x = 0; 
        String d = "";
        if(f == 0)
        d = "number of rows between (3-7)";
        else
        d = "your choice";
        while(x < g.length())
        {
            if((g.charAt(x++) < '0' || g.charAt(x-1) > '9') && g.charAt(x-1) != '-' && g.charAt(x-1) != '+')
            {
                x = 0; 
                break;
            }
        }
        if( x == 0 || g.equals("-") || g.equals("+"))
        {
            System.out.print("\n=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\tINVALID NUMBER FORMAT!!\n=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\nRenter "+d+" : ");
            return checkv(sc.next()+sc.nextLine(),f);
        }
        else
        return Integer.valueOf(g);
    }
}