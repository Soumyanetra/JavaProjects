package GAMES;
import java.util.*;
import java.io.*;
class Pogo
{
    static int s,c,i = 0,z = 0; char m; String S1 = "", S2 = " ";
    static Scanner sc = new Scanner(System.in);
    public static void main()throws IOException
    {
        if(z++ == 0)
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t    S - G A M E S\t\t P R E S E N T S\n\n\t\t\t\t\t     P 0 G 0","10s");   
        s = 0;
        System.out.print("\f\n\t~*~*~*~*~*~*~*P  0  G  0*~*~*~*~*~*~*~\n\n\tM E N U\n\n 1. Play\n 2. Exit\n\n Enter your choice: ");
        if((c =(int)sc.nextDouble()) == 1)
            new Pogo().accept();
        else if(c == 2)
        {   new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t  ~~~~~~~*P L A Y\tA G A I N!*~~~~~~~\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tA   S - GAMES  P R E S E N T A T I O N","5s");  
            System.out.println("\f");return;}
        main();
    }
    public void accept()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\f\n\t\t\t\t\t\t\t\tG U I D E\n\t\t\t\t\t\t\t\t=========\nDear user,\n Your aim is to reach '100' as quickly as possible.\n You will be provided an equal chance to enter any number between 1 to 10.\n Your opponent will also enter a number within the same range.\n These numbers will be continuously added and the person making the sum reach the least tripple figures will win.\n The game will always start with your turn if you play against 'Me', while it will always start with the first player's turn if played against others.\n If one enters any number beyond this range, the call will be converted to '1'.\n\nPress 'Enter' to continue : ");
        br.readLine();
        System.out.print("\f\n S E L E C T\tO P P O N E N T\n\n 1. Paly versus 'Human'.\n 2. Paly versus 'Me'.\n\nPlease enter your choice: ");
        switch((int)sc.nextDouble())
        {
            default: new Time("\f\n\n UNABLE TO DETERMINE OPPONENT!!","900");new Time("\f\nDear user,\nTaste the game against me!\nENJOY  IT!!!","5s");System.out.print("\f");
            case 2: System.out.print("\f");  computer();
            break;
            case 1: human();
        }
        display();
        br.readLine();
    }
    public void human()
    {
         System.out.print("\fPlease enter name of player - 1: ");
         S1 = (sc.next()+sc.nextLine()).trim();
         System.out.print("Please enter name of player - 2: ");
         S2 = (sc.next()+sc.nextLine()).trim();
         while(s < 100)
         {
             System.out.print(S1+ "'s turn: ");
             if((i =(int)sc.nextDouble()) < 1 || (i > 10))
             System.out.println("\nDear "+S1+",\nYour entry is not accepted.\nIt is changed to "+(i=1)+"\n\n"+S2+ "'s turn: ");
             if((s += i) >= 100)
                break;
             System.out.print(S2+ "'s turn: ");
             if((i =(int)sc.nextDouble()) < 1 || (i > 10))
                System.out.println("\nDear "+S2+",\nYour entry is not accepted.\nIt is changed to "+(i=1));
             System.out.println("\nSum: " +(s += i)+"\n");
             c = (s >= 100)?2:1;
         }
    }
    public void computer()
    {
        System.out.print("\nPlease enter your name: ");
        S1 = (sc.next()+sc.nextLine()).trim();
        System.out.print("\f\tL e v e l\n\nE. Easy\nM. Medium\nH. Hard\n\nPlease enter your choice: ");
        if((m = sc.next().toUpperCase().charAt(0)) == 'E'  || m == 'M' || m == 'H')
        {
            while(s < 100)
            {
                System.out.print("\n"+S1+ ", its your turn: ");
                if((i =(int)sc.nextDouble()) < 1 || (i > 10))
                System.out.println("\nDear "+S1+",\nYour entry is not accepted.\nIt is changed to "+(i=1));
                if((s += i) >= 100)
                break;
                i = ((s >= 65 && m == 'E') || (s >= 70 && m == 'M') || (s >= 20 && m == 'H'))?hard():((s >= 50 && m == 'E') || (s >= 40 && m == 'M') || (s >= 0 && m == 'H'))?medium():(int)((Math.random()*10)+1);
                System.out.println("\nMy call: "+i+"\n\nSum: " +(s += i)+"\n");
                c = (s >= 100)?2:1;
            }
            return;
        }
        System.out.println("\nSorry!! "+S1+",\nYour choosed level does not exist.");
    }
    public int hard()
    {
        return(((((s / 10)*11)+1) > s)?(((s / 10)*11)+1)-s:((((((s / 10)+1)*11)+1)-s) <= 10)?((((s / 10)+1)*11)+1)-s:(s < 90)?i=1:100-s);
    }
    public int medium()
    {
        return(((((s / 10)*11)+1) > s)?(((s / 10)*11)+1)-s:(s < 90)?1:100-s);
    }
    public void display()
    {
          if(c == 1 && S2.charAt(0) == ' ' && (m == 'E'  || m == 'M' || m == 'H'))
              System.out.print("\fSum: " +s+"\nCongratulations!!\n"+S1+" Won!\n\nPress 'Enter' to continue: ");
          else if (c == 1 && S2.charAt(0) != ' ')
              System.out.print("\fSum: " +s+"\n"+S1+ " won!!\n\nPress 'Enter' to continue: ");
          else if(c == 2 && S2.charAt(0) == ' ' && (m == 'E'  || m == 'M' || m == 'H'))
              System.out.print("\fSum: " +s+"\nSorry!! "+S1+"\nYou lost.\nBetter luck next time.\n\nPress 'Enter' to continue: ");
          else if(c == 2 && S2.charAt(0) != ' ')
              System.out.print("\fSum: " +s+"\n"+S2+" Won!!\n\nPress 'Enter' to continue: ");
    }
}