class Rank extends Centre
{
    void rank()
    {
        int i = 0;
        while(++i < ga.countnode())
        {
            Group temp = ga.header1;
            int j = 0;
            while(j++ < ga.countnode()-i)
            {
                if(temp.score < temp.link.score)
                {
                    int t = temp.score;
                    temp.score = temp.link.score;
                    temp.link.score = t;
                    String tm = temp.gn;
                    temp.gn = temp.link.gn;
                    temp.link.gn = tm;
                }
                temp = temp.link;
            }
        }
    }
}