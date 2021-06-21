package GAMES;
import java.io.*;
class Counter extends CH
{
    protected void counter()throws IOException
    {
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t    W E L C O M E\t T O\t O U R\t   C O U N T E R","15s");
        do
        {
            System.out.print("\fEnter number of chips you want to buy : ");
            int h = sc.nextInt();
            do
            {            
                 System.out.print("AMOUNT TO BE PAID Rs "+h*2+".00\nPress 'Enter' : "); br.readLine();
                 if(h*2 <= spec.w)
                 {
                     ch = h;
                     spec.w -= h*2;
                     System.out.println(" THANK YOU!!\n");
                     return;
                 }
                 else
                 {
                     System.out.println("DEARTH OF FUND!!");
                     if(spec.s > 0)
                     {
                         System.out.print("Do you want to transfer fund from savings? (Y/N) : ");
                         if(br.readLine().equalsIgnoreCase("Y"))
                             tf.transfer();
                     }
                     if(spec.w < 2)
                     {
                         System.out.print("Do you want to take a loan of Rs 100? (Y/N) : ");
                         if(br.readLine().equalsIgnoreCase("Y"))
                         {
                            System.out.println("YOU HAVE TAKEN A LOAN OF Rs 100.00 only. YOU HAVE TO RETURN Rs 130.00 only. THE MONEY WILL BE CUT FROM YOUR 'SAVINGS' AUTOMATICALLY.");
                            spec.w += 100;
                            spec.l = 'L';
                            spec.db = 130;
                        }
                         else
                            return;
                     }
                 }
                 break;
            }
            while(true);
        }
        while(true);
    }
    void deposit()throws IOException
    {
        new Time("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t    W E L C O M E\t T O\t O U R\t   C O U N T E R","15s");
        w += ch;
    }
}