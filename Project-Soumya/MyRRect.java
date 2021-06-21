import java.awt.Graphics;
public class MyRRect extends java.applet.Applet {
public void paint(Graphics g) 
{
    int s = 30, u = 80, m = 1 , l = 0;
    g.drawRoundRect(15,15,760,760,15,15);
    for(int i = 1; i <= 8; i++)
    {
            if(i % 2 != 0)
            {
                
                g.fillRoundRect(s+l*u,40,80,90,0,0);
                g.drawRoundRect(s+m*u,40,80,90,0,0);
                //g.fillRoundRect(190,30,80,80,0,0);
                m = m + 2;
                l = l+2;
                //u = s+u;
            }
            else
            {
                g.fillRoundRect(30,120,80,80,0,0);
            }
            //
            //.drawRoundRect(30,110,80,80,0,0);
            //g.fillRoundRect(110,30,80,80,0,0);
    }
    //g.fillRoundRect(161,20,70,70,0,0);
   // g.drawRoundRect(231,20,70,70,0,0);
    //g.drawSquare(20,20);
}
}