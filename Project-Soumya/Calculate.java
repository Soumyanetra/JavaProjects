import java.io.*;
class Calculate extends Centre
{
    protected void calculate(String r,int f)throws IOException
    {
        String g;
        boolean b;
        int ct = 0;
        System.out.print("\f\n\t\t\tR O U N D : "+r+"\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\n Enter Points to be awarded or dewarded\t\t     : ");   
        if((g = (sc.next()+sc.nextLine()).trim()).equalsIgnoreCase("RC") == false && g.equalsIgnoreCase("END") == false)
        {
            int m = ck.checkv(g,0);
            if(m != 0)
            {
                do
                {
                    System.out.print("\n Enter 'Group Name' to which '"+m+"' is to be calculated : ");
                    b = ck.checkf(g = (sc.next()+sc.nextLine()).trim());
                    if(b == false)
                        System.out.println("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t NO SUCH GROUPS MENTIONED!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n");
                }
                while(b == false);
                ga.insertnth(m,g);
                rk.rank();
                ud.scor(1);
                st.store();
            }
        }
        if(g.equalsIgnoreCase("RC"))
        {
            dp.round(r,ct++);
            if(ga.header1.score != 0)
                lt.top3();
            op.open(20);
            if(f == 0)
                ac.quiz(0); 
            else
                return;
        }
        else if(g.equalsIgnoreCase("END") && f == 0)
        {
            dp.round(r,ct++);
            if(ga.header1.score != 0)
            {
                lt.top3();
                op.open(30);
                ft.findtie();
            }
            ga.header1 = null;
        }
        else if(g.equalsIgnoreCase("END") && f == 1)
        {
            System.out.print("\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t    'END' COMMAND NOT ENTERTAINED HERE!!!\n =`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\n\nPress 'Enter' to continue :");
            br.readLine();
            calculate(r,f);
        }
        else
        calculate(r,f);
    }
}