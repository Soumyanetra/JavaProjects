import java.util.*;
class AMOUNT_SCANNER
 {
     protected static void main ()
     {
         Scanner sc = new Scanner(System.in);
         int c = 0, amount = 0;
         System.out.println ("1. for 5 rupees note.");
         System.out.println ("2. for 10 rupees note.");
         System.out.println ("3. for 50 rupees note.");
         System.out.print ("Enter your choice....  ");
         c = sc.nextInt();
         System.out.print ("Enter amount....  ");
         amount = sc.nextInt();
         switch(c)
         {
             case 1:
             new AMOUNT_SCANNER().five (amount);
             break;
             case 2:
             new AMOUNT_SCANNER().ten (amount);
             break;
             case 3:
             new AMOUNT_SCANNER().fifty (amount);
             break;
             default :
             System.out.println ("WRONG CHOICE!!");
         }
     }
         public void five ( int t )
         {
             int d = t % 5;
             int j = ( t - d ) / 5;
             System.out.println ("Number of 5 rupees note is =" + j);
         }
         public void ten ( int f )
         {
             int d = f % 10;
             int j = ( f - d ) / 10;
             System.out.println ("Number of 10 rupees note is =" + j);
         }
         public void fifty ( int ft )
         {
             int d = ft % 50;
             int j = ( ft - d ) / 50;
             System.out.println ("Number of 50 rupees note is =" + j);
         }
 }