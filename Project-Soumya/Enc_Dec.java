class Enc_Dec
{
    protected String encrypt(String n)
    {
        String t = "";
        int i = -1;
        while(n.length() > ++i)
            t += n.charAt(i)+9;
        return t;
    }
    protected String decrypt(String n)
    {
        int i = 0, w;
        String t = "";
        while(i+2 <= n.length())
        {
            if((w = Integer.valueOf(n.substring(i,i+2))-9) >= 32 && w <= 99)
            {
                t += (char)w+"";    i += 2;
            }
            else
            {
                t += (char)(Integer.valueOf(n.substring(i,i+3))-9)+"";      i += 3;
            }
        }
        return t;
    }
}