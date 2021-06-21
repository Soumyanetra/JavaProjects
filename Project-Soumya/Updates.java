import java.io.*;
class Updates  extends Centre
{
    void scor(int z)throws IOException
    {
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Quiz Score.doc")));
         dt.d_t();
         pw.println("\t\tW E L C O M E!!  TO '"+nm+"' QUIZ COMPETITION\n\t\t\t\tSession : "+dt.yr+" - "+(Integer.valueOf(dt.yr)+1)%2000);
         pw.println("\n\nDATE : "+dt.de+"\t\t\t   TIME :   "+dt.tm+"\n\n\n\t   ~*~*~*~*~*~*~*~*~* S C O R E - B O A R D *~*~*~*~*~*~*~*~*~\n");
         ga.traverse(pw);
         if(z == 0)
            pw.print("\n\t=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=\n\t\t\t   I N I T I A L     S T A T E\n\t=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=");
         else
            dp.max(pw);
         pw.println("\n\n\n\n\t\t\t\t\t\tQuiz Master\t\t\t : "+qm+"\n\t\t\t\t\t\tProgrammer & Developer  : SOUMYANETRA");
         pw.close();
    }
}