package GAMES;
import java.io.*;
class Soft extends CH
{
    Node header;
    protected Node soft(String v, int id, int t, int u, char z, int x, int n)
    {
        Node nn = new Node(v,id,t,u,z,x);
        if(n == 0)
        header = nn;
        else
        {
            Node temp = header;
            while(temp.link != null)
                temp = temp.link;
            temp.link = nn;
        }
        return nn;
    }
    protected boolean exists(String n, int id)throws IOException
    {
        spec = header;
        while(spec != null)
        {
            if(spec.r == id && spec.nm.equalsIgnoreCase(n))
                return true;
            spec = spec.link;
        }
        return false;
    }
    protected void record()throws IOException
    {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("GAMBLE RECORD.doc")));
        Node temp = header;
        while(temp != null)
        {
            pw.println(temp.nm+"\n"+temp.r+"\n"+temp.w+"\n"+temp.s+"\n"+temp.l+"\n"+temp.db);
            temp = temp.link;
        }
        pw.close();
    }
    int countnode()
    {
        int c = 0;
        Node temp = header;
        while(temp != null)
        {
            temp = temp.link;
            c++;
        }
        return(c);
    }
}
class Node extends CH
{
    Node link;
    Node(String n,int d,int a,int b,char x, int c)
    {
        nm = n;
        r = d;
        w = a;  s = b;
        l = x;
        db = c;
        link = null;
    }
}