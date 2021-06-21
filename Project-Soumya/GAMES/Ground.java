package GAMES;
import java.io.*;
class Ground extends Acpt
{
    protected static boolean td = false;
    protected void ground()throws IOException
    {
        int call = 0;
        if(td == false)
        td = ht.toss();
        outer:
        while(jd.n1 == 0)
        {
           int ct = 1;
           if(td == true)
            { 
                dp.display();
                System.out.print("\nCall a number between 1 - "+(UA[0].length*UA[1].length)+" : ");
                call = (int)sc.nextDouble();
                if(call == 9999)
                {
                    System.out.print("\nDo you really want to exit?\nPress '1' to exit : ");
                    if(sc.nextInt() == 1)
                    {
                        System.out.print("Do you want to save your grid or it will be counted as a loss in your satistics(Y/N) : ");
                        if(sc.next().toUpperCase().charAt(0) == 'Y')
                        sv.save();
                        else
                        st.write(-1,UA.length);
                        break;
                    }
                    else
                        continue;
                }
                cz.zero(call,1);
                if(jd.v != 0)
                cz.zero(call,0);
            }
            else
            {
                if(jd.v != 0)
                cz.zero(call,0);
                dp.display();
                if(jd.v != 0)
                {
                    do
                    {
                        if(ct != 1)
                        dp.display();
                        ct = 1;
                        System.out.print("\nCall a number between 1 - "+(UA[0].length*UA[1].length)+" : ");
                        call = (int)sc.nextDouble();
                        if(call == 9999)
                        {
                            System.out.print("\nDo you really want to exit?\nPress '1' to exit : ");
                            if((ct = (int)sc.nextDouble()) == 1)
                            {
                                System.out.print("Do you want to save your grid or it will be counted as a loss in your satistics(Y/N) : ");
                                if(sc.next().toUpperCase().charAt(0) == 'Y')
                                sv.save();
                                else
                                st.write(-1,UA.length);
                                break outer;
                            }
                        }
                    }
                    while(ct != 1);
                    cz.zero(call,1);
                    if(jd.v != 0)
                    dp.display();
                }
            }
        }
    }
}