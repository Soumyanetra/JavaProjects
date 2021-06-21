package GAMES;
import java.io.*;
import java.util.*;
class Save_Grid extends Acpt
{
    private int a = 0, b = 0, x = 0;
    protected void save()throws IOException
    {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Bingo Save.doc")));
        pw.println("NAME : "+n+"\nSIZE : "+UA.length);
        for(int i = 0; i < UA.length; i++)
        {
            for(int j = 0; j < UA.length; j++)
            pw.println(UA[i][j]+"     "+CA[i][j]);
        }
        pw.close();
    }
    protected void extract()throws IOException
    {
        try
        {
            BufferedReader fi = new BufferedReader(new FileReader("Bingo Save.doc"));
            int rc = 0, z = 0; String n = "", ln;
            System.out.print("\f");
            while((ln = fi.readLine()) != null && ln.length() != 0)
            {
                z = 1;
                if(ln.startsWith("SIZE"))
                    new Acpt(Integer.valueOf(ln.substring(7)));
                else if(ln.startsWith("NAME"))
                    n = ln.substring(7);
                else
                    convert(ln);
            }
            if(z == 1)
            {
                gr.td = true;
                gr.ground();
            }
            else
            {
                System.out.print("\fNo grids saved!\nPress 'Enter to continue : ");
                br.readLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.print("\fNo grids saved!\nPress 'Enter to continue : ");
            br.readLine();
        }
    }
    protected void convert(String ln)
    {
        if(a < UA.length)
        {
            if(b < UA.length)
            {
                StringTokenizer st = new StringTokenizer(ln,"     ");
                UA[a][b] = Integer.valueOf(st.nextToken());
                CA[a][b++] = Integer.valueOf(st.nextToken());
            }
            if(b == UA.length)
            {a++; b = 0;}
        }
    }
}