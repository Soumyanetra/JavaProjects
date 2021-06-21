package GAMES;
import java.io.*;
class BINGO extends Acpt
{
    public static void main(String[] args) throws IOException
    {
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t    S - G A M E S\t\t P R E S E N T S\n\n\t\t\t\t\t\t\t     B ! N G O\n\n\t\t\t\t\t\t\t   W E L C O M E","15s");
        outer:
        do
        {
            System.out.print("\f\n\t~*~*~*~*~*~*~*BINGO-BINGO*~*~*~*~*~*~*~\n\n\n\tM E N U\n\n 1. Play\n 2. Help\n 3. Statistics\n 4. About\n 5. Continue with saved Grid\n 6. Exit\n\n Enter your choice : ");
            switch((int)sc.nextDouble())
            {
                case 1: gr.td = false; at.accept(); break;
                case 2: ah.help(); break;
                case 3: st.stat(); break;
                case 4: ah.about(); break;
                case 5: sv.extract(); break;
                case 6: break outer;
            }
        }
        while(true);
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t~~~~~~~*T H A N K\tY O U*~~~~~~~\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tA   S - GAMES  P R E S E N T A T I O N","10s");
        System.out.println("\f");
    }
}