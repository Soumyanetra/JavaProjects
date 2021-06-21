import java.io.*;
class Findtie extends Centre
{
    protected void findtie()throws IOException
    {
        Group temp = ga.header1;
        int t = temp.score, c = 0,ti = 1;
        while(c++ < 3)
        { 
            temp = temp.link;
            if(temp == null || (t != temp.score && ti == 1))
            break;
            if(temp.score == t)
            ti++;
            else
            t = temp.score;
        }
        if(ti > 1)
        {
            ga.split(ti+1);
            ga.header2 = null;
            tb.tiebreaker();
        }
    }
}