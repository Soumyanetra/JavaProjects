import java.io.*;
class Retrive extends Centre
{
    protected void accept()throws IOException
    {
        BufferedReader fi = new BufferedReader(new FileReader("Quiz Data.doc"));
        fi.readLine();
        String ln = nm = ed.decrypt(fi.readLine()); 
        if(ln == null || ln.equals(""))
        { 
            System.out.print("\n\n\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t No previous data found!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\n\n\n\n Do you want to continue with New Data? (Y/N) : ");
            if(br.readLine().equalsIgnoreCase("Y"))
                ac.accept();
            return;
        }
        qm = ed.decrypt(fi.readLine());
        ws.wish();
        System.out.print("\f\n Do you want to convey any information/message (Y/N)? : ");
        if(br.readLine().toUpperCase().equalsIgnoreCase("Y"))
            mm.message();
        while((ln = fi.readLine()) != null)
            ga.insert(ed.decrypt(ln),Integer.valueOf(ed.decrypt(fi.readLine())));
        wl.bol();
        ud.scor(1);
        op.open(10);
        ac.quiz(0);
    }
}