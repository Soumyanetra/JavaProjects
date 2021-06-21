package GAMES; 
import java.util.*;
import java.io.*;
class Selections extends Common
{
    protected void selections()throws IOException
    {
        System.out.print("\n\t");
        sy.di("TEAM  SELECTIONS","450");
        int i = 0; String t;
        while(i < 4)
        {
            if(i == 0)
                System.out.println("\n\n\tGROUP - A\t\t\t\tGROUP - B\n");
            System.out.println("   "+(i+1)+". "+Team[i]+"\t\t\t   "+(i+1)+". "+Team[i+++4]);
        }
        do
        {
            System.out.print("\n\nSelect Your Team : ");
            if(search((t = sc.next()),"",0))
               break;
        }
        while(true);
        do
        {
            System.out.print("\nSelect Oponent Team : ");
            if(search(sc.next(),t,1))
                break;
        }
        while(true);
        squadu();squadc();
        for(i = 0; i<11; i++)
            System.out.println(Squad[0][i]+"\t\t\t\t"+Squad[1][i]);
    }
    protected boolean search(String a,String pre,int f)
    {
        if(a.equalsIgnoreCase(pre) || a.length() != 2 ||(Character.toUpperCase(a.charAt(1)) != 'A' && Character.toUpperCase(a.charAt(1)) != 'B') || (a.charAt(0) < '1' || a.charAt(0) > '4'))
            return false;
        if(Character.toUpperCase(a.charAt(1)) == 'A')
            if(f == 0)
                t1 = Integer.valueOf(a.charAt(0)+"")-1;
            else
                t2 = Integer.valueOf(a.charAt(0)+"")-1;
        else
            if(f == 0)
                t1 = Integer.valueOf(a.charAt(0)+"")+3;
            else
                t2 = Integer.valueOf(a.charAt(0)+"")+3;
        return true;
    }
    protected void squadu()throws IOException
    {
        int i = 0,c = 0;
        int pl[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.print("\f\n\t");
        sy.di("SQUAD  SELECTION","450");
        System.out.println("\n\n\t "+Team[t1]+"\n\n");
        while(i < 15)
        {
            if(i < 9)
                System.out.println(" "+(i+1)+". "+Members[t1][i++]);
            else
                System.out.println(" "+(i+1)+". "+Members[t1][i++]);
        }
        i = 0;
        System.out.print("\n\n");
        while(c < 11)
        {
            if(pl[i++] != -1)
            {
                System.out.print("Press 'Enter' to select Member '"+Members[t1][pl[i-1]]+"' : ");
                if(br.readLine().equals(""))
                {
                    Squad[0][c++] = abbreviate(Members[t1][pl[i-1]]);
                    pl[i-1] = -1;
                }
            }
            if(i == 15)
                i = 0;
        }
        System.out.print("\f\n\t");
        sy.di("CAPTAIN  SELECTION","450");
        i = 0;
        System.out.println("\n\n\t\t\tYOUR  TEAM  MEMBERS\n\n\t\t\t"+Team[t1]+"\n");
        while(i < 11)
        {
            if(i < 9)
                System.out.println("\t"+(i+1)+".  "+Squad[0][i++]);
            else
                System.out.println("\t"+(i+1)+". "+Squad[0][i++]);
        }
        System.out.print("\n");
        i = 0;
        while(true)
        {
            System.out.print("Press 'Enter' to select '"+Squad[0][i++].trim()+"' as Captain : ");
            if((br.readLine()).equals(""))
            {
                Squad[0][i-1] = Squad[0][i-1].trim()+"(c)";
                break;
            }
            i = (i == 11)?0:i;
        }
    }
    protected void squadc()
    {
        int i = 0;
        while(i < 11)
            Squad[1][i] = select(i++);
    }
    String select(int i)
    {
        if(Rank[t2][i].length() <= 2 && Rank[t2][i].charAt(Rank[t2][i].length()-1) != 'c')
            return abbreviate(Members[t2][Integer.valueOf(Rank[t2][i])]);
        if(Rank[t2][i].length() <= 2 && Rank[t2][i].charAt(Rank[t2][i].length()-1) == 'c')
            return abbreviate(Members[t2][Integer.valueOf(Rank[t2][i].substring(0,Rank[t2][i].length()-1))]).trim()+"(c)";
        StringTokenizer st = new StringTokenizer(Rank[t2][i],",");
        int a = (int)(Math.random()*st.countTokens()),ct = 0;
        while(true)
        {
            if(a == (ct++))
                return abbreviate(Members[t2][Integer.valueOf(st.nextToken())]);
            st.nextToken();
        }
    }
    String abbreviate(String pm)
    {
        StringTokenizer st = new StringTokenizer(pm);
        String t = st.nextToken().charAt(0)+".",x;
        if(Character.isUpperCase((x = st.nextToken()).charAt(0)) && st.hasMoreTokens())
            t += x.charAt(0)+".";
        if(st.hasMoreTokens() && Character.isUpperCase((x = st.nextToken()).charAt(0)) == false)
            x = st.nextToken();
        else if (t.length()+x.length() <= 10)
            return length(t+x);
        return t+x.charAt(0)+"'"+x.substring(t.length()+x.length()-8);
    }
    String length(String s)
    {
        int l = 10-s.length();
        int i = 0;
        while(i++ < l)
            s += " ";
        return s;
    }
}