import java.util.*;
import java.io.*;
class Message  extends Centre
{
    public void message()throws IOException
    { 
        System.out.println("\f\n Please enter :\n");
        String m = sc.nextLine().trim();
        String n = "\t\t\t";
        int i = -1;
        while(++i < m.length())
        {
            if((i+1) < m.length()  &&  m.charAt(i) == '/' && m.charAt(i+1) == 'n')
            {
                n += "\n\t\t\t"; i++;
            }
            else
            n += m.charAt(i);
        }
        StringTokenizer st = new StringTokenizer(m,".!?");
        int t = 5;
        if(st.countTokens() > 2)
        t = st.countTokens()*2;
        if(t >= 60)
        t = 59;
        new Delay("\f\n\n\n\t\t\t\tA T T E N T I O N\tP L E A S E\n\n\n Dear participants and audience,\n\n"+n,t+"s");
    }
}