import java.util.*;
class Shopping_Mall
{
    Scanner sc = new Scanner(System.in);
    String type[] = {"J. Jeans","S. Shirt","T. Trousers","S. Saree","K. Salwar","H. Hot-pant","S. Shirt", "P. Pant ", "F. Frok "};
    double price[] = {((int)(Math.random()*599)+200),((int)(Math.random()*699)+200),((int)(Math.random()*599)+200),((int)(Math.random()*1999)+1000),((int)(Math.random()*999)+900),((int)(Math.random()*299)+150),((int)(Math.random()*599)+200),((int)(Math.random()*599)+200),((int)(Math.random()*599)+200)};
    String Bcolo[] = {"B - Blue","R - Red  ","G - Green","Y - Yellow","BL - Black","P - Pink","O - Orange"};
    String buy[] = new String[100];
    int qnt[] = new int[100];
    double bp[] = new double[100];
    int p = 0, z;
    public static void main()
    {
        System.out.println("\t\tW E L C O M E !!    TO THE 'ZODIAC SHOPPING CENTER'\n");
        Shopping_Mall sm = new Shopping_Mall();
        sm.accept();
    }
    public void accept()
    {
        System.out.print("Dear Customer,\nEnter your 'Name'   : ");
        String n = (sc.next()+sc.nextLine()).trim();
        System.out.print("\nDear "+n+",\nEnter your 'Address' : ");
        String ad = (sc.next()+sc.nextLine()).trim();
        choice();
        if(buy[0] != null)
        bill(n,ad);
        else
        System.out.println("Dear "+n+",\nYou haven't bought anything!!");
    }
    public void choice()
    {
        do
        {
            System.out.print("\nPlease choose :\n\n1. MEN CABINET\n2. LADIES CABINET\n3. KIDS WEARS\n\nPlease enter your choice : ");
            switch(sc.nextInt())
            {
                case 1: ts(0,2);
                break;
                case 2: ts(3,5);
                break;
                case 3: ts(6,8);
                break;
                default :
                System.out.println("WRONG CHOICE!!");
            }
            System.out.print("\nDo you want to place more orders in other cabinets(Y/N) : ");
        }
        while(sc.next().toUpperCase().charAt(0) == 'Y');
    }
    public void ts(int l, int u)
    {
        do
        {
            boolean b;
            do
            {
                for(int i = l; i <= u; i++)
                System.out.println(type[i]+"\t\tRs "+price[i]);
                System.out.print("\nEnter your choice : ");
                char c = sc.next().toUpperCase().charAt(0);
                b = legal(l,u,c);
            }
            while(b == false);
            do
            {
                b = true;
                String te[] = new String[3];
                for(int i = 0; i < 3; i++)
                System.out.println((i+1)+". "+(te[i] = Bcolo[(int)(Math.random()*7)]));
                System.out.print("\nEnter your choice : ");
                int ch = sc.nextInt();
                if(ch > 0 && ch < 4)
                {
                    buy[p] = te[ch-1];
                    System.out.print("Enter quantity  : ");
                    qnt[p] = sc.nextInt();
                    bp[p++] = price[z]*qnt[p-1];
                }
                else
                {
                     System.out.print("\nInvalid entry!!\nPlease Re-enter\nColours & Brand may change.\nPress any key enter to continue : ");
                     sc.next();
                     b = false;
                }
            }
            while(b == false);
            System.out.print("\nColours & Brand may change.\nDo you want to place more orders(Y/N) : ");
        }
        while(sc.next().toUpperCase().charAt(0) == 'Y');
    }
    public boolean legal(int l, int u, char c)
    {
        int ct = 0;
        for(int i = l; i <= u; i++)
        {
            if(type[i].charAt(0) == c)
            {
                z = i;
                ct = 1;
            }
        }
        if(ct == 1)
        return(true);
        else
        return(false);
    }
    public void bill(String n, String ad)
    {
        System.out.println("\nPlease collect your bill.\n\n====================================================================================================\n\t\t\t  Z O D I A C    S H O P P I N G   C E N T E R\n====================================================================================================\n\n");
        System.out.println(" Name of customer : "+n+"\n Address \t  : "+ad+"\n\n---------------------------------------------------------------------------------------------------\n| S.NO. |     Item\t|\t  Brand\t\t|\tQuantity\t|\tPrice(in Rs)\t  |\n---------------------------------------------------------------------------------------------------\n|\t|\t\t|\t\t\t|\t\t\t|\t\t\t  |");
        double am = 0,vat;
        for(int i = 0; i < buy.length; i++)
        {
            if(buy[i] != null)
            {
                System.out.println("|   "+(i+1)+".  |     "+type[i].substring(3)+"\t|\t"+buy[i]+"\t|\t    "+qnt[i]+"\t\t|\t  "+bp[i]+"0\t  |");
                am += bp[i];
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        vat = (0.125*am);
        System.out.println("\n VAT\t\t:   12.5 %\n VAT amount     :  "+Math.round(vat)+".00\n Total Amount   : "+Math.round((vat+am))+".00");
    }
}