package GAMES;
import java.io.*;
class CZ extends Acpt
{
    protected void zero(int call,int h)throws IOException
    {
        for(int i = 0; i < UA[0].length; i++)
        {
             for(int j = 0; j < UA[1].length; j++)
             {
                 if(call == UA[i][j])
                      UA[i][j] = 0;
                 if(call == CA[i][j])
                      CA[i][j] = 0;
             } 
        }
        countzero(h);
    }
    protected void countzero(int h)throws IOException
    {   
        for(int i = 0; i < ar.length; i++)
        {
            ar[i] = 0; ac[i] = 0;
        }
        for(int i = 0; i < UA[0].length; i++)
        {
            for(int j = 0; j < UA[1].length; j++)
            {
                if(UA[i][j] == 0) // Row count
                ar[i+UA[0].length]++;
                if(UA[j][i] == 0) //Coloumn count
                ar[i]++;
                if(CA[i][j] == 0)
                ac[i+CA[0].length]++;
                if(CA[j][i] == 0)
                ac[i]++;
            }
            if(UA[i][i] == 0)
            ar[UA[0].length+UA[1].length+1]++;
            if(CA[i][i] == 0)
            ac[CA[0].length+CA[1].length+1]++;
            if(UA[i][UA[0].length-1-i] == 0)
            ar[UA[0].length+UA[1].length]++;
            if(CA[i][CA[0].length-1-i] == 0)
            ac[CA[0].length+CA[1].length]++;
        }
        if(h == 0)
        me.computer();
        else
        jd.judge();
    }
}