package GAMES;
import java.io.*;
class Me extends Acpt
{
    protected void computer()throws IOException
    {
        int max = 0, i = 0,call = 0;// ct = 0;
        for(i = 0; i < ac.length; i++)
        {
            if(ac[i] >= CA[0].length)
            ac[i] = 0;
            //ct = (ac[i] == 0)?ct+1:ct+0;
        } 
        i = 0;
        while(i < ac.length)
        {
            if(ac[max] <= ac[i])
            max = i;
            i++;
        }//System.out.println("H = "+h+" K = "+k);
        for(i = 0; i < CA[0].length; i++)
        {
            if(max == ac.length-1)
            {
                if(CA[i][i] != 0)
                {
                    System.out.println("My call : " + (call = CA[i][i])+"\n");
                    break;
                }
            }
            else if(max == ac.length-2)
            {
                 if(CA[i][CA[0].length-1-i] != 0)
                 {
                     System.out.println("My call : " + (call = CA[i][CA[0].length-1-i])+"\n");
                     break;
                 }
            }
            else if(max < CA[0].length)
            {
                if(CA[i][max] != 0)
                {
                    System.out.println("My call : " +( call = CA[i][max])+"\n");
                    break;
                }
            }
            else if(max >= CA[0].length && max < ac.length-2)
            {
                if(CA[max-CA[0].length][i] != 0)
                {
                    System.out.println("My call : " + (call = CA[max-CA[0].length][i])+"\n");
                    break;
                }
            }
        }
        /**if(ct != ac.length)
            System.out.println("My call : "+(call = calldet(max))+"\n");
        else
            System.out.println("My call : "+(call = CA[(int)(CA.length/2)][(int)(CA.length/2)])+"\n");*/
        cz.zero(call,1);
    }
    int calldet(int max)
    {
        int p = 0,t, h = 0, k = 0; //System.out.println("MAX : "+max+"\n");
        if(max == ac.length-2)
        {
            for(int i = 0; i < CA.length; i++)
            {
                if(CA[i][CA[0].length-1-i] != 0)
                {
                    if((t = (potential_04(CA[0].length-1-i)+potential_59(i))) >= p)
                    {
                        p = t;
                        h = i;
                        k = CA[0].length-1-i;
                    }
                }
            }
        }
        else if(max == ac.length-1)
        {
            for(int i = 0; i < CA.length; i++)
            {
                if(CA[i][i] != 0)
                {
                    if((t = (potential_04(i)+potential_59(i))) >= p)
                    {
                        p = t;
                        h = k = i;
                    }
                }
            }
        }
        else if(max >= 0 && max < CA.length)
        {
            k = max;
            for(int i = 0; i < CA.length; i++)
            {
                if(CA[i][max] != 0)
                {
                    if((t = potential_59(i)) >= p)
                    {
                        p = t;
                        h = i;
                    }
                }
            }
        }
        else
        {
            h = max-CA.length;
            for(int i = 0; i < CA.length; i++)
            {
                if(CA[h][i] != 0)
                {
                    if((t = potential_04(i)) >= p)
                    {
                        p = t;
                        k = i;
                    }
                }
            }
        }
        return CA[h][k];
    }
    int potential_04(int max)
    {
        int s = 0;
        for(int i = 0; i < CA.length; i++)
            if(CA[i][max] == 0)
                s++;
        return s;
    }
    int potential_59(int max)
    {
        int s = 0;
        for(int i = 0; i < CA.length; i++)
            if(CA[max][i] == 0)
                s++;
        return s;
    }
}