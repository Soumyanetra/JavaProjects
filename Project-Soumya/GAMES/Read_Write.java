package GAMES;
import java.io.*;
class Read_Write
{
    public void read(String na)throws IOException
    {
        FileReader in = new FileReader("PUZZLE.doc");
        BufferedReader fi = new BufferedReader(in);
        String ln;
        while((ln = fi.readLine()) != null)
        {
            if(ln.startsWith("No."))
            {
                String pz[][] = new String[Integer.valueOf(ln.substring(25))][Integer.valueOf(ln.substring(25))];
                for(int i = 0; i < pz[0].length; i++)
                {
                    for(int j = 0; j < pz[0].length; j++)
                    pz[i][j] = "";
                }
                int h = 0, k = 0;
                while((ln = fi.readLine()) != null)
                {
                     for(int i = 0; i < ln.length(); i++)
                     {
                         char c = ln.charAt(i);
                         if(ln.startsWith("Your") == false && ((c > '0' && c <= '9') || (c >= 'A' && c <= 'Z')))
                         {
                             pz[h][k++] = c+"";
                             c = ln.charAt(i++ +1);
                             if(c >= '0' && c <= '9')
                             pz[h][k-1] += c+"";
                             if(k == pz[1].length)
                             {
                                    h++; k = 0;
                             }
                         }
                         else if(ln.charAt(i) == '\t' && ln.charAt(i+1) == '\t')
                         {
                             pz[h][k++] = "";
                             if(k == pz[1].length)
                             {
                                    h++; k = 0;
                             }
                         }
                     }
                }
                outer:
                for(int i = 0; i < pz[0].length; i++)
                {
                    for(int j = 0; j < pz[1].length; j++)
                    {
                        if(pz[i][j].equals("1"))
                        {
                            SP sp = new SP();
                            sp.samp(pz[0].length,1);
                            break outer;
                        }
                        else if(pz[i][j].equals("A"))
                        {
                           Alpha al = new Alpha(); 
                           al.samp(pz[0].length, 'A');
                            break outer;
                        }
                    }
                }
                Arrange ar = new Arrange();
                ar.arrange(pz,na);
                break;
            }
        }
    }
    public void write(String pz[][])throws IOException
    {
        FileWriter fw = new FileWriter("PUZZLE.doc");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        display(pz, pw);
        pw.close();
    }
    public void display(String pz[][],PrintWriter pw)
    {
        pw.println("No. of rows or columns : "+pz[0].length);
        pw.println("\nYour square : ");
        hi(pz[0].length, pw);
        for(int i = 0; i < pz[0].length; i++)
        {
            for(int j = 0; j < pz[1].length; j++)
            {
               if(j == 0)
                pw.print("\t|\t"+pz[i][j]+"\t|");
                else
                pw.print("\t"+pz[i][j]+"\t|");
            }
            hi(pz[0].length, pw);
        }
    }
    public void hi(int rc, PrintWriter pw)
    {
        if(rc == 3)
         pw.println("\n\t-------------------------------------------------");
        else if(rc == 4)
         pw.println("\n\t-----------------------------------------------------------------");
        else
         pw.println("\n\t---------------------------------------------------------------------------------");
    }
}