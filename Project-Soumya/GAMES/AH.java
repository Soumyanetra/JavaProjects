package GAMES;
import java.io.*;
class AH extends Acpt
{
    protected void about()throws IOException
    {
        System.out.print("\f\n\t\t\t B ! N G 0\n\nVERSION \t: 3.1.7\nDATE \t\t: 25/10/2016\nDESIGNER \t: Soumyanetra\nCOMPANY\t\t: S - GAMES\n\nPress 'Enter' to continue : ");
        br.readLine();
    }
    protected void help()throws IOException
    {
        System.out.print("\f\n\t\t\tB ! N G O\n\n Procedure to win B!NGO : \n\n Your aim is to fill 'n' number of rows or columns or diagonals with space(' ').\n Where 'n' is number of rows of your grid.\n You will be provided alternative chances to call numbers.\n The side who reaches 'n' first wins the tie!\n To exit from the game abruptly press '9999' and follow the instructions provided then.\n ENJOY IT!!!!");
        System.out.print("\n\nPress 'Enter' to continue : ");
        br.readLine();
    }
}