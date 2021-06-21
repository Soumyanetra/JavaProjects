package GAMES;
import java.util.*;
import java.io.*;  
class Situation extends Common
{
    protected void situation()throws IOException
    {
        char L = level();
        System.out.print("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t");
        sy.di("A Match","400");
        sy.blink("","");
    }
    protected char level()
    {
        do
        {
            System.out.print("\fE. Easy\nM. Medium\nH. Hard\nEnter your choice : ");
            char l;
            if((l = sc.next().toUpperCase().charAt(0)) == 'E' || l == 'M' || l == 'H')
                return l;
        }
        while(true);
    }
}