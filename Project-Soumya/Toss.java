import java.util.*;
class Toss
{
    public static void toss()
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("\n\t~*~*~*~* W E L C O M E *~*~*~*~\n\nEnter number of items : ");
       String ar[] = new String[(int)sc.nextDouble()];
       for(int i = 1; i <= ar.length; i++)
       {
           System.out.print("Enter item number "+i+"   : ");
           ar[i-1] = (sc.next()+sc.nextLine()).trim(); 
       }
       System.out.println("\f========================\n\t Items\n========================");
       for(int i = 1; i <= ar.length; i++)
           System.out.println("  "+i+". "+ar[i-1]);
       do
           System.out.print("\nSolution : "+ar[(int)(Math.random()*ar.length)]+"\nDo you want to continue(Y/N) : ");
       while(sc.next().toUpperCase().charAt(0) == 'Y');
    }
} 