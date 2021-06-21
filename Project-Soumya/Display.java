import java.io.*;
import java.util.*;
class Display  extends Centre
{
    protected void round(String r,int c)throws IOException
    {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Quiz Details.doc",true)));
        dt.d_t();
        if(c == 1)
             pw.println("\t\tW E L C O M E!!  TO '"+nm+"' QUIZ COMPETITION\n\t\t\t\tSession : "+dt.yr+" - "+(Integer.valueOf(dt.yr)+1)%2000);
        pw.println("\n\nDATE : "+dt.de+"\t\t\t  TIME :   "+dt.tm+"\n\n\t\t\t\t\tR O U N D : "+r+"\n\n\n\t   ~*~*~*~*~*~*~*~*~* S C O R E - B O A R D *~*~*~*~*~*~*~*~*~\n");
        ga.traverse(pw);
        max(pw);
        pw.close();
    }
    void max(PrintWriter pw)
    {
        rk.rank();
        int m = ga.header1.score;
        String st = "";
        Group temp = ga.header1;
        while(temp != null)
        {
            if(temp.score == m)
            st += temp.gn+"~";
            temp = temp.link;
        }
        StringTokenizer ss = new StringTokenizer(st,"~");
        pw.print("\n\t=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t Leading Group(s) : Group (");
        Ledgr(pw, ss);
        pw.println("\tSCORE : "+m+"\n\t=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\n");
    }
    void Ledgr(PrintWriter pw, StringTokenizer ss)
    {
        int to = ss.countTokens(), t = 0;
        while(ss.hasMoreTokens())
        {
            if(to-++t > 0)
                pw.print(ss.nextToken()+", ");
            else
                pw.print(ss.nextToken()+")");
        }
    }
}