import java.util.*;
class Durate//For correct inputs
{
    Durate(String n, String t)
    {
        StringTokenizer stm = new StringTokenizer(t,"m");
        StringTokenizer sts = new StringTokenizer(t,"s");
        String a = "", b = "";
        if(stm.countTokens() == 2 || t.charAt(t.length()-1) == 'm')
            min(Integer.valueOf(a = stm.nextToken()));
        if(sts.countTokens() == 2 || t.charAt(t.length()-1) == 's')
        {
            if(a.equals(""))
               sec(Integer.valueOf(b = sts.nextToken()));
            else
               sec(Integer.valueOf((b = sts.nextToken()).substring(a.length()+1)));
        }
        if(stm.countTokens() == sts.countTokens() && (t.charAt(t.length()-1) >= '0' && t.charAt(t.length()-1) <= '9'))
        {
            if(a.equals("") && b.equals(""))
                milli(Integer.valueOf(t));
            else if(a.length() > 0 && b.equals(""))
                milli(Integer.valueOf(stm.nextToken()));
            else if(b.length() > 0 && a.equals(""))
                milli(Integer.valueOf(sts.nextToken()));
            else
                milli(Integer.valueOf(t.substring(b.length()+1)));
        }
    }
    void min(int m)
    {
        if(m-- != 0)
        {
            sec(59);
            min(m);
        }
        sec(1);
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