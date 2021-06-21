import java.awt.Desktop;
import java.io.*;
class Open extends Centre
{
    protected void open(int t)throws IOException
    {
          try
          {
                Desktop.getDesktop().open(new File("Quiz Score.doc"));
                //Desktop.getDesktop().open(new File("D:/JAVA/Project - Soumyanatra Pal/QSC.jpg"));
                new Delay("\f",t+"s");
          }
          catch(FileNotFoundException e){}
    }
}