import java.io.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
public class QSC extends java.applet.Applet 
{
     public void paint(Graphics g) 
     {
         g.setColor(new Color(255,0,255)); //R G B
         g.setFont(new Font("CastellAr",Font.ITALIC, 375));
         g.drawString("Q S C", 390, 590);
         g.setColor(new Color(0,170,0)); //R G B
         int i;
         i = 60; 
         while(i < getWidth()-350)
         {
             g.setFont(new Font("CastellAr",Font.ITALIC, 100));
             g.drawString("Q S C", i, 100);
             i += 20;
         }
         i = 60; 
         while(i < getWidth()-350) 
         {
             g.setFont(new Font("CastellAr",Font.ITALIC, 100));
             g.drawString("C S Q", i, 950);
             i += 20;
         }
         i = 180; 
         while(i < getHeight()-240) 
         {
             g.setFont(new Font("CastellAr",Font.ITALIC, 100));
             g.drawString("C",20,i);
             g.drawString("S",20,i+100);
             g.drawString("Q",20,i+130);
             i += 20;
         }
         i = 180; 
         while(i < getHeight()-240)
         {
             g.setFont(new Font("CastellAr",Font.ITALIC, 100));
             g.drawString("Q",getWidth()-115,i);
             g.drawString("S",getWidth()-115,i+110);
             g.drawString("C",getWidth()-115,i+140);
             i += 20;
         }
         g.setFont(new Font("CastellAr",Font.ITALIC, 400));
         g.drawString("~ ~ ~", 390, 760);
     }
     public static void starts()throws IOException
     {
         new Initiate().main();
     }
}