class Name_Gr extends Centre
{
    private String c1, c2;
    protected int name(String a, String b)
    {
        c1 = ""; c2 = "";
        if(a.length() == b.length() && a.length() == 1)
            write(a.charAt(0),b.charAt(0));
        else if(a.length() == b.length() && a.length() == 2)
        {
            if(Character.toUpperCase(a.charAt(0)) == Character.toUpperCase(b.charAt(0)))
            {
                c1 = a.charAt(0)+"";
                if( ((Character.toUpperCase(a.charAt(1)) >= 'A' && Character.toUpperCase(a.charAt(1)) <= 'Z') && (Character.toUpperCase(b.charAt(1)) >= 'A' && Character.toUpperCase(b.charAt(1)) <= 'Z')) || ((a.charAt(1) >= '0' && a.charAt(1) <= '9') && ((b.charAt(1) >= '0' && b.charAt(1) <= '9'))) )
                write(a.charAt(1),b.charAt(1));
            }
            else if(Character.toUpperCase(a.charAt(1)) == Character.toUpperCase(b.charAt(1)))
            {
                c2 = a.charAt(1)+"";
                write(a.charAt(0),b.charAt(0));
            }
        }
        else if(vs.ct == 1)
        {
            int n1, n2;
            c1 = a.substring(0,vs.c1);
            n1 = Integer.valueOf(a.substring(vs.c1));
            n2 = Integer.valueOf(b.substring(vs.c1));
            while(n1 <= n2)
            {
                 ga.insert(c1+n1,0);
                 ck.check(c1+(n1++));
            }
        }
        else
        {
            if(Character.toUpperCase(a.charAt(0)) < Character.toUpperCase(b.charAt(0)))
            {
                c2 = a.substring(1);
                write(a.charAt(0),b.charAt(0));
            }
            else
            {
                c1 = a.substring(0,a.length()-1);
                write(a.charAt(a.length()-1),b.charAt(a.length()-1));
            }
        }
        return 1;
    }
    protected void write(char a, char b)
    {
        while(Character.toUpperCase(a) <= Character.toUpperCase(b))
        {
            if((c1+a+c2).equalsIgnoreCase("NMG") || (c1+a+c2).equalsIgnoreCase("DFF") || (c1+a+c2).equalsIgnoreCase("RC") || (c1+a+c2).equalsIgnoreCase("END"))
            {
                a++;
                continue;
            }
            ga.insert(c1+a+c2,0);
            ck.check(c1+(a++)+c2);
        }
    }
}