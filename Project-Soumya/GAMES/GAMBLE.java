package GAMES;
import java.util.*;
import java.io.*;
class GAMBLE extends CH
{
    protected static void main()throws IOException
    {
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t    S - G A M E S\t\t P R E S E N T S\n\n\t\t\t\t\t\t\t\t\t    G V M B L E\n\n\t\t\t\t\t\t\t\t\t   W E L C O M E","15s");
        outer:
        do
        {
            System.out.print("\f1. SINGLE PLAYER\n2. MUTI-PLAYER\n3. OPEN README FILE\nENTER YOUR CHOICE : ");
            switch(sc.nextInt())
            {
                case 1: mn.singlep(); break outer;
                case 2: mn.multip(); break outer;
                case 3: new Readme_G(); new Time("","15s");
            }
        }
        while(true);
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t~~~~~~~*T H A N K\tY O U*~~~~~~~\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tA   S - GAMES  P R E S E N T A T I O N","8s");
        System.out.println("\f");
    }
}