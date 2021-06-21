import java.io.*;
class Group_Ac
{
    static protected Group header1 = null, header2 = null;
    void insert(String gn, int v)
    {
        Group gr = new Group(gn,v);
        if(countnode() == 0)
        header1 = gr;
        else
        {
            Group temp = header1;
            while(temp.link != null)
                temp = temp.link;
            temp.link = gr;
        }
    }
    int presentnth(String c)
    {
        Group temp = header1;
        int n = 1;
        while(temp != null)
        {
            if(temp.gn.equalsIgnoreCase(c))
                return n;
            n++;
            temp = temp.link;
        }
        return 0;
    }
    void deletenth(int m)
    {
        int n = 0;
        if(m > 1)
        {
            Group temp = header1;
            while(n++ != m-2)
            temp = temp.link;
            temp.link = temp.link.link;
        }
        else
            header1 = header1.link;
    }
    int countnode()
    {
        int ct = 0;
        Group temp = header1;
        while(temp != null)
        {
            temp = temp.link;
            ct++;
        }
        return(ct);
    }
    void insertnth(int m, String c)
    {
        Group temp = header1;
        while(temp != null)
        {
            if(temp.gn.equalsIgnoreCase(c))
            {
                temp.score += m;
                return;
            }
            temp = temp.link;
        }
    }
    void rein()
    {
        Group temp = header1;
        while(temp != null)
        {
            insertnth(-temp.score,temp.gn);
            temp = temp.link;
        }
    }
    void split(int p)
    {
        Group temp = header1;
        int m = 1;
        while((m++ < p-1) && temp != null)
        temp = temp.link;
        if(temp != null)
        {
            header2 = temp.link;
            temp.link = null;
        }
    }
    void traverse(PrintWriter pw)
    {
        Group temp = header1;
        int i = 0;
        while(temp != null)
        {
            if(temp.score >= 0)
                positive(pw, temp, ++i);
            else
                negative(pw, temp, ++i);
            temp = temp.link;
        }
    }
    void positive(PrintWriter pw, Group tp, int i)
    {
         if(tp.score > 99)
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE :   "+tp.score);
         else if(tp.score > 9)
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE :    "+tp.score);
         else 
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE :     "+tp.score);
    }
    void negative(PrintWriter pw, Group tp, int i)
    {
         if(tp.score < -99)
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE : - "+Math.abs(tp.score));
         else if(tp.score < -9)
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE : -  "+Math.abs(tp.score));
         else 
         pw.println("\n\t\t"+i+"\tGroup ("+tp.gn+")   \t\t\tSCORE : -   "+Math.abs(tp.score));
    }
}
class Group
{
    protected Group link;
    protected String gn;
    protected int score;
    Group(String n, int d)
    {
        gn = n;
        score = d;
        link = null;
    }
}