/**
 PROJECT TITLE      : Railway Reservation.
 PURPOSE OF PROJECT : To provide users a user friendly process to book or cancel ticket, 
                      see reservation chart & seat aviability.
 AUTHOR             : Soumyanetra Pal.
 CLASS              : X.
 SECTION            : B.
 ROLL No            : 35.
 */
import java.util.*;
class Railway_Reservation
{
    Scanner sc = new Scanner(System.in);
    int n,m,ct;
    char c;
    int np[] = {0, 0, 0, 0};//To store number of passenger.
    int p[] = {-1, -1, -1, -1};//To store temporary values .
    int ar[] = new int[4];//to store amount of fair.
    int se[] = {20, 30, 40, 60};//stores total seats in each coach.
    String co[] = {"AC First class", "AC Two-tire", "AC Three-tire", "Sleeper class"};
    //AC First class
    String Anam1[] = new String[20];//to store names of passengers.
    char Agen1[] = new char[20];//to store gender of passengers.
    int Aage1[] = new int[20];//to store age of passengers.
    double amt1[] = new double[20];//To store the amount of passengers.
    //AC Two-tire
    String Anam2[] = new String[30];//to store names of passengers.
    char Agen2[] = new char[30];//to store gender of passengers.
    int Aage2[] = new int[30];//to store age of passengers.
    double amt2[] = new double[30];//To store the amount of passengers.
    //AC Three-tire
    String Anam3[] = new String[40];//to store names of passengers.
    char Agen3[] = new char[40];//to store gender of passengers.
    int Aage3[] = new int[40];//to store age of passengers.
    double amt3[] = new double[40];//To store the amount of passengers.
    //Sleeper class
    String Anams[] = new String[60];//to store names of passengers.
    char Agens[] = new char[60];//to store gender of passengers.
    int Aages[] = new int[60];//to store age of passengers.
    double amts[] = new double[60];//To store the amount of passengers.
    public static void main()
    {
        Railway_Reservation rr = new Railway_Reservation();
        rr.choice();
    }
    public void choice()
    {
        String s;
        System.out.println("\t~*~*~ Welcome to Railway Reservation counter ~*~*~");
        System.out.println("1. Rajdhani Express.");
        System.out.println("2. Gitanjali (Mumbai) Express.");
        System.out.println("3. Guwahati-Howrah-Thiruvananthapuram weekly Express.");
        System.out.print("Please select your train : ");
        n = sc.nextInt();
        if( n <= 3 )
        {
            Railway_Reservation rr = new Railway_Reservation();
            if(n == 1)
            s = "Rajdhani Express";
            else if(n == 2)
            s = "Gitanjali(Mumbai)Express";
            else 
            s = "Guwahati-Howrah-Thiruvananthapuram weekly Express";
            do
            {
                c = 'Y';
                System.out.println("1. Want to book ticket.");
                System.out.println("2. Dispaly reservation chart.");
                System.out.println("3. Want to Cancel ticket.");
                System.out.println("4. Show seat aviability.");
                System.out.println("5. Exit.");
                System.out.print("Choose task to be performed : ");
                n = sc.nextInt();
                switch(n)
                {
                      case 1:
                      rr.bticket(s);
                      break;
                      case 2:
                      rr.drchart(s);
                      break;
                      case 3:
                      rr.cticket();
                      break;
                      case 4:
                      rr.saviability(s);
                      break;
                      case 5:
                      c = 'N';
                      break;
                      default:
                      System.out.println("Wrong choice!!");
                }
                if(c == 'Y')
                {
                    System.out.print("Do you want to continue(Y/N) : ");
                    c = sc.next().charAt(0);
                }
            }
            while(c == 'Y' || c == 'y');
        }
        else
        System.out.println("Sorry!! No train available in entered number.");
    }
    public void bticket(String s)
    {
        int b,k;
        ct = 0;
        c = 'N';
        String st = "", d = "";
        double tc = 0.0;
        do
        {
            System.out.println("There are special rebate based on age & gender.");
            if(s.equals("Rajdhani Express"))
            {
                System.out.println("1. AC First class (Rs 2800)");
                System.out.println("2. AC Two-tire    (Rs 2000)");
                System.out.println("3. AC Three-tire  (Rs 1350)");
                System.out.println("4. Sleeper class  (Rs 750)");
                ar[0] = 2800;
                ar[1] = 2000;
                ar[2] = 1350;
                ar[3] = 750;
            }
            else if(s.equals("Gitanjali(Mumbai)Express"))
            {
                System.out.println("1. AC First class (Rs 2600)");
                System.out.println("2. AC Two-tire    (Rs 1900)");
                System.out.println("3. AC Three-tire  (Rs 1250)");
                System.out.println("4. Sleeper class  (Rs 650)");
                ar[0] = 2600;
                ar[1] = 1900;
                ar[2] = 1250;
                ar[3] = 650;
            }
            else
            {
                System.out.println("1. AC First class (Rs 2150)");
                System.out.println("2. AC Two-tire    (Rs 1700)");
                System.out.println("3. AC Three-tire  (Rs 1100)");
                System.out.println("4. Sleeper class  (Rs 500)");
                ar[0] = 2150;
                ar[1] = 1700;
                ar[2] = 1100;
                ar[3] = 500;
            }
            System.out.print("Please enter your choice : ");
            n = sc.nextInt();
            if( n <= 4 )
            {   
                k = 1;
                System.out.print("Enter starting station    : ");
                st = sc.next();
                st += sc.nextLine();
                System.out.print("Enter destination station : ");
                d = sc.nextLine();
                System.out.print("Enter number of passenger(s) : ");
                m = sc.nextInt();
                //AC First class
                if(n == 1)
                {
                    se[0] -= m;
                    if(se[0] > 0)
                    {
                        np[0] += m;
                        for(int i = p[0]+1; i < np[0]; i++)
                        {
                            System.out.print("Enter name of passenger " +k+" : ");
                            Anam1[i] = sc.next();
                            Anam1[i] += sc.nextLine();
                            System.out.print("Enter gender(M/F) : ");
                            Agen1[i] = sc.next().charAt(0);
                            System.out.print("Enter age : ");
                            Aage1[i] = sc.nextInt();
                            if(Aage1[i] < 12)
                            amt1[i] = ar[0]/2;
                            else if(Aage1[i] >= 60 && Agen1[i] == 'M')
                            amt1[i] = ar[0]*0.6;
                            else if(Aage1[i] >= 58 && Agen1[i] == 'F')
                            amt1[i] = ar[0]*0.5;
                            else
                            amt1[i] = ar[0];
                            tc += amt1[i];
                            ct = 1;
                            k++;
                        }
                    }
                    if(ct == 1)
                    {
                        k = 1;
                        b = (int)((Math.random()*20)+1);
                        System.out.println("==================================================================");
                        System.out.println("\t\t\t~*~*~*~*Ticket*~*~*~*~");
                        System.out.println("==================================================================");
                        System.out.println("Train name : " +s);
                        System.out.println("Ps No\tName\t\tGender\tAge\tCoach\t\tBerth");
                        for(int i = p[0]+1; i < np[0]; i++)
                        {   
                          System.out.println(k+"\t"+Anam1[i]+"\t "+Agen1[i]+"\t"+Aage1[i]+"\t"+co[n-1]+"\t"+b);
                          b++;k++;
                          p[0] = i;
                        }
                        System.out.println("\t\tTotal : Rs "+tc+"0");
                        System.out.println("Source station      : "+st);
                        System.out.println("Destination station : "+d);
                    }
                    else
                    System.out.println("No seat aviability.");
                }
                //AC Two-tire
                else if(n == 2)
                {
                    se[1] -= m;
                    if(se[1] > 0)
                    {
                        np[1] += m;
                        for(int i = p[1]+1; i < np[1]; i++)
                        {
                            System.out.print("Enter name of passenger " +k+" : ");
                            Anam2[i] = sc.next();
                            Anam2[i] += sc.nextLine();
                            System.out.print("Enter gender(M/F) : ");
                            Agen2[i] = sc.next().charAt(0);
                            System.out.print("Enter age : ");
                            Aage2[i] = sc.nextInt();
                            if(Aage2[i] < 12)
                            amt2[i] = ar[1]/2;
                            else if(Aage2[i] >= 60 && Agen2[i] == 'M')
                            amt2[i] = ar[1]*0.6;
                            else if(Aage2[i] >= 58 && Agen2[i] == 'F')
                            amt2[i] = ar[1]*0.5;
                            else
                            amt2[i] = ar[1];
                            tc += amt2[i];
                            ct = 1;
                            k++;
                        }
                        if(ct == 1)
                        {
                            k = 1;
                            b = (int)((Math.random()*30)+1);
                            System.out.println("==================================================================");
                            System.out.println("\t\t\t~*~*~*~*Ticket*~*~*~*~");
                            System.out.println("==================================================================");
                            System.out.println("Train name : " +s);
                            System.out.println("Ps No\tName\t\tGender\tAge\tCoach\t\tBerth");
                            for(int i = p[1]+1; i < np[1]; i++)
                            {   
                                System.out.println(k+"\t"+Anam2[i]+"\t"+Agen2[i]+"\t"+Aage2[i]+"\t"+co[n-1]+"\t"+b);
                                b++;k++;
                                p[1] = i;
                            }
                            System.out.println("\t\tTotal : Rs "+tc+"0");
                            System.out.println("Source station      : "+st);
                            System.out.println("Destination station : "+d);
                        }
                    }
                    else
                    System.out.println("No seat aviability.");
                }
                //AC Three-tire
                else if(n == 3)
                {
                    se[2] -= m;
                    if(se[2] > 0)
                    {
                        np[2] += m;
                        for(int i = p[2]+1; i < np[2]; i++)
                        {
                            System.out.print("Enter name of passenger " +k+" : ");
                            Anam3[i] = sc.next();
                            Anam3[i] += sc.nextLine();
                            System.out.print("Enter gender(M/F) : ");
                            Agen3[i] = sc.next().charAt(0);
                            System.out.print("Enter age : ");
                            Aage3[i] = sc.nextInt();
                            if(Aage3[i] < 12)
                            amt3[i] = ar[2]/2;
                            else if(Aage3[i] >= 60 && Agen3[i] == 'M')
                            amt3[i] = ar[2]*0.6;
                            else if(Aage3[i] >= 58 && Agen3[i] == 'F')
                            amt3[i] = ar[2]*0.5;
                            else
                            amt3[i] = ar[2];
                            tc += amt3[i];
                            ct = 1;
                            k++;
                        }
                        if(ct == 1)
                        {
                            k = 1;
                            b = (int)((Math.random()*40)+1);
                            System.out.println("==================================================================");
                            System.out.println("\t\t\t~*~*~*~*Ticket*~*~*~*~");
                            System.out.println("==================================================================");
                            System.out.println("Train name : " +s);
                            System.out.println("Ps No\tName\t\tGender\tAge\tCoach\t\tBerth");
                            for(int i = p[2]+1; i < np[2]; i++)
                            {   
                                System.out.println(k+"\t"+Anam3[i]+"\t"+Agen3[i]+"\t"+Aage3[i]+"\t"+co[n-1]+"\t"+b);
                                b++;k++;
                                p[2] = i;
                            }
                            System.out.println("\t\tTotal : Rs "+tc+"0");
                            System.out.println("Source station      : "+st);
                            System.out.println("Destination station : "+d);
                        }
                    }   
                    else
                    System.out.println("No seat aviability.");
                }
                //Sleeper class
                else
                {
                    se[3] -= m;
                    if(se[3] > 0)
                    {
                        np[3] += m;
                        for(int i = p[3]+1; i < np[3]; i++)
                        {
                            System.out.print("Enter name of passenger " +k+" : ");
                            Anams[i] = sc.next();
                            Anams[i] += sc.nextLine();
                            System.out.print("Enter gender(M/F) : ");
                            Agens[i] = sc.next().charAt(0);
                            System.out.print("Enter age : ");
                            Aages[i] = sc.nextInt();
                            if(Aages[i] < 12)
                            amts[i] = ar[3]/2;
                            else if(Aages[i] >= 60 && Agens[i] == 'M')
                            amts[i] = ar[3]*0.6;
                            else if(Aages[i] >= 58 && Agens[i] == 'F')
                            amts[i] = ar[3]*0.5;
                            else
                            amts[i] = ar[3];
                            tc += amts[i];
                            ct = 1;
                            k++;
                        }
                        if(ct == 1)
                        {
                            k = 1;
                            b = (int)((Math.random()*60)+1);
                            System.out.println("==================================================================");
                            System.out.println("\t\t\t~*~*~*~*Ticket*~*~*~*~");
                            System.out.println("==================================================================");
                            System.out.println("Train name : " +s);
                            System.out.println("Ps No\tName\t\tGender\tAge\tCoach\t\tBerth");
                            for(int i = p[3]+1; i < np[3]; i++)
                            {   
                                System.out.println(k+"\t"+Anams[i]+"\t"+Agens[i]+"\t"+Aages[i]+"\t"+co[n-1]+"\t"+b);
                                b++;k++;
                                p[3] = i;
                            }
                            System.out.println("\t\tTotal : Rs "+tc+"0");
                            System.out.println("Source station      : "+st);
                            System.out.println("Destination station : "+d);
                        }
                    }
                    else
                    System.out.println("No seat aviability.");
                }
            }
            else
            {
                System.out.println("Wrong Choice!!");
                System.out.print("Do you want to select again(Y/N) : ");
                c = sc.next().charAt(0);
            }
        }
        while(c == 'Y' || c == 'y');
    }
    public void drchart(String s)
    {
        System.out.println("\t~*~*~ Reservation Chart ~*~*~");
        System.out.println("==================================================================");
        System.out.println("Train name : " + s);
        System.out.println("==================================================================");
        System.out.println();
        System.out.println("AC First class");
        System.out.println("*******************************************************************");
        if(np[0] > 0 )
        {
            for(int i = 0; i < np[0]; i++)
            {
                if(Aage1[i] == 0)
                break;
                else
                {
                    if( i == 0 )
                    System.out.println("Ps No\tName\t\tGender\tAge");
                    System.out.println((i+1)+"\t"+Anam1[i]+"\t"+Agen1[i]+"\t"+Aage1[i]);
                }
            }
        }
        else
        System.out.println();
        System.out.println("AC Two-tire");
        System.out.println("*******************************************************************");
        if(np[1] > 0)
        {
            for(int i = 0; i < np[1]; i++)
            {
                if(Aage2[i] == 0)
                break;
                else
                {
                    if( i == 0 )
                    System.out.println("Ps No\tName\t\tGender\tAge");
                    System.out.println((i+1)+"\t"+Anam2[i]+"\t"+Agen2[i]+"\t"+Aage2[i]);
                }
            }
        }
        else
        System.out.println();
        System.out.println("AC Three-tire");
        System.out.println("*******************************************************************");
        if(np[2] > 0)
        {
            for(int i = 0; i < np[2]; i++)
            {
                if(Aage3[i] == 0)
                break;
                else
                {
                    if( i == 0 )
                    System.out.println("Ps No\tName\t\tGender\tAge");
                    System.out.println((i+1)+"\t"+Anam3[i]+"\t"+Agen3[i]+"\t"+Aage3[i]);
                }
            }
        }
        else
        System.out.println();
        System.out.println("Sleeper class");
        System.out.println("*******************************************************************");
        if(np[3] > 0)
        {
            for(int i = 0; i < np[3]; i++)
            {
                if(Aages[i] == 0)
                break;
                else
                {
                    if( i == 0 )
                    System.out.println("Ps No\tName\t\tGender\tAge");
                    System.out.println((i+1)+"\t"+Anams[i]+"\t"+Agens[i]+"\t"+Aages[i]);
                }
            }
        }
        else
        System.out.println();
    }
    public void cticket()
    {
        int b = 0, z = 0,v = 0;
        System.out.print("Enter passenger's name : ");
        String na = sc.next();
        na += sc.nextLine();
        System.out.print("Enter his/her age : ");
        int age = sc.nextInt();
        System.out.print("Enter his/her gender : ");
        char g = sc.next().charAt(0);
        System.out.println("1. AC First class");
        System.out.println("2. AC Two-tire");
        System.out.println("3. AC Three-tire");
        System.out.println("4. Sleeper class");
        System.out.print("Please choose his/her coach : ");
        int coach = sc.nextInt();
        if(coach < 5)
        {
            //AC First class
            if(coach == 1)
            {
                for(int i = 0; i < np[0]; i++)
                {    
                    if((na.equalsIgnoreCase(Anam1[i])) && (age == Aage1[i]) && (g == Agen1[i]))
                    {
                        b--;z++;
                        se[0] += 1;
                        v = np[0] - 1;
                        p[0] -= 1;
                        System.out.println("Your ticket successfully canceled.");
                        System.out.println("Money refunded : Rs " +amt1[i]);
                    }
                    else
                    {
                        Anam1[b] = Anam1[i];
                        Agen1[b] = Agen1[i];
                        Aage1[b] = Aage1[i];
                        if(i == (np[0]-1) && z > 0)
                        Aage1[i] = 0;
                    }
                    b++;
                }
                if(z > 0)
                np[0] = v;
            }
            //AC Two-tire
            else if(coach == 2)
            {
                for(int i = 0; i < np[1]; i++)
                { 
                    if((na.equalsIgnoreCase(Anam2[i])) && (age == Aage2[i]) && (g == Agen2[i]))
                    {
                        b--;z++;
                        se[1] += 1;
                        v = np[1] - 1;
                        p[1] -= 1;
                        System.out.println("Your ticket successfully canceled.");
                        System.out.println("Money refunded : Rs " +amt2[i]);
                    }
                    else
                    {
                        Anam2[b] = Anam2[i];
                        Agen2[b] = Agen2[i];
                        Aage2[b] = Aage2[i];
                        if(i == (np[1]-1) && z > 0)
                        Aage2[i] = 0;
                    }
                    b++;
                }
                if(z > 0)
                np[1] = v;
            }
            //AC Three-tire
            else if(coach == 3)
            {
                for(int i = 0; i < np[2]; i++)
                { 
                    if((na.equalsIgnoreCase(Anam3[i])) && (age == Aage3[i]) && (g == Agen3[i]))
                    {   
                        b--;z++;
                        se[2] += 1;
                        v = np[2] - 1;
                        p[2] -= 1;
                        System.out.println("Your ticket successfully canceled.");
                        System.out.println("Money refunded : Rs " +amt3[i]);
                    }
                    else
                    {
                        Anam3[b] = Anam3[i];
                        Agen3[b] = Agen3[i];
                        Aage3[b] = Aage3[i];
                        if(i == (np[2]-1) && z > 0)
                        Aage3[i] = 0;
                    }
                    b++;
                }
                if(z > 0)
                np[2] = v;
            }
            //Sleeper class
            else
            {
                for(int i = 0; i < np[3]; i++)
                { 
                    if((na.equalsIgnoreCase(Anams[i])) && (age == Aages[i]) && (g == Agens[i]))
                    {
                        b--;z++;
                        se[3] += 1;
                        v = np[3] - 1;
                        p[3] -= 1;
                        System.out.println("Your ticket successfully canceled.");
                        System.out.println("Money refunded : Rs " +amts[i]);
                    }
                    else
                    {
                        Anams[b] = Anams[i];
                        Agens[b] = Agens[i];
                        Aages[b] = Aages[i];
                        if(i == (np[3]-1) && z > 0)
                        Aages[i] = 0;
                    }
                    b++;
                }
                if(z > 0)
                np[3] = v;
            }
            if(z == 0)
            {
                System.out.println("The provided data did not match in this coach.");
                System.out.println("Sorry!! No ticket canceled.");
            }
        }
        else
        System.out.println("Wrong choice!!");
    }
    public void saviability(String s)
    {
        System.out.println("==================================================================");
        System.out.println("Train name : " + s);
        System.out.println("==================================================================");
        System.out.println("Seat aviability for : ");
        System.out.println("AC First class : " + se[0]);
        System.out.println("AC Two-tire    : " + se[1]);
        System.out.println("AC Three-tire  : " + se[2]);
        System.out.println("Sleeper class  : " + se[3]);
    }
}