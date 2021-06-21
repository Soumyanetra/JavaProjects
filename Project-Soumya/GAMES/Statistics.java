package GAMES;
import java.io.*;
class Statistics extends Acpt
{
    private double l[] = new double[5];
    private double t[] = new double[5];
    private double w[] = new double[5];
    private String sec[] = {"SECTION - A","SECTION - B","SECTION - C","SECTION - D","SECTION - E"};
    protected void stat()throws IOException
    {
        read();
        System.out.print("\f\tY O U R      S T A T I S T I C S");
        for(int i = 0; i < 5; i++)
        {
            System.out.print("\n\n--------------------------------------------\n\t\t"+sec[i]+"\n--------------------------------------------\n\n  TOTAL MATCHES    : " +(int)(w[i]+l[i]+t[i])+"\n  WIN\t\t   : " +(int)w[i]+"\n  LOST\t\t   : " +(int)l[i]+"\n  DRAW\t\t   : " +(int)t[i]);
            if((w[i]+l[i]+t[i]) > 0)
            System.out.print("\n  WIN  PERCENTAGE  : " +(int)((w[i]/(w[i]+l[i]+t[i]))*100)+"%\n  LOST PERCENTAGE  : "+ (int)((l[i]/(w[i]+l[i]+t[i]))*100)+"%\n  DRAW PERCENTAGE  : "+(int)((t[i]/(w[i]+l[i]+t[i]))*100)+"%");
        }
        System.out.print("\n\nPress 'Enter' to continue : ");
        br.readLine(); 
    }
    protected void write(int ct, int r)throws IOException
    {
        read();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Bingo Result.doc")));
        for(int i = 0; i < 5; i++)
        {
            pw.println(sec[i]);
            if(i == r-3)
            {
                if(ct == -1)
                pw.println("WIN : " +(int)w[i]+"\nLOST : " +(int)(l[i]+1)+"\nDRAW : " +(int)t[i]);
                else if(ct == 0)
                pw.println("WIN : " +(int)w[i]+"\nLOST : " +(int)l[i]+"\nDRAW : " +(int)(t[i]+1));
                else
                pw.println("WIN : " +(int)(w[i]+1)+"\nLOST : " +(int)l[i]+"\nDRAW : " +(int)t[i]);
            }
            else
             pw.println("WIN : " +(int)w[i]+"\nLOST : " +(int)l[i]+"\nDRAW : " +(int)t[i]);
        }
        pw.close();
    }
    protected void read()throws IOException
    {
        try
        {
            BufferedReader fi = new BufferedReader(new FileReader("Bingo Result.doc"));
            String ln; int p = -1;
            while((ln = fi.readLine()) != null)
            {
                if(ln.startsWith("SECTION"))
                    p++;
                else if(ln.startsWith("WIN"))
                    w[p] = Double.valueOf(ln.substring(6));
                else if(ln.startsWith("LOST"))
                    l[p] = Double.valueOf(ln.substring(7));
                else if(ln.startsWith("DRAW"))
                    t[p] = Double.valueOf(ln.substring(7));
            }
        }
        catch(FileNotFoundException e)
        {
            new FileWriter("Bingo Result.doc");
            stat();
        }
    }
}