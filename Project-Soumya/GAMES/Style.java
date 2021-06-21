package GAMES;  
import java.io.*;
class Style
{
    private int c = 0;
    void di(String n,String t)throws IOException
    {
        int i = 0;
        while(i < n.length())
        {
              if( (n.charAt(i++) != ' ' && c == 0) || (i < n.length() && n.charAt(i) == ' ' && c != 0) )
                new Time(n.charAt(i-1)+"",t);
              else if(n.charAt(i-1) == ' ')
                  System.out.print(" ");
              else
                new Time(n.charAt(i-1)+"",t);
        }
    }
    void blink(String n,String t)throws IOException
    {
    }
}