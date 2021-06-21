class Fill
{
    static int r;
    public static void main()
    {
        PUZZLE p = new PUZZLE();
        Fill z = new Fill();
        String ar[][] = new String[9][9];
        int arr[][] = new int[9][9];
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9;)
            {
                boolean b = z.check(arr, i, j);
                //System.out.println("\nb = "+b+"\n");
                if(b == true)
                {
                    arr[i][j] = r;
                    j++;
                }
                //for(int v = 0; v < arr[0].length; v++)
                //{
                    //for(int s = 0; s < arr[1].length; s++)
                    //{
                       // if(s == 0)
                       // System.out.print("\t|\t"+arr[v][s]+"\t|");
                       // else
                   // /   // System.out.print("\t"+arr[v][s]+"\t|");
                    //}
                   // System.out.println("\n");
                //}
                //System.out.println("\n");
            }
        }
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            ar[i][j] = Integer.toString(arr[i][j]);
        }
        //p.display(ar,"SOUMYA");
    }
    public boolean check(int arr[][], int i, int j)
    {
        int a = i, b = j, c = 0, h = 0, k = 0, x, y, m, n, p = 0;
        r = (int)((Math.random()*9)+1);
        if(a == 1 || a == 4 || a == 7)
        h = i-1;
        else if(a == 2 || a == 5 || a == 8)
        h = i-2;
        if(b == 1 || b == 4 || b == 7)
        k = j-1;
        else if(b == 2 || b == 5 || b == 8)
        k = j-2;
        m = h; n = k;
        x = h+3; y = k+3;
        outer:
        for(; h < x; h++)
        {
            for(k = n; k < y; k++)
            {
                //System.out.println("h = "+h+" k = "+k+" r = "+r);
                if(arr[h][k] == r)
                break outer;
            }
        }
        if(h == x)
        c++;
        h  = 0;
        if(c == 1)
        {
            for(h = 0; h < 9; h++)
            {
                //System.out.println("h = "+h+" p = "+p+" a = "+a+" b = "+b+" r = "+r);
                if(arr[p][b] == r || arr[a][p++] == r)
                break;
            }
        }
        if(h == 9)
            return(true);
            else
            return(false);
    }
}