import java.util.*;
class Valid_sr extends Centre
{
    protected String a, b;
    protected int ct, c1, c2;
    protected boolean hiphenAt(String g)
    {
        StringTokenizer st = new StringTokenizer(g,"-");
        if(((a = st.nextToken().trim()).length() <= 5) && ((b = st.nextToken().trim()).length() <= 5) && valid())
            return true;
        return false;
    }
    protected boolean valid()
    {
        ct = 0; c1 = 0; c2 = 0;
        if((a.length() == b.length()) && a.length() == 1 && (Character.toUpperCase(a.charAt(0)) != Character.toUpperCase(b.charAt(0))))
        {
            if(Character.toUpperCase(a.charAt(0)) > Character.toUpperCase(b.charAt(0)))
                swap();
            return true;
        }
        else if((a.length() == b.length()) && a.length() == 2 && (Character.toUpperCase(a.charAt(0))+Character.toUpperCase(a.charAt(1)) != Character.toUpperCase(b.charAt(0))+Character.toUpperCase(b.charAt(1))))
        {
            if((Character.toUpperCase(a.charAt(0)) == Character.toUpperCase(b.charAt(0))) || (Character.toUpperCase(a.charAt(1)) == Character.toUpperCase(b.charAt(1))))
            {
                if(Character.toUpperCase(a.charAt(0))+Character.toUpperCase(a.charAt(1)) > Character.toUpperCase(b.charAt(0))+Character.toUpperCase(b.charAt(1)))
                    swap();
                return true;
            }
        }
        else if((a.length() >= 2 && b.length() >= 2))
        {
            int i = 0;
            while(++i < a.length())
            {
                if(a.charAt(i) >= '0' && a.charAt(i) <= '9')
                {
                    if(c2 == 0)
                    {
                        c1 = i;
                        c2+= i;
                    }
                    else
                        c2++;
                }
            }
            if(c2 == (a.length()-1) && (a.substring(0,c1).equalsIgnoreCase(b.substring(0,c1))))
                if(Integer.valueOf(a.substring(c1)) != Integer.valueOf(b.substring(c1)))
                {
                     if(Integer.valueOf(a.substring(c1)) > Integer.valueOf(b.substring(c1)))
                        swap();
                     ct = 1;
                     return true;
                }
            if((a.length() == b.length()) && (Character.toUpperCase(a.charAt(0)) != Character.toUpperCase(b.charAt(0))) && a.substring(1).toUpperCase().compareTo(b.substring(1).toUpperCase()) == 0)
            {    
                if(Character.toUpperCase(a.charAt(0)) > Character.toUpperCase(b.charAt(0)))
                    swap();
                return true;
            }
            else if((a.length() == b.length()) && (Character.toUpperCase(a.charAt(a.length()-1)) != Character.toUpperCase(b.charAt(a.length()-1))) && a.substring(0,(a.length()-1)).toUpperCase().compareTo(b.substring(0,(a.length()-1)).toUpperCase()) == 0)
            {
                if(Character.toUpperCase(a.charAt(a.length()-1)) > Character.toUpperCase(b.charAt(a.length()-1)))
                    swap();
                return true;
            }
        }
        return false;
    }
    protected void swap()
    {
        b += a;
        a = b.substring(0,a.length());
        b = b.substring(a.length());
    }
}