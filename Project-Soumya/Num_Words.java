import java.util.*;
class Num_Words
{
    private static long n;
    private static int arr[];
    private String Single[] = {"","one","two","three","four","five","six","seven","eight","nine"};
    private String Double[] = {"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private String Tens[]   = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    Num_Words(){}
    Num_Words(int l)
    {   arr = new int[l];   }
    public static void main()
    {
        Scanner sc = new Scanner(System.in); 
        String g;
        do
        {
            System.out.print("\fEnter a number ≤ 1000000000: ");
            if((g = new Num_Words().check(sc.nextLine().trim())).equals("F") == false)
                if((n = Long.valueOf(g)) <= 1000000000)
                    break;
            continue;
        }
        while(true);
        new Num_Words(Integer.toString((int)n).length());
        System.out.print("\f"+n+" IN WORDS: "+new Num_Words().change(new Num_Words().determine()).trim()+".\n\nDo you want to enter another number? (Y/N): ");
        if(sc.next().toUpperCase().charAt(0) == 'Y')
            new Num_Words().main();
    }
    String determine()
    {
        int i = arr.length-1, m = (int)n;
        while(m > 0)
        {
            arr[i--] = m%10;
            m /= 10;
        }
        i = arr.length-1-i;
        if(i == 10)
            return "One hundred crore";
        if(i == 9)
        {
            if(arr[arr.length-9] == 1)
                return Double[arr[arr.length-8]]+" crore "+lakh()+thousand()+hundreds()+tens();
            else
                return Tens[arr[arr.length-9]-2]+" "+Single[arr[arr.length-8]]+" crore "+lakh()+thousand()+hundreds()+tens();
        }
        else if(i == 8)
                return Single[arr[arr.length-8]]+" "+Single[arr[arr.length-8]]+" crore "+lakh()+thousand()+hundreds()+tens();
        else if(i == 7 || i == 6)
                return lakh()+thousand()+hundreds()+tens();
        else if(i == 5 || i == 4)
                 return thousand()+hundreds()+tens();
        else if(i == 3)
            return hundreds()+tens();
        else if(i == 2)
            return tens();
        else if(n != 0)
            return Single[arr[arr.length-1]];
        return "Zero";
    }
    String lakh()
    {
        if(arr.length > 6 && arr[arr.length-7] == 1)
            return Double[arr[arr.length-6]]+" lakh ";
        else if(arr.length > 7 && arr[arr.length-7] != 0)
            return Tens[arr[arr.length-7]-2]+" "+Single[arr[arr.length-6]]+" lakh ";
        else if (arr[arr.length-6] != 0)
            return Single[arr[arr.length-6]]+" lakh ";
        return "";
    }
    String thousand()
    {
        if(arr.length > 4 && arr[arr.length-5] == 1)
            return Double[arr[arr.length-4]]+" thousand ";
        else if(arr.length > 4 && arr[arr.length-5] != 0)
            return Tens[arr[arr.length-5]-2]+" "+Single[arr[arr.length-4]]+" thousand ";
        else if(arr[arr.length-4] != 0)
            return Single[arr[arr.length-4]]+" thousand ";
        return "";
    }
    String hundreds()
    {
        if(arr[arr.length-3] != 0)
            return Single[arr[arr.length-3]]+" hundred ";
        return "";
    }
    String tens()
    {
        if(arr[arr.length-2] == 0)
            return Single[arr[arr.length-1]];
        else if(arr[arr.length-2] == 1)
            return Double[arr[arr.length-1]];
        else
            return Tens[arr[arr.length-2]-2]+" "+Single[arr[arr.length-1]];
    }
    String check(String g)
    {
        int x = 0;
        while(x < g.length())
        {
            if(g.charAt(x++) < '0' || g.charAt(x-1) > '9')
            return "F";
        }
        return Long.toString(Long.valueOf(g));
    }
    String change(String w)
    {
        return Character.toUpperCase(w.charAt(0))+w.substring(1);
    }
}