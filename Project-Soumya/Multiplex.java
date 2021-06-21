import java.util.*;
class Multiplex
{
    Scanner sc = new Scanner(System.in);
    String cinema[] = new String[35];//To store the names of cinemas
    String fd[] = new String[10];//To store names of food
    double cost[] = {250, 200, 90, 50, 50, 150, 170, 20, 45, 140, 15, 20};
    String city[] = {"Kolkata", "Delhi", "Mumbai","Hyderabad", "Chennai", "Guwahati", "Pune"};
    String name[] = new String[150];
    String day[] = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    String date[] ={"06/11/2015", "07/11/2015", "08/11/2015", "09/11/2015", "10/11/2015", "11/11/2015", "12/11/2015"};
    char cat[] = new char[150];
    char c;int n = 0;double amt = 0;
    public static void main()
    {
        Multiplex ob = new Multiplex();
        ob.start();
    }
    public void start()
    {
        cinema[0] = "Chak de India";    cinema[10] = "Char";                cinema[20] = "Titanic";
        cinema[1] = "3 - Idiots";       cinema[11] = "Chhadmabeshi";        cinema[21] = "Speed";
        cinema[2] = "Taare Zameen Par"; cinema[12] = "Deya Neya";           cinema[22] = "Captain America";
        cinema[3] = "PK";               cinema[13] = "O go Badhu Sundari";  cinema[23] = "Rise of the planet of the apes";
        cinema[4] = "2 States";         cinema[14] = "Aalo";                cinema[24] = "King-Kong";
        cinema[5] = "My Name is Khan";  cinema[15] = "Mishor Rahasya";      cinema[25] = "Rio";
        cinema[6] = "Abhiman";          cinema[16] = "Pothe Holo Deri";     cinema[26] = "Spider-man - 1";
        cinema[7] = "Kick";             cinema[17] = "Badshahi Ankti";      cinema[27] = "Spider-man - 2";
        cinema[8] = "Anand";            cinema[18] = "Chiriakhana";         cinema[28] = "Spider-man - 3";
        cinema[9] = "Piku";             cinema[19] = "Proloy";              cinema[29] = "Amazing Spiderman";
        fd[0] = "Chow-min        ";     fd[5] = "Biscuit         ";         cinema[30] = "Interstellar";
        fd[1] = "Pizza           ";     fd[6] = "Sandwitch       ";         cinema[31] = "Martina";
        fd[2] = "Burger          ";     fd[7] = "Thali           ";         cinema[32] = "";
        fd[3] = "Biryani - Chicken";    fd[8] = "Pakora - Chicken";         cinema[33] = "";
        fd[4] = "Biryani - Mutton";     fd[9] = "Pakora - Mutton ";         cinema[34] = "";
        System.out.println("\tWelcome to ZODIAC Multiplex");
        for(int i = 0; i < city.length; i++)
            System.out.println(city[i].toUpperCase().charAt(0)+". "+city[i]);
        System.out.print("Please choose your convinient city : ");
        c = sc.next().toUpperCase().charAt(0);
        for(int i = 0; i < city.length; i++)
            if(c == city[i].toUpperCase().charAt(0))
            {
                System.out.println("\tWelcome to "+city[i]+"'s ZODIAC Multiplex");
                n++;
                break;
            }
        if(n > 0)
        {
            do
            {
                System.out.println("1. Want to watch Film.");
                System.out.println("2. Want to visit to food counter.");
                System.out.print("Please enter your choice : ");
                n = sc.nextInt();
                switch(n)
                {
                    case 1:
                    film();
                    break;
                    case 2:
                    food();
                    break;
                    default:
                    System.out.println("WRONG CHOICE");
                }
                System.out.print("Do you want to return to main menu(Y/N) : ");
                c = sc.next().toUpperCase().charAt(0);
                if(c == 'N')
                System.out.println("\tYour Pleasure     Our Comfort\n\t\t  Thank You\n\t\tVisit   Again");
            }
            while(c == 'Y');
        }
    }
    public void film()
    {
        int k = 1, ch = 0,x;
        char l,q;
        String lan = "";
        System.out.print("Enter your name : " );
        String na = sc.next();
        na += sc.nextLine();
        do
        {
            System.out.println("B. Bengali");
            System.out.println("E. English");
            System.out.println("H. Hindi");
            System.out.print("Enter the language of film you want to watch : " );
            l = sc.next().toUpperCase().charAt(0);
            if(l == 'B')
            {
                lan = "Bengali";
                for(int i = 10; i < 20; i++)
                {
                    System.out.println(k+". "+cinema[i]);
                    k++;
                }
            }
            else if(l == 'E')
            {
                lan = "English";
                for(int i = 20; i < 30; i++)
                {
                    System.out.println(k+". "+cinema[i]);
                    k++;
                }
            }
            else if(l == 'H')
            {
                lan = "Hindi";
                for(int i = 0; i < 10; i++)
                {
                    System.out.println(k+". "+cinema[i]);
                    k++;
                }
            }
            if(k == 1)
            System.out.println("Wrong Choice!! Select Again");
            else
            {
                System.out.print("Please select the film you want to watch : ");
                ch = sc.nextInt();
                if(ch > 10)
                k = 1;
                if(l == 'B')
                ch += 10;
                else if(l == 'E')
                ch += 20;
            }
        }
        while(k == 1);
        do
        {
            k = 1;
            for(int i = 0; i < 7; i++)
                System.out.println((i+1)+". "+day[i]+" - "+date[i]);
            System.out.print("Enter your convinient date : ");
            x = sc.nextInt();
            if(x > 7)
            {
                System.out.println("Wrong Choice!! Select Again");
                k = 0;
            }
        }
        while(k == 0);
        do
        {
            k = 1;
            System.out.println("M. Morning show (07:00 - 10:00)");
            System.out.println("D. Noon show    (10:30 - 13:00)");
            System.out.println("E. Evening show (16:00 - 19:00)");
            System.out.println("N. Nigth show   (19:30 - 22:30)");
            System.out.print("Choose your convinient category : ");
            q = sc.next().toUpperCase().charAt(0);
            if(q != 'M' && q != 'N' && q != 'E'&& q != 'D')
            {
                System.out.println("Wrong Choice!! Select Again");
                k = 0;
            }
        }
        while(k == 0);
        do
        {
            k = 1;
            System.out.println("C. Classic (Rs 200)");
            System.out.println("D. Deluxe  (Rs 250)");
            System.out.print("Choose your convinient category : ");
            c = sc.next().toUpperCase().charAt(0);
            if(c != 'C' && c != 'D')
            {
                System.out.println("Wrong Choice!! Select Again");
                k = 0;
            }
        }
        while(k == 0);
        System.out.print("Enter number of viewers : ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter name "+(i+1)+": " );
            name[i] = sc.next();
            name[i] += sc.nextLine();
            cat[i] = c;
        }
        System.out.println("Please collect your bill.");
        System.out.println("===================================================");
        System.out.println("\t~*~*~*~*~*Cinema Ticket*~*~*~*~*~");
        System.out.println("===================================================");
        System.out.println("Movie name : " +cinema[ch-1]+".");
        System.out.println("Language   : " + lan);
        if(c == 'C')
        {
            amt = n*cost[1];
            k = (int)(Math.random()*101);
            System.out.println("Category   : Classic");
        }
        else
        {
            amt = n*cost[0];
            k = (int)(Math.random()*51);
            System.out.println("Category   : Deluxe");
        }
        System.out.println("Date : "+date[x-1]+"(" + day[x-1]+")");
        if(q == 'M')
        System.out.println("Time : 07:00 - 10:00");
        else if(q == 'N')
        System.out.println("Time : 19:30 - 22:30");
        else if(q == 'E')
        System.out.println("Time : 16:00 - 19:00");
        else
        System.out.println("Time : 10:30 - 13:00");
        System.out.println("Name\t\tSeat no.");
        for(int i = 0; i < n; i++)
        System.out.println(name[i]+"\t  "+k++);
        System.out.println("Total : Rs " + amt+"0");
        System.out.println("Upcoming releases : ");
        k = 1;
        for(int i = 30; i < 35; i++)
        {
            System.out.println(k+". "+cinema[i]);
            k++;
        }
    }
    public void food()
    {
        System.out.print("Enter name of customer : ");
        String na = sc.next();
        na += sc.nextLine();
        String f[] = new String[100];
        double d[] = new double[100];
        int q[] = new int[100];
        int k;int j = -1,i, u = -1;
        amt = 0;
        do
        {
            j++;
            do
            {
                k = 0;
                System.out.println("\tFood Items");
                for(i = 0; i < fd.length; i++)
                    System.out.println((i+1)+"."+fd[i]+"\t\t(Rs "+cost[i+2]+"0)");
                System.out.print("Choose : " );
                n = sc.nextInt();
                if(n > fd.length)
                k = 1;
                else
                {
                    f[j] = fd[n-1];
                    d[j] = cost[n+1];
                }
            }
            while(k == 1);
            u++;
            System.out.print("Enter number of quantity : ");
            int z = sc.nextInt();
            amt += cost[n+1]*z;
            q[u] = z;
            System.out.print("Do you want to continue(Y/N) : ");
            c = sc.next().toUpperCase().charAt(0);
        }
        while(c == 'Y');
        System.out.println("===================================================");
        System.out.println("\t\tBill");
        System.out.println("===================================================");
        System.out.println("Customer Name : " + na);
        System.out.println("------------------------------------------------------------");
        System.out.println("Sl. no\t  Items Bought\t\tQuantity\tCost");
        System.out.println("      \t              \t\t        \t Rs ");
        System.out.println("------------------------------------------------------------");
        for(i = 0; i < j+1; i++)
        System.out.println((i+1)+". \t "+f[i]+"\t"+q[i]+"\t\t"+d[i]+"0");
        System.out.println("      \t\t\t\t    Total : Rs " + amt+"0");
    }
}