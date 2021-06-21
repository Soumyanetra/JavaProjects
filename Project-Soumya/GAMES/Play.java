package GAMES;
import java.io.*;
class Play
{
    String r;
    public void ground(int rc,String na)throws IOException
    {
        String pz[][] = new String[rc][rc];
        for(int i = 0; i < rc; i++)
        {
            for(int j = 0; j < rc;)
            {
                boolean ra = random(pz);
                if(ra == true)
                {
                    pz[i][j] = r;
                    j++;
                }
            }
        }
        outer:
        for(int i = 0; i < rc; i++)
        {
            for(int j = 0; j <  rc; j++)
            {
                if((pz[i][j].equals(Integer.toString(rc*rc))))
                {
                    pz[i][j] = "";
                    break outer;
                }
            }
        }
        Arrange ar = new Arrange();
        ar.arrange(pz,na);
    }
    public boolean random(String pz[][])
    {
        int i, j = 0;
        r = Integer.toString((int)(Math.random()*(pz[0].length*pz[1].length)+1));
        outer:
        for(i = 0; i < pz[0].length; i++)
        {
            inner:
            for(j = 0; j < pz[1].length; j++)
            {
                if(pz[i][j] != null && r.equals(pz[i][j]))
                break outer;
            }
        }
        if(i == pz[0].length && j == pz[1].length)
        return(true);
        else
        return(false);
    }
}