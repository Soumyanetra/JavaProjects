import java.util.*;
class K_Map_4V
{
   static char vab[] = new char[4];
   String π[][] = new String[4][4];
   String ϕ[][] = new String[4][4];
   int mak[][] = new int[4][4];
   int num[][] = {{0},{1},{3},{2},
                  {4},{5},{7},{6},
                  {12},{13},{15},{14},
                  {8},{9},{11},{10}};
   K_Map_4V(char a, char b, char c, char d)
   {
       π[0][0] = a+"+"+b+"+"+c+"+"+d;  π[0][1] = a+"+"+b+"+"+c+"+"+d+"’";  π[0][2] = a+"+"+b+"+"+c+"’+"+d+"’";  π[0][3] = a+"+"+b+"+"+c+"’+"+d;
       π[1][0] = a+"+"+b+"’+"+c+"+"+d; π[1][1] = a+"+"+b+"’+"+c+"+"+d+"’";  π[1][2] = a+"+"+b+"’+"+c+"’+"+d+"’";  π[1][3] = a+"+"+b+"’+"+c+"’+"+d;
       π[2][0] = a+"’+"+b+"’+"+c+"+"+d; π[2][1] = a+"’+"+b+"’+"+c+"+"+d+"’"; π[2][2] = a+"’+"+b+"’+"+c+"’+"+d+"’"; π[2][3] =a+"’+"+b+"’+"+c+"’+"+d;
       π[3][0] = a+"’+"+b+"+"+c+"+"+d; π[3][1] = a+"’+"+b+"’+"+c+"+"+d+"’";  π[3][2] = a+"’+"+b+"+"+c+"’+"+d+"’"; π[3][3] = a+"’+"+b+"+"+c+"’+"+d;
       ϕ[0][0] = a+"’"+b+"’"+c+"’"+d+"’"; ϕ[0][1] = a+"’"+b+"’"+c+"’"+d; ϕ[0][2] = a+"’"+b+"’"+c+""+d; ϕ[0][3] = a+"’"+b+"’"+c+""+d+"’";
       ϕ[1][0] = a+"’"+b+""+c+"’"+d+"’"; ϕ[1][1] = a+"’"+b+""+c+"’"+d;  ϕ[1][2] = a+"’"+b+""+c+""+d; ϕ[1][3] = a+"’"+b+""+c+""+d+"’";
       ϕ[2][0] = a+""+b+""+c+"’"+d+"’";  ϕ[2][1] = a+""+b+""+c+"’"+d;  ϕ[2][2] = a+""+b+""+c+""+d;  ϕ[2][3] = a+""+b+""+c+""+d+"’";
       ϕ[3][0] = a+""+b+"’"+c+"’"+d+"’"; ϕ[3][1] = a+""+b+"’"+c+"’"+d;  ϕ[3][2] = a+""+b+"’"+c+""+d; ϕ[3][3] = a+""+b+"’"+c+""+d+"’";
   }
   static void accept()
   {
       Scanner sc = new Scanner(System.in);
       int ch;
       System.out.print("CHOOSE FORMAT\n");
       do
       {
           System.out.print("\n 1. SUM OF PRODUCT(SOP - ∑)\n 2. PRODUCT OF SUM(POS - π)\n\nEnter your choice: ");
           ch = sc.nextInt();
           if(ch == 1 || ch == 2)
                break;
       }
       while(true);
       System.out.print("\fENTER CARDINAL NUMBER: ");
       int cnal[] = new int[sc.nextInt()];
       System.out.println("\fENTER THE NUMBERS:\n");
       for(int i = 0; i < cnal.length; i++)
           cnal[i] = sc.nextInt();
       for(int i = 1; i <= 4; i++)
       {
           System.out.print("\fENTER VARIABLE-"+i+": ");
           vab[i-1] = sc.next().charAt(0);
       }
       K_Map_4V km = new K_Map_4V(vab[0],vab[1],vab[2],vab[3]);
       km.mark(cnal);
       km.findco(ch);
       km.display();
   }
   void mark(int cnal[])
   {
       for(int p = 0; p < cnal.length; p++)
       {
           int i = (cnal[p] < 4)?0:(cnal[p] < 8)?1:(cnal[p] < 12)?3:2;
           for(int j = 0; j < 4; j++)
               if(num[i][j] == cnal[p])
                   mak[i][j] = 1;
       }
   }
   String findco(int ch)
   {
       String r = "";int c = 0;
       for(int i = 0; i < mak.length; i++)
           for(int j = 0; j < 2; j++)
               if(mak[i][j] == 1)
                  c++;
       if(c == 8 && ch == 1)
          r += vab[2]+""+vab[3];
       else if(c == 8 && ch == 2)
          r += vab[2]+""+vab[3];
       return r;
   }
   void display()
   {
   }
}