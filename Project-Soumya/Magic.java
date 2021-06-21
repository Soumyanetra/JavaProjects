import java.io.*;
class Magic
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out,true);
    String n; int c, s = 0, ct = 0,r;
    public static void main()throws IOException
    {
        Magic ob = new Magic();
        ob.choice();
        ob.display();
    }
    public void choice()throws IOException
    {
        System.out.print("Enter your full name : ");
        n = br.readLine();
        pw.println("\fPlease choose a number from 1-10 in your mind.");
        System.out.print("1. Display your answer\n2. Display the number you thought\nPlease enter your choice : ");
        switch((int)(Double.parseDouble(br.readLine())))
        {
            case 1: Answer();
            break;
            case 2: Number();
            break;
            default:
            pw.println("WRONG CHOICE!!");
        }
    }
    public void Answer()throws IOException
    {
        int x = (int)((Math.random()*2)+2);
        for(int i = 1; i <= 10; i++)
        {
            int y = (int)((Math.random()*10)+1)*6;
            if(i == 1 ||i == 3 || i == 6)
            {
                if(i == 1)
                pw.println("Please add "+y+" with the number.\nPress any charecter when calculation is complete.");
                else
                pw.println("Please add "+y+" with the result.\nPress any charecter when calculation is complete.");
                br.readLine();
                s += y;
            }
            else if(i == 10)
            {
                
                pw.println("Please add "+y/6+" with the result.\nPress any charecter when calculation is complete.");
                br.readLine();
                s += y/6;
            }
            else if(i == 2)
            {
                s *= x;
                pw.println("Please multiply the result with "+x+".\nPress any charecter when calculation is complete.");
                br.readLine();
            }
            else if(i == 5)
            {
                if(x == 3)
                x -= 1;
                else 
                x += 1;
                s *= x;
                pw.println("Please multiply the result with "+x+".\nPress any charecter when calculation is complete.");
                br.readLine();
            }
            else if(i == 4)
            {
                pw.println("Please Subtract "+y+" from the result.\nPress any charecter when calculation is complete.");
                br.readLine();
                s -= y;
            }
            else if(i == 7)
            {
                s /= 6;
                pw.println("Please divide the result with 6.\nPress any charecter when calculation is complete.");
                br.readLine();
            }
            else if(i == 8)
            {
                if(ct == 0)
                {
                    pw.println("Please Subtract the number you initially thought of, from the result.\nPress any charecter when calculation is complete.");
                    br.readLine();
                }
                else
                {
                    pw.println("Please subtract "+y/6+" from the result.\nPress any charecter when calculation is complete.");
                    br.readLine();
                    s -= y/6;
                }
            }
            else
            {
                pw.println("Please subtract "+y/6+" from the result.\nPress any charecter when calculation is complete.");
                br.readLine();
                s -= y/6;
            }
        }
    }
    public void Number()throws IOException
    {
        ct = 1;
        Answer();
        System.out.print("Please enter your calculated result : ");
    }
    public void display()throws IOException
    {
        if(ct == 0)
        pw.println("Mr./Mrs."+n+"\nThe result : " +s+".\nIsn't it?(Y/N)");
        else
        pw.println("Mr./Mrs."+n+"\nThe number : " +(r= Integer.parseInt(br.readLine()) - s)+".\nIsn't it?(Y/N)");
        System.out.print("Please enter your answer honestly : ");
        char c = br.readLine().toUpperCase().charAt(0);
        if(c == 'Y')
        pw.println("Magic successful. Thank you.");
        else
        pw.println("I am sorry!!!\nIt shouldn't be so!!!!!\nI request you, dear "+n+", to please try again.\nI will be higly obliged if you do so for my shake.\nPlease....");
    }
}