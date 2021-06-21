import java.applet.Applet;
import java.awt.*;
public class Click extends Applet
{
    public void init()
    {
        addMouseListener(new ClickListener());
        setBackground(Color.blue);
    }
}