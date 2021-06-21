import java.io.*;
class Initiate extends Centre
{ 
    protected void main()throws IOException
    {
        try
        {
            FileReader fw = new FileReader("Quiz Data.doc");
        }
        catch(FileNotFoundException e)
        {
            FileWriter fw = new FileWriter("Quiz Data.doc");
        }
        wl.welcome();
        System.out.print("\f\n Do you want to open 'README' File? (Y/N) : ");
        if(br.readLine().equalsIgnoreCase("Y"))
        new Info();
        BufferedReader fi = new BufferedReader(new FileReader("Quiz Data.doc"));
        String ln = fi.readLine(), c = "";
        if(ln != null)
        {
            System.out.print("\f\n Continue with previous data? (Y/N) : ");
            c = br.readLine();
        }
        if(c.equalsIgnoreCase("Y"))
        rt.accept();
        else
        ac.accept();
        wl.thank();
        System.out.println("\f");
    }
}