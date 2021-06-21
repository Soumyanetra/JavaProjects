package GAMES;
import java.io.*;
import java.util.*;
class Arrange
{
    PUZZLE p = new PUZZLE();
    public void arrange(String pz[][],String na)throws IOException
    {
        p.display(pz,na,'L');
        arr(pz,na);
    }
    public void arr(String pz[][],String na)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String a;
        boolean c;
        do
        {
            System.out.print("\nEnter the number to be shifted : ");
            a = sc.next();
            if(a.equalsIgnoreCase("Exit"))
            {
                System.out.print("Do you want to save game(Y/N) : ");
                if(sc.next().toUpperCase().charAt(0) == 'Y')
                {
                    Read_Write rw = new Read_Write();
                    rw.write(pz);
                }
                break;
            }
            int i = 0, j = 0, h, k;
            outer:
            for(i = 0; i < pz[0].length; i++)
            {
                for(j = 0; j < pz[1].length; j++)
                {
                    if(a.equalsIgnoreCase(pz[i][j]))
                    break outer;
                }
            }
            outer:
            for(h = 0; h < pz[0].length; h++)
            {
                for(k = 0; k < pz[1].length; k++)
                {
                    if((pz[h][k].equalsIgnoreCase("")) && (h == i || k == j) && (Math.abs(h-i) == 1 || Math.abs(k-j) == 1 ))
                    {
                        pz[h][k] = pz[i][j];
                        pz[i][j] = "";
                        break outer;
                    }
                    else if((pz[h][k].equalsIgnoreCase("")) && (h == i))
                    {
                            if((i+j) > (h+k))
                            {
                                pz[h][k] = pz[h][Math.abs(k+1)];
                                pz[h][Math.abs(k+1)] = "";
                            }
                            else
                            {
                                pz[h][k] = pz[h][Math.abs(k-1)];
                                pz[h][Math.abs(k-1)] = "";
                                k = k-2;
                            }
                    }
                    else if((pz[h][k].equalsIgnoreCase("")) && (k == j))
                    {
                        for(int x = h; x < pz[0].length; x++)
                        {
                            if((i+j) > (h+k))
                            {
                                 pz[x][k] = pz[Math.abs(x+1)][k];
                                 pz[Math.abs(x+1)][k] = "";
                                 if(pz[i][j].equals("") || x == pz[0].length-1)
                                 break;
                            }
                            else
                            {
                                 pz[x][k] = pz[Math.abs(x-1)][k];
                                 pz[Math.abs(x-1)][k] = "";
                                 x = x-2;
                                 if(x == i-1)
                                 break;
                            }
                        }
                        break outer;
                    }
                }
            }
            if(h == pz[0].length)
            System.out.println("\nINVALID ENTRY!!\n");
            c = check(pz);
            if(c == true)
            {
                for(i = 0; i < pz[0].length; i++)
                {
                    for(j = 0; j < pz[1].length; j++)
                    {
                        if(pz[i][j].equals("") && pz[0][0].equals("1"))
                        pz[i][j] = Integer.toString(pz[0].length*pz[1].length);
                        else if(pz[i][j].equals("") && pz[0][0].equals("A"))
                        pz[i][j] = ((char)(64+pz[0].length*pz[1].length))+"";
                    }
                }
                System.out.println("\f\nCONGRATS!!! "+na+",\nYOU WON!!");
                p.display(pz,na,'W');
                break;
            }
            p.display(pz,na,'L');
        }
        while(c == false);
    }
    public boolean check(String pz[][])
    {
        int i = 0, j = 0, c = 1; char ch = 'A';
        outer:
        for(i = 0; i < pz[0].length; i++)
        {
            for(j = 0; j < pz[1].length; j++)
            {
                if(pz[0][0].equals("1") && (pz[i][j].equalsIgnoreCase(Integer.toString(c++)) == false || pz[i][j].equals("")))
                break outer;
                if(pz[0][0].equals("A") && (pz[i][j].equalsIgnoreCase(ch+++"") == false || pz[i][j].equals("")))
                break outer;
            }
        }
        if(i == pz[0].length-1 && j == pz[1].length-1)
        return(true);
        else
        return(false);
    }
}