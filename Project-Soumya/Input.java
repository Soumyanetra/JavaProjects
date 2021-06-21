import java.applet.Applet;
import java.awt.*;
public class Input extends Applet
{
    String n,n1;
    Label lab1, lab2;
    TextField t1,t2;
    public void init()
    {
        lab1 = new Label("Enter a name : ");
        add(lab1);
        t1 = new TextField(15);
        add(t1);
        lab2 = new Label("Enter a name1 : ");
        add(lab2);
        t2 = new TextField(35);
        add(t2);
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello : "+n,10,100);
        g.drawString("Hello : "+n1,200,100);
    }
    public boolean action(Event e,Object o)
    {
        n = t1.getText();
        repaint();
        n1 = t1.getText();
        repaint();
        return true;
    }
}