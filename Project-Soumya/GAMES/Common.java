package GAMES;  
import java.util.*;
import java.io.*;
class Common
{
    protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected static Scanner sc = new Scanner(System.in);
    protected static Selections sl = new Selections();
    protected static QuickMatch qm = new QuickMatch();
    protected static Tournament tt = new Tournament();
    protected static Situation st = new Situation();
    protected static Style sy = new Style();
    protected static String Members[][] = {{"Rohit Sharma","Shikhar Dhawan","Virat Kohli","Yuvraj Singh","Ajinkya Rahane","Mahendra Singh Dhoni","Kedar Jadhav","Hardik Pandya","Ravindra Jadeja","Mohammed Shami","Bhuvneshwar Kumar","Jasprit Bumrah","Ravichandran Ashwin","Umesh Yadav","Dinesh Karthik"}, //India
                                          {"Azhar Ali","Babar Azam","Fakhar Zaman","Ahmed Shehzad","Haris Sohail","Shoaib Malik","Imad Wasim","Mohammad Hafeez","Fahim Ashraf","Sarfraz Ahmed","Shadab Khan","Wahab Riaz","Mohammed Aamer","Hasan Ali","Junaid Khan"}, //Pakistan
                                          {"Hashim Amla","Quinton de Kock","A B de Villiers","Faf du Plessis","Jean Paul Duminy","David Miller","Chris Morris","Wane Parnell","Andile Phehlukwayo","Kagiso Rabada","Imran Tahir","Dwaine Pretorius","Keshav Maharaj","Farhaan Behardien","Morne Morkel"}, //South Africa
                                          {"Upul Tharanga","Chamara Kapugedera","Kusal Mendis","Kusal Perera","Angelo Mathews","Asela Gunaratne","Thisara Perera","Niroshan Dickwella","Dinesh Chandimal","Laksha Sandakan","Seekkuge Prasanna","Lasith Malinga","Nuwan Kulasekara","Nuwan Pradeep","Suranga Lakmal"}, //Sri Lanka
                                          {"David Warner","Aaron Finch","Chris Lynn","Steve Smith","John Hastings","Josh Hazlewood","Travis Head","Moises Henriques","Glenn Maxwell","James Pattinson","Mitchell Starc","Marcus Stoinis","Pat Cummins","Mathew Wade","Adam Zampa"}, //Australia
                                          {"Tamim Iqbal","Soumya Sarkar","Imrul Kayes","Shakib-al Hasan","Sabbir Rahman","Mahmudullah","Mosaddek Hossain Saikat","Mushfiqur Rahim","Sunzamul Islam","Mehedi Hasan","Mashrafe Mortaza","Mustafizur Rahman","Rubel Hossain","Taskin Ahmed","Shafiul Islam"}, //Bangladesh
                                          {"Eoin Morgan","Moeen Ali","Jonny Bairstow","Jake Ball","Sam Billings","Jos Buttler","Alex Hales","Liam Plunkett","Adil Rashid","Joe Root","Jason Roy","Ben Stokes","David Willey","Chris Woakes","Mark Wood"}, //England
                                          {"Martin Guptill","Kane Williamson","Ross Taylor","Neil Broom","Corey Anderson","Jamesh Neesham","Colin de Grandhomme","Tom Latham","Luke Ronchi","Mitchell Santner","Jeetan Patel","Trent Boult","Mitchell McClenaghan","Adam Milne","Tim Southee"}}; //New Zealand
    protected static String Rank[][] = {{"0","1,4","2c","3","5","6,7","8","12","11","10,13","9"}, //India
                                        {"0","2,3","1","7","5","9c","6","10","12","13","11,14"}, //Pakistan
                                        {"1","0","3","2c","5","4","7","6","9","10,14","11,13"}, //South Africa
                                        {"7","0","2","8","1","4c","5,6","10","14","11","12,13"}, //Sri Lanka
                                        {"0","1,2","3c","7","5,6","13","8","9","11,12","10","14"}, //Australia
                                        {"0","1","2","7","3","4","5","10c","9,14","12","11"}, //Bangladesh
                                        {"10","6","9","0c","11","5","1,2","8","7","12,14","3"}, //England
                                        {"0","8","1c","2","3","5","4","9,12","13","14","11"}}; //New Zealand
    protected static String Team[] = {"India (IND)","Pakistan (PAK)","South Africa (SA)","Srilanka (SRL)","Australia (AUS)","Bangladesh (BAN)","England (ENG)","New Zealand (NZL)"};
    protected static String Squad[][] = new String[2][11];
    protected static int Score[][] = new int[2][11];
    protected static int t1 = 0, t2 = 0;
}