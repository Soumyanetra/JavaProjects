import java.io.*;
class LeadT  extends Centre
{ 
    protected void top3()throws IOException
    { 
        BufferedReader fi = new BufferedReader(new FileReader("Quiz Data.doc"));
        String m = "\f\n\n\n\n\n\t\t\t\t\t\t  C O N G R A T U L A T I O N S\t  T O\tT H E\tL E A D I N G\t G R O U P S\n\t\t\t\t\t\t  `````````````````````````````\t  ```\t`````\t`````````````\t ```````````\n\n\n\n\n\n\n\t\t\t\t\t\t R A N K\tG R O U P\tN A M E\t\t\t\tS C O R E\n\t\t\t\t\t\t``````````````````````````````````````````````````````````````````````````\n\n";
        fi.readLine(); fi.readLine(); fi.readLine();
        String ln;
        int c = 0,d = 0;
        while(c < 3 && ((ln = fi.readLine()) != null))
        {
            ln = ed.decrypt(ln);
            if((d = Integer.valueOf(ed.decrypt(fi.readLine()))) >= 0)
            m += "\t\t\t\t\t\t   "+(++c)+". \t\t\t"+ln+"\t\t\t\t\t  "+positive(d);
            else 
            m += "\t\t\t\t\t\t   "+(++c)+". \t\t\t"+ln+"\t\t\t\t\t  "+negative(d);
        }
        new Delay(m,"10s");
    }
    String positive(int d)
    {
         if(d > 99)
         return "  "+d+"\n\n";
         else if(d > 9)
         return "   "+d+"\n\n";
         else
         return "    "+d+"\n\n";
    }
    String negative(int d)
    {
         if(d < -99)
         return "- "+Math.abs(d)+"\n\n";
         else if(d < -9)
         return "-  "+Math.abs(d)+"\n\n";
         else
         return "-   "+Math.abs(d)+"\n\n";
    }
}