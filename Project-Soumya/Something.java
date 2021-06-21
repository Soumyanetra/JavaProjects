import java.util.*;
class Something
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String n = sc.nextLine().trim();
        System.out.println("\fYour name is: "+n);
    }
}