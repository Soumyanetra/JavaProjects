import java.io.*;
import java.util.*;
class Wish extends Centre 
{
    protected void wish()throws IOException
    {
        GregorianCalendar date = new GregorianCalendar();
        String yr = Integer.toString(date.get(Calendar.YEAR));
        String s = (date.get(Calendar.AM_PM) == 0)?"AM":"PM";
        int h = (date.get(Calendar.HOUR) > 12)?(date.get(Calendar.HOUR)-12):(date.get(Calendar.HOUR) == 0)?12:date.get(Calendar.HOUR);
        if(s.equals("AM"))
            new Delay("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t W I S H \tY O U\t   A\tV E R Y\t\tG O O D\t\tM O R N I N G !!\n\n\t\t\t\t\t       Respected Quiz Master, "+qm+" & to one & all present here in '"+nm+" Quiz' ("+yr+" - "+(Integer.valueOf(yr)+1)%2000+")","7s");
        else
        {
            if(h < 4)
                new Delay("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t W I S H \tY O U\t   A\tV E R Y\t\tG O O D\t\tA F T E R N O O N !!\n\n\t\t\t\t\t       Respected Quiz Master, "+qm+" & to one & all present here in '"+nm+" Quiz' ("+yr+" - "+(Integer.valueOf(yr)+1)%2000+")","7s");
            else
                new Delay("\f\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t W I S H \tY O U\t   A\tV E R Y\t\tG O O D\t\tE V E N I N G   !!\n\n\t\t\t\t\t       Respected Quiz Master, "+qm+" & to one & all present here in '"+nm+" Quiz' ("+yr+" - "+(Integer.valueOf(yr)+1)%2000+")","7s");
        }
    }
}