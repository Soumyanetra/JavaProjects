package GAMES;
import java.io.*;
class Retrive extends CH
{
    protected void retrive()throws IOException
    {
       BufferedReader fi =  new BufferedReader(new FileReader("GAMBLE RECORD.doc"));
       String ln; int ct = 0;
       while((ln = fi.readLine()) != null)
       {System.out.println(ln);
           if(ct == 0)
                sf.soft(ln,Integer.parseInt(fi.readLine()),Integer.parseInt(fi.readLine()),Integer.parseInt(fi.readLine()),fi.readLine().charAt(0),Integer.parseInt(fi.readLine()),0);
           else
                sf.soft(ln,Integer.parseInt(fi.readLine()),Integer.parseInt(fi.readLine()),Integer.parseInt(fi.readLine()),fi.readLine().charAt(0),Integer.parseInt(fi.readLine()),1);
           ct = 1;
       }
    }
}
