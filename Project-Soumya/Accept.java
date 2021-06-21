import java.io.*;
import java.util.*;
class Accept extends Centre
{
    private int f = 0;
    protected void accept()throws IOException
    {
        BufferedReader fi = new BufferedReader(new FileReader("Quiz Gn.doc"));
        System.out.print("\f\n Enter Name of the Quiz\t\t : ");
        nm = (sc.next()+sc.nextLine()).trim();
        System.out.print(" Enter Full Name of Quiz Master  : ");
        qm = (sc.next()+sc.nextLine()).trim();
        ws.wish(); 
        int i = 0, ct = 0,v = 0;
        System.out.print("\f\n Do you want to convey any information/message (Y/N)? : ");
        if(br.readLine().toUpperCase().equalsIgnoreCase("Y"))
            mm.message();
        do
        {  
            boolean b = true; String g = "";
            if(f == 0)
            {
                if((i = ga.countnode()+1) == 1)
                {
                    if(ct == 0)
                    System.out.print("\f\n Enter name of 1st Group\t\t: ");
                    else
                    System.out.print(" Enter name of 1st Group\t\t: ");
                }
                else if(i == 2)
                System.out.print(" Enter name of 2nd Group\t\t: ");
                else if(i == 3)
                System.out.print(" Enter name of 3rd Group\t\t: ");
                else
                System.out.print(" Enter name of "+i+"th Group\t\t: ");
                g = (sc.next()+sc.nextLine()).trim();
            }
            if(g.equalsIgnoreCase("DFF") || f == 1)
            {
                f = 1;
                if((g = fi.readLine()) == null)
                {
                    if(ga.countnode() == i-1)
                    System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t    NO VALID NAMES FOUND!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                    ct = 1;     f = 0;
                    if(v > 0)
                    {
                        System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t "+v+" INVALID GROUP NAME(S) FOUND!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                        v = 0;
                    }
                    if(ga.countnode() >= 2)
                    {
                        System.out.print("\n Do you want more groups to be added(Y/N)? : ");
                        if(br.readLine().equalsIgnoreCase("Y"))
                            continue;
                        else 
                            break;
                    }
                    else
                        continue;
                }
                if(g.equalsIgnoreCase("DFF"))
                {
                    v++;
                    continue;
                }
            }
            StringTokenizer st = new StringTokenizer(g,"-");
            if( ((Character.toUpperCase(g.charAt(0)) < 'A' || Character.toUpperCase(g.charAt(0)) > 'Z') && g.charAt(0) != '-') || (symbol(g)) || g.equalsIgnoreCase("END") || g.equalsIgnoreCase("RC") )
            {
                if(f == 0)
                    System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t     INVALID 'GROUP-NAME'!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                else
                    v++;
            }
            else if((st.countTokens() == 2) && (b = vs.hiphenAt(g)))
            ct = ng.name(vs.a,vs.b);
            else if(g.length() > 5 && g.charAt(0) != '-' && b == true && st.countTokens() < 2)
            {
                if(f == 0)
                    System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t INVALID 'GROUP-NAME LENGTH'!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                else
                    v++;
            }
            else
            {
                if(st.countTokens() > 2 || b == false)
                {
                    if(f == 0)
                        System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t INVALID SERIES DEFINED!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                    else
                        v++;
                    ct = 1;
                    continue;
                }
                if(g.equalsIgnoreCase("NMG") && i >= 3)
                break;
                else if(g.equalsIgnoreCase("NMG"))
                {
                    if(f == 0)
                        System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t ATLEAST TWO GROUPS REQUIRED!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                    else
                        v++;
                    ct = 1;
                    continue;
                }
                if(g.charAt(0) != '-')
                {
                    ga.insert(g,0);
                    b = ck.check(g);
                    if(b == false)
                        if(f == 0)
                            System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t 'GROUP NAME' ALREADY DECLARED!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                }
                else
                { 
                    b = ck.checkf(g.substring(1));
                    if(b == false)
                    {
                        if(f == 0)
                            System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t NO SUCH GROUPS MENTIONED!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                    }
                    else
                    {
                        ga.deletenth(ga.presentnth(g.substring(1)));
                        if(f == 0)
                            System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t GROUP("+g.substring(1)+") SUCCESSFULLY REMOVED\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                    }
                }
            }
            ct = 1;
        }
        while(true);
        start();
    }
    protected void start()throws IOException
    {
        int i = 0;
        st.store();
        ud.scor(0);
        wl.bol();
        op.open(10);
        if(ga.countnode() > 5)
        {
            System.out.print("\f\n Is there any 'Elimination Round' (Y/N)? : ");
            if(br.readLine().toUpperCase().equalsIgnoreCase("Y"))
            {
                do
                {
                    System.out.print("\n Eliminate last _______ group(s) : ");
                    em.e = (Math.abs(i = ck.checkv(sc.nextLine().trim(),1)) <= ga.countnode()-3)?Math.abs(i):0;
                    if(em.e == 0)
                    System.out.println("\n\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t\t INVALID ENTRY!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=");
                }
                while(em.e == 0);
                em.eliminate();
            }
        }
        quiz(1);
    }
    protected void quiz(int n)throws IOException
    {
        if(n == 1)
        System.out.print("\f\n Enter Name of first Round : ");
        else
        System.out.print("\f\n Enter Name of next Round  : ");
        cc.calculate((sc.next()+sc.nextLine()).trim(),0);
    }
    protected boolean symbol(String g)
    {
        int i = -1;
        while(++i < g.length())
        {
            if(g.charAt(i) == '~')
            return true;
        }
        return false;
    }
}