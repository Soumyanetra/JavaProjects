import java.util.*;
class Mark_sheet
{
    public static void accept()
    {
        Scanner sc =new Scanner(System.in);
        int c = 0,sum = 0, temp = 0; char r = 'N';
        System.out.print("Enter number of students : ");
        int num[] = new int[sc.nextInt()+1];
        String na[] = new String[num.length];
        int c1 = num.length;
        System.out.print("Enter number of subjects : ");
        String su[] = new String[sc.nextInt()];
        for(int i = 0;  i < su.length; i++)
        {
            System.out.print("Enter subject : ");
            su[i] = sc.next()+sc.nextLine();
        }
        System.out.print("Enter full marks of a subject : ");
        int fm = su.length*sc.nextInt();
        System.out.print("Enter pass marks in each subject : ");
        int pa = sc.nextInt();
        for(int  i = 0; i < num.length-1; i++)
        {
            System.out.print("Enter name of a student : ");
            String s = sc.next()+sc.nextLine();
            for(int k = 0; k < su.length; k++)
            {
                System.out.print("Enter marks achived in " + su[k]+" : ");
                int a = sc.nextInt();
                sum += a;
                if( a < pa)
                    temp = 1;
            }
            if( temp == 0 )
            {
                na[c] = s;
                num[c] = sum;
                c++;
            }
            else
            {
                c1--;
                na[c1] = s;
                num[c1] = sum;
            }
                temp = 0; sum = 0;
        }
        if( c1 != num.length)
        {
            System.out.print("Do you want to see the list of students who failed(Y/N) : ");
            r = sc.next().toUpperCase().charAt(0);
        }
        System.out.println("\f===========================================================\nRank\tName\t\t\tGrand Total\n===========================================================");
        for(int k = 1; k < c; k++)
        {
            for(int i = 0; i < c-k; i++)
            {
                if(num[i] < num[i+1])
                {
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                    String s = na[i];
                    na[i] = na[i+1];
                    na[i+1] = s;
                }
            }
        }
        if(r == 'Y')
        {
            for(int k = 1; k < num.length; k++)
            {
                for(int i = c1; i < num.length-k; i++)
                {
                    if(num[i] < num[i+1])
                    {
                        temp = num[i];
                        num[i] = num[i+1];
                        num[i+1] = temp;
                        String s = na[i];
                        na[i] = na[i+1];
                        na[i+1] = s;
                    }
                }
            }
        }
        for(int i = 0; i < c; i++)
            System.out.println((i+1)+".\t"+na[i]+"\t\t"+num[i]+"/"+fm+"("+((int)(Math.round(num[i]*100/fm)))+"%)");
        if(r == 'Y')
        {
            System.out.println("\nStudents who failed in one or more subjects\n===========================================================");
            for(int i = c1; i < num.length; i++)
                System.out.println("  \t"+na[i]+"\t\t"+num[i]+"/"+fm+"("+((int)(Math.round(num[i]*100/fm)))+"%)");
        }
    }
}