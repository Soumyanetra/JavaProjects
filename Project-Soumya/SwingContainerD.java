import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingContainerD
{
    private JFrame mainFrame;
    private JLabel headerLabel, headerLabel1;
    private JLabel statusLabel;
    private JLabel msglabel;
    private JPanel controlPanel;
    public SwingContainerD()
    {
        prepareGUI();
    }
    public static void main(String[] args)
    {
        SwingContainerD swingContainerDemo = new SwingContainerD();
        swingContainerDemo.showJFrameDemo();
    }
    private void prepareGUI()
    {
        mainFrame = new JFrame("Java Swing");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent)
        {
            System.exit(0);
        }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        headerLabel1 = new JLabel("", JLabel.CENTER);
            headerLabel1.setText("MY JFRAME");
        msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial.", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showJFrameDemo()
    {
        headerLabel.setText("Container in action: JFrame");
        final JFrame frame = new JFrame("SOUMYA");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.add(msglabel);
            frame.add(headerLabel1);
        frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent)
        {
            frame.dispose();
        }
        });
        JButton okButton = new JButton("Open a Frame");
        okButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            statusLabel.setText("A Frame shown to the user.");
            frame.setVisible(true);
        }
        });
        controlPanel.add(okButton);
        mainFrame.setVisible(true);
        
        JButton okButton1 = new JButton("Open");
        okButton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            statusLabel.setText("A Frame shown to the user.");
            frame.setVisible(true);
        }
        });
        frame.add(okButton1);
        mainFrame.setVisible(true);
    }
}