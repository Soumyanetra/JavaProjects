package GAMES; 
import java.util.*;
import java.io.*;
class CHAMPIONS_TROPHY_2017 extends Common
{
    static void main()throws IOException
    {
        outer:
        do
        {
            System.out.print("\f1. QUICK MATCH\n2. TOURNAMENT\n3. SITUATION4. EXIT\nEnter your choice : ");
            switch(sc.nextInt())
            {
                case 1: sl.selections(); qm.qumat(); break;
                case 2: sl.selections(); tt.tournament(); break;
                case 3: sl.selections(); st.situation(); break;
                case 4: break outer;
            }
        }
        while(true);
    }
}