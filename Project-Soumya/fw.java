import java.util.*;
class fw
{
    void main(String w)
    {
        StringTokenizer st = new StringTokenizer(w);
        while(st.hasMoreTokens())
        {
            String s = st.nextToken();
            int l = s.length();
            for(int i = 0; i < l; i++)
            {
                char ch = s.charAt(i);
                System.out.println(s+" "+ch);
            }
        }
    }
}