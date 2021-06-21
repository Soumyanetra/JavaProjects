import java.io.*;
class Tbreak extends Centre
{
    protected void tiebreaker()throws IOException
    {
        new Delay("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\tI T ' s\t   A\tT I E !!","5s");
        System.out.print("\f\nDo you want to execute a 'Tie Breaking' round? (Y/N) : ");
        if(br.readLine().toUpperCase().equalsIgnoreCase("Y"))
        {
            em.ask();
            System.out.print("\f\nEnter Name of the Round : ");
            cc.calculate((sc.next()+sc.nextLine()).trim(),0);
        }
    }
}