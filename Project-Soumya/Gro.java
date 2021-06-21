import java.awt.*;
import java.awt.Color;
 public class Gro extends java.applet.Applet 
 {
     public void paint(Graphics g)
     {
         int rval = (int)Math.floor(Math.random() * 256);
         int gval = (int)Math.floor(Math.random() * 256);
         int bval = (int)Math.floor(Math.random() * 256);
         System.out.println("R : "+rval+"\nG : "+gval+"\nB : "+bval);
         g.setColor(new Color(250,180,230));
         g.fillOval(100,100,240,240);
     }
 }