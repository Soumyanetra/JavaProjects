package GAMES;
import java.util.*;
import java.io.*;
class Transfer extends CH
{
    protected void transfer()throws IOException
    {
        do
        {
            System.out.print("\fYOUR SAVINGS BALANCE : Rs "+spec.s+".00\nEnter amount to be withdrawn : Rs ");
            int a = sc.nextInt();
            if(a <= spec.s && a > 0)
            {
                spec.w += a; spec.s -= a;
            }
            else
            {
                System.out.print("SORRY!! MONEY CANNOT BE WITHDRWAN\n Do you want to re-withdraw? (Y/N) : ");
                if(br.readLine().equalsIgnoreCase("N"))
                    return;
            }
        }
        while(true);
    }
}