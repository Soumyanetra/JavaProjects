package GAMES; 
import java.util.*;
import java.io.*;
class Time
{
    Time(String n, String t)throws IOException
    {
        System.out.print(n);
        n = "";
        StringTokenizer sts = new StringTokenizer(t,"s");
        if(sts.countTokens() == 2 || t.charAt(t.length()-1) == 's')
               sec(Integer.valueOf(n = sts.nextToken()));
        if(t.charAt(t.length()-1) >= '0' && t.charAt(t.length()-1) <= '9')
        {
            if(n.equals(""))
                milli(Integer.valueOf(t));
            else
                milli(Integer.valueOf(sts.nextToken()));
        }
    }
    void sec(int s)
    {
        GregorianCalendar date = new GregorianCalendar();
        s += date.get(Calendar.SECOND);
        if(s >= 60)
        s -= 60;
        while(true)
        {
           GregorianCalendar dt = new GregorianCalendar();
           if(dt.get(Calendar.SECOND) == s)
           break;
        }
    }
    void milli(int ms)
    {
        GregorianCalendar date = new GregorianCalendar();
        ms += date.get(Calendar.MILLISECOND);
        if(ms >= 1000)
        ms -= 1000;
        while(true)
        {
           GregorianCalendar dt = new GregorianCalendar();
           if(dt.get(Calendar.MILLISECOND) == ms)
           break;
        }
    }
}