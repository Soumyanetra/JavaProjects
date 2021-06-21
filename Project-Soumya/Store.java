import java.io.*;
class Store extends Centre
{
    protected void store()throws IOException
    {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Quiz Data.doc")));
        pw.println("CAUTION : MANIPULATING THIS FILE MAY CAUSE RUN TIME ERRORS WHILE EXECUTING 'QSC'");
        pw.println(ed.encrypt(nm)+"\n"+ed.encrypt(qm)); 
        Group temp = ga.header1;
        while(temp != null)
        { 
            pw.println(ed.encrypt(temp.gn)+"\n"+ed.encrypt(temp.score+""));
            temp = temp.link;
        }
        pw.close();
    }
}