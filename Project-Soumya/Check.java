class Check extends Centre
{
    int checkv(String g,int f)
    {
        int x = 0; 
        String d = "";
        if(f == 0)
        d = "Points to be awarded or dewarded\t\t    ";
        else
        d = "Number of groups to be eliminated ";
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
            System.out.print("\n=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\tINVALID NUMBER FORMAT!!\n=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\nRenter "+d+": ");
            return checkv(sc.next()+sc.nextLine(),f);
        }
        else
        return Integer.valueOf(g);
    }
    boolean check(String c)
    {
        Group temp = ga.header1;
        while(temp.link != null)
        {
            if(temp.gn.equalsIgnoreCase(c))
            {
                ga.deletenth(ga.countnode());
                return false;
            }
            temp = temp.link;
        }
        return true;
    }
    boolean checkf(String c)
    {
        Group temp = ga.header1;
        while(temp != null)
        {
            if(temp.gn.equalsIgnoreCase(c))
            return true;
            temp = temp.link;
        }
        return false;
    }
}