import java.util.*;
class DT 
{ 
    protected String de = "", tm = "", yr;
    protected void d_t()
    { 
        GregorianCalendar date = new GregorianCalendar();
        String day, mon,  sec, min, hr, s;
        de = ""; tm = "";
        day = Integer.toString(date.get(Calendar.DAY_OF_MONTH));
        mon = Integer.toString(date.get(Calendar.MONTH)+1);
        yr  = Integer.toString(date.get(Calendar.YEAR));
        sec = Integer.toString(date.get(Calendar.SECOND));
        min = Integer.toString(date.get(Calendar.MINUTE));
        s = (date.get(Calendar.AM_PM) == 0)?"AM":"PM";
        int d = date.get(Calendar.DAY_OF_WEEK);
        hr   = Integer.toString((date.get(Calendar.HOUR) > 12)?(date.get(Calendar.HOUR)-12):(date.get(Calendar.HOUR) == 0)?12:date.get(Calendar.HOUR));
        String da = (d == 1)?"SUNDAY":(d == 2)?"MONDAY":(d == 3)?"TUESDAY":(d == 4)?"WEDNESSDAY":(d == 5)?"THURSDAY":(d == 6)?"FRIDAY":(d == 7)?"SATURDAY":"";
        de = ((day.length() < 2)?de+"0"+day+"/":de+day+"/")+((mon.length() < 2)?de+"0"+mon+"/":de+mon+"/")+yr+(" ("+da+")");
        tm = ((hr.length() < 2)?tm+"0"+hr+":":tm+hr+":")+((min.length() < 2)?tm+"0"+min+":":tm+min+":")+((sec.length() < 2)?tm+"0"+sec:tm+sec)+" "+s+" (IST)";
    }
}