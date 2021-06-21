import java.util.*;
import java.io.*;
class Calculator
{
    double r,n,c;
    Scanner sc = new Scanner(System.in);
    PrintWriter Pr = new PrintWriter(System.out,true);
    public static void display()
    {
        Calculator ob = new Calculator();
        ob.choice();
    }
    public void choice()
    {
        do
        {
            r = 0;c = 0;
            do
            {
                Pr.println("1. Want to 'Add'.");
                Pr.println("2. Want to 'Substract'.");
                Pr.println("3. Want to 'Multiply'.");
                Pr.println("4. Want to 'Divide'.");
                Pr.println("5. Want to 'Square' a number.");
                Pr.println("6. Want to 'Cube' a number.");
                Pr.println("7. Want to 'Square root' a number.");
                Pr.println("8. Want to find 'Percentege'.");
                System.out.print("Enter your choice : ");
                switch((int)sc.nextDouble())
                {
                    case 1: accept();
                    add();
                    break;
                    case 2: accept();
                    subtract();
                    break;
                    case 3: accept();
                    multiply();
                    break;
                    case 4: accept();
                    divide();
                    break;
                    case 5:
                    square();
                    break;
                    case 6:
                    cube();
                    break;
                    case 7:
                    sqrt();
                    break;
                    case 8:
                    per();
                    break;
                    default:
                    c = 2;
                    Pr.println("WRONG CHOICE!!");
                }
                if(c == 2)
                break;
                System.out.print("Do you want to calculate with previous result(Y/N) : ");
            }
            while(sc.next().toUpperCase().charAt(0) == 'Y');
            System.out.print("Do you want to quit(Y/N): ");
        }
        while(sc.next().toUpperCase().charAt(0) == 'N');
    }
    public void accept()
    {
        System.out.print("Enter number : ");
        n = sc.nextDouble();
        if(c == 0)
        {
            c++;
            r = n;
            System.out.print("Enter number : ");
            n = sc.nextDouble();
        }
    }
    public void add()
    {
        r += n;
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void subtract()
    {
        r -= n;
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void multiply()
    {
        r *= n;
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void divide()
    {
        r /= n;
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void square()
    {
        if(c == 0)
        {   c = 1;
            accept();
            r = Math.pow(n,2);
        }
        else
            r = Math.pow(r,2);
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void cube()
    {
        if(c == 0)
        {   c = 1;
            accept();
            r = Math.pow(n,3);
        }
        else
            r = Math.pow(r,3);
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void sqrt()
    {
        if(c == 0)
        {
            c = 1;
            accept();
            r = Math.sqrt(n);
        }
        else
            r = Math.sqrt(r);
        Pr.println("======================================\nResult : "+r+"\n======================================");
    }
    public void per()
    {
        if(c == 0)
        {
            c = 1;
            accept();
            System.out.print("Enter Total : ");
            r = n/sc.nextDouble()*100;
        }
        else
        {
            System.out.print("Enter Total : ");
            r = r/sc.nextDouble()*100;
        }
        Pr.println("======================================\nResult : "+r+"%\n======================================");
    }
}