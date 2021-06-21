import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Second extends JFrame
{
 public Second() 
 {
  setTitle("MyWindow");
  JLabel lb = new JLabel("Welcome to My Second Window");	//Creating a label.
  add(lb);			//adding label to frame. 
  setLayout(new FlowLayout());	//setting layout using FlowLayout object. 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//setting close operation. 
  setSize(400, 400);		//setting size 
  setVisible(true);		//setting frame visibilty 
 }
 public static void main(String[] args) 
 {
  new Second();
 }
}
