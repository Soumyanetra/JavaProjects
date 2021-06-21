import java.io.*;
class Eliminate extends Centre
{
    static int e;
    protected void eliminate()throws IOException
    {
        System.out.print("\f\nEnter Name of the Round : ");
        cc.calculate((sc.next()+sc.nextLine()).trim(),1);
        ga.split(ga.countnode()-e+1);
        edisplay();
        ask();
    }
    protected void edisplay()throws IOException
    {
        new Delay("\f\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tInspite of competing bravely, some of us has to get eliminated.\n\n\n\t\t\t\t\t\t\t\tLet's bid 'GOOD BYE!' to our parting competitors\n\n\n\t\t\t\t\t\t\t\t\t\t QSC wishes you\n\n\n\t\t\t\t\t\t\t     B E T T E R\tL U C K,\tN E X T\t   T I M E !!","8s");
        String m = "\f\n\n\n\n\n\t\t\t\t\t\t\t\t    E L I M I N A T E D\t   T E A M S\n\t\t\t\t\t\t\t\t    ```````````````````\t   `````````\n\n\n\n\n\n\n\t\t\t\t\t\t\t G R O U P\tN A M E\t\t\t\tS C O R E\n\t\t\t\t\t\t\t``````````````````````````````````````````````````````````\n\n";
        Group temp = ga.header2;
        while(temp != null)
        {
            if(temp.score >= 0)
                m += "\t\t\t\t\t\t\t\t"+temp.gn+"\t\t\t\t\t"+lt.positive(temp.score);
            else
                m += "\t\t\t\t\t\t\t\t"+temp.gn+"\t\t\t\t\t"+lt.negative(temp.score);
            temp = temp.link;
        }
        new Delay(m,"10s");
        ga.header2 = null;
    }
    protected void ask()throws IOException
    {
        System.out.print("\f\nDo you want to re-initialise scores by zero'0'? (Y/N) : ");
        if(br.readLine().equalsIgnoreCase("Y"))
        {
            ga.rein();
            ud.scor(0);
        }
        else
        ud.scor(1);
    }
}