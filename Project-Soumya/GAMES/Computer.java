package GAMES;
class Computer extends Crisscross
{
    public void computer()
    { 
        int t = 1; v = 5;
        if(vic == 0)
        {
                if((ar[0] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[0][i] != 'O' && cc[0][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[0][i]));
                            break;
                        }
                    }
                }
                if((ar[1] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[1][i] != 'O' && cc[1][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[1][i]));
                            break;
                        }
                    }
                }
                if((ar[2] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[2][i] != 'O' && cc[2][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[2][i]));
                            break;
                        }
                    }
                }
                if((ar[3] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][0] != 'O' && cc[i][0] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][0]));
                            break;
                        }
                    }
                }
                if((ar[4] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][1] != 'O' && cc[i][1] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][1]));
                            break;
                        }
                    }
                }
                if((ar[5] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][2] != 'O' && cc[i][2] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][2]));
                            break;
                        }
                    }
                }
                if((ar[6] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][2-i] != 'O' && cc[i][2-i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][2-i]));
                            break;
                        }
                    }
                }
                if((ar[7] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][i] != 'O' && cc[i][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][i]));
                            break;
                        }
                    }
                }
                if((ur[0] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[0][i] != 'O' && cc[0][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[0][i]));
                            break;
                        }
                    }
                }
                if((ur[1] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[1][i] != 'O' && cc[1][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[1][i]));
                            break;
                        }
                    }
                }
                if((ur[2] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[2][i] != 'O' && cc[2][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[2][i]));
                            break;
                        }
                    }
                }
                if((ur[3] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][0] != 'O' && cc[i][0] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][0]));
                            break;
                        }
                    }
                }
                if((ur[4] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][1] != 'O' && cc[i][1] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][1]));
                            break;
                        }
                    }
                }
                if((ur[5] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][2] != 'O' && cc[i][2] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][2]));
                            break;
                        }
                    }
                }
                if((ur[6] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][2-i] != 'O' && cc[i][2-i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][2-i]));
                            break;
                        }
                    }
                }
                if((ur[7] == 2) && (v == 5))
                {
                    for(int i = 0; i < 3; i++)
                    {
                        if(cc[i][i] != 'O' && cc[i][i] != 'X')
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[i][i]));
                            break;
                        }
                    }
                }
                if((cc[0][0] == u || cc[0][2] == u || cc[2][0] == u || cc[2][2] == u)  && (v == 5))
                {
                    if((cc[0][0] == d || cc[0][2] == d || cc[2][0] == d || cc[2][2] == d)  && (v == 5))
                        cone();
                    else
                    {
                        if((cc[1][1] != 'O' || cc[1][1] == 'X') && (v == 5))
                        {
                            v = 1;
                            System.out.println("My call : "+(c = cc[1][1]));
                        }
                        else
                            cone();
                    }
                }
                if((cc[0][0] != u && cc[0][2] != u && cc[2][0] != u && cc[2][2] != u) && (v == 5))
                    cone();
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if(c == cc[i][j])
                    {
                        cc[i][j] = d;
                        i = 4;
                        break;
                    }
                }
            }
            judge();
            hum();
        }
    }
    public void cone()
    {
        if(cc[2][0] != 'O' && cc[2][0] != 'X'&& v == 5)
        {
            System.out.println("My call : " +(c = cc[2][0]));
            v = 1;
        }
        if(cc[2][0] == d && cc[1][1] == u && (cc[0][2] != u && cc[0][2] != d) && v == 5)
        {
            System.out.println("My call : " +(c = cc[0][2]));
            v = 1;
        }
        if(cc[0][0] != 'O' && cc[0][0] != 'X' && cc[1][0] != u && v == 5)
        {
            System.out.println("My call : " +(c = cc[0][0]));
            v = 1;
        }
        if(cc[0][2] != 'O' && cc[0][2] != 'X'&& v == 5)
        {
            v = 1;
            System.out.println("My call : " +(c = cc[0][2]));
        }
        if(cc[2][2] != 'O' && cc[2][2] != 'X'&& v == 5)
        {
            System.out.println("My call : " +(c = cc[2][2]));
            v = 1;
        }
    }
}