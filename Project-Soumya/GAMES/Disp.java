package GAMES;
import java.io.*;
class Disp extends Acpt
{ 
    protected void display()throws IOException
    {
        System.out.println("\nYour "+UA[0].length+"x"+UA[1].length+" Bingo grid :\n");
        draw();
        for(int i = 0; i < UA[0].length; i++)
        {
             for(int j = 0; j < UA[1].length; j++)
             {
                 if(Integer.toString(UA[i][j]).length() == 1)
                 {
                     if(UA[i][j] != 0)
                         System.out.print("| 0"+UA[i][j]+" ");
                     else
                         System.out.print("|    ");
                 }
                 else
                 {
                     if(UA[i][j] != 0)
                         System.out.print("| "+UA[i][j]+" ");
                     else
                         System.out.print("|    ");
                 }
             }
             System.out.println("|");
        }
        draw();
        if(jd.v == 0)
        {
            System.out.println("\n\nComputer's "+CA[0].length+"x"+CA[1].length+" Bingo grid :\n");
            draw();
            for(int i = 0; i < CA[0].length; i++)
            {   
                for(int j = 0; j < CA[1].length; j++)
                {
                    if(Integer.toString(CA[i][j]).length() == 1)
                    {
                        if(CA[i][j] != 0)
                            System.out.print("| 0"+CA[i][j]+" ");
                        else
                            System.out.print("|    ");
                    }
                    else
                    {
                        if(CA[i][j] != 0)
                            System.out.print("| "+CA[i][j]+" ");
                        else
                            System.out.print("|    ");
                    }
                }
                System.out.println("|");
            }
            draw();
            System.out.print("\nPress 'Enter' to continue : ");
            br.readLine();
        }
    }
    protected void draw()
    {
        if(UA[0].length == 3)
            System.out.println("----------------");
        else if(UA[0].length == 4)
            System.out.println("---------------------");
        else if(UA[0].length == 5)
            System.out.println("--------------------------");
        else if(UA[0].length == 6)
            System.out.println("-------------------------------");
        else                  
            System.out.println("------------------------------------");
    }
}