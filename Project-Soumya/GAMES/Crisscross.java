package GAMES;
import java.util.*;
import java.io.*;
class Crisscross
{
    Scanner sc = new Scanner(System.in);
    static Computer co = new Computer();
    char cc[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}}; 
    int ar[] = new int[8];
    int ur[] = new int[8];
    char u, d, c = 'a';
    int vic = 0, v = 5; String s;
    public static void main() throws IOException
    {
        Time tm = new Time("C R ! S - C R O S","10s");
        Crisscross ob = new Crisscross();
        ob.accept();
    }
    public void accept()
    {
        System.out.print("\fPlease Enter your Name: ");
        s = sc.nextLine();
        System.out.print("Choose your symbol\n1. 'X'\n2. 'O'\nPlease select your symbol : ");
        switch((int)sc.nextDouble())
        { 
            case 1:
            u = 'X';
            d = 'O';
            hum();
            co.computer();
            break;
            case 2:
            u = 'O';
            d = 'X';
            co.computer();
            hum();
            break;
            default:
            System.out.println("WRONG CHOICE!!");
        }
    }
    public void hum()
    {
        if(vic == 0)
        {
            if(c == 'a')
                display();
            System.out.print("Please enter the reference number of the grid\nin which you want to enter you symbol : ");
            c = sc.next().charAt(0);
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if(c == cc[i][j])
                    {
                        cc[i][j] = u;
                        i = 4;
                        break;
                    }
                }
            }
            judge();
            co.computer();
        } 
    }
    public void judge()
    {
        display();
        int p = 0;
        ar[0] = ar[1] = ar[2] = ar[3] = ar[4] = ar[5] = ar[6] = ar[7] = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(cc[i][j] == d)
                    ar[p]++;
                if(cc[j][i] == d)
                    ar[p+3]++;
                if((i+j) == 2)
                    if(cc[i][j] == d)
                        ar[6]++;
            }
            if(cc[i][i] == d)
                ar[7]++;
            p++;
        }
        for(int i = 0; i < 8; i++)
            if(ar[i] == 3)
            {
                 System.out.println("SORRY!! You lost.\nBetter luck next time");
                 vic = 1; break;
            }
        ur[0] = ur[1] = ur[2] = ur[3] = ur[4] =ur[5] = ur[6] = ur[7] = 0;
        p= 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(cc[i][j] == u)
                    ur[p]++;
                if(cc[j][i] == u)
                    ur[p+3]++;
                if((i+j) == 2)
                    if(cc[i][j] == u)
                        ur[6]++;
            }
            if(cc[i][i] == u)
                ur[7]++;
            p++;
        }
        for(int i = 0; i < 8; i++)
             if(ur[i] == 3)
             {
                 System.out.println("Congrats!!!!!!!!!\n"+s+" WON!!");
                 vic = 1; break;
             }
        int ct = 0;
        if(vic != 1)
        for(int i = 0; i < 8; i++)
             if(ur[i]+ar[i] == 3)
                ct++;
        if(ct == 8)
        {
              System.out.println("Its a Tie!!");
              vic = 1;
        }
    }
    public void display()
    {
        System.out.println("Present grid condition: ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                System.out.print(cc[i][j]+"    ");
            System.out.println("\n");
        }
    }
}