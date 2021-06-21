package GAMES;
import java.io.*;
class Menu extends CH
{
    protected void singlep()throws IOException
    {
        try
        {
            new BufferedReader(new FileReader("GAMBLE RECORD.doc"));
        }
        catch(FileNotFoundException e)
        {
            new PrintWriter(new BufferedWriter(new FileWriter("GAMBLE RECORD.doc")));
        }
        do
        {
            System.out.print("\fEnter your Name : ");
            String n = sc.nextLine();
            System.out.print("Enter ID CODE : ");
            String id = sc.nextLine();
            rt.retrive();
            if(id.equalsIgnoreCase("NIDC") == false && sf.exists(n,Integer.valueOf(id)))
            {
                
                break;
            }
            else
            {
                System.out.println("\fDEAR "+n+",\nYOUR ID CODE : "+(r = (sf.countnode()+1))+"\nYOU ARE PROVIDER WITH Rs 500.00 only.\n");
                if(r == 1)
                    spec = sf.soft(n,r,500,0,' ',0,0);
                else
                    spec = sf.soft(n,r,500,0,' ',0,1);
                break;
            }
        }
        while(true);
        do
        {
            System.out.print("\f1. VISTI COUNTER\n2. TRY YOUR LUCK!!\n3. RETURN CHIPS TO COUNTER\n4. CHECK WALLET BALLANCE\n5. CHECK SAVINGS BALLANCE\n6. TRANSFER 'WALLET BALANCE' TO 'SAVINGS'\n7. VIEW PATTERN CHART\n8. EXIT\nENTER YOUR CHOICE : ");
            switch(sc.nextInt())
            {
                case 1: cu.counter(); break;
                case 2: pl.play(); break;
                case 3: cu.deposit(); break;
                case 4: System.out.println("Your present 'Wallet Balance'  : Rs "+spec.w+".00"); new Time("","5s"); break;
                case 5: System.out.println("Your present 'Savings Balance' : Rs "+spec.s+".00"); new Time("","5s"); break;
                case 6:  System.out.println("Wallet Balance Rs "+w+".00 has been successfully transfered."); new Time("","5s"); spec.s += spec.w; spec.w = 0; break; 
                case 7: System.out.println("\n\n\t\t\tPATTERN CHART\n\n\n 1.  ƍωϵ₢\t- 0 coin\t\t2.  Ω#θλ\t- 0 coin\n 3.  ɸ₢Ωπ\t- 0 coin\t\t4.  #λρ#\t- 0 coin\n 5.  Ω@$ω\t- 0 coin\t\t6.  ρ&₢ɸ\t- 0 coin\n\n 7.  $Ψ$$\t- 1 coin\t\t8.  ρΩϵρ\t- 1 coin\n 9.  #ƍ∑Ψ\t- 1 coin\t\t10. ωΩρ∑\t- 1 coin\n 11. $πΩƍ\t- 1 coin\t\t12. ϵϵΔ∑\t- 1 coin\n 13. Ωω₢ɸ\t- 1 coin\t\t14. $ϵΩ∑\t- 1 coin\n\n 15. ρθ∑ƍ\t- 2 coins\t\t16. $Ωϵπ\t- 2 coins\n 17. @ρθθ\t- 2 coins\t\t18. Ωƍ@$\t- 2 coins\n\n 19. ∑θɸρ\t- 5 coins\t\t20. ω#ƍ@\t- 5 coins\n 21. ΩɸΩɸ\t- 5 coins\t\t22. λρƍω\t- 5 coins\n\n 23. ΨΔθ∑\t- 10 coins\t\t24. ΨλΨπ\t- 10 coins\n 25. $$@#\t- 10 coins\t\t26. ₢₢θ#\t- 10 coins\n\n 27. @θλ#\t- 20 coins\t\t28. Ωϵ&Δ\t- 20 coins\n\n 29. Ψ∑ωπ\t- 50 coins\t\t30. ƍ₢ƍω\t- 50 coins\n 31. θ#@Ω\t- 50 coins\t\t32. π##&\t- 50 coins\n\n 33. ∑πϵρ\t- 75 coins\t\t34. πρ∑Ψ\t- 75 coins\n 35. ∑ΔΨϵ\t- 75 coins\t\t36. ΔΔρΔ\t- 75 coins\n\n 37. ∑ΩΩ∑\t- 100 coins\t\t38. ππππ\t- 150 coins\n 39. ΩΩΩΩ\t- 200 coins\t\t40. θθθθ\t- 250 coins"); break;
                case 8: 
                if(spec.w > 0)
                {
                    System.out.print("\fRs "+spec.w+".00 will be lost!!\nDo you want to continue without saving? (Y/N) : ");
                    if(br.readLine().equalsIgnoreCase("N"))
                        spec.s += spec.w;
                }
                if(spec.l == 'L' && spec.s > 0)
                {
                    if(spec.s >= spec.db)
                    {
                        spec.s -= spec.db;
                        spec.l = ' '; 
                        spec.db = 0;
                    }
                    else
                    {
                        spec.db -= spec.s;
                        spec.s = 0;
                    }
                    System.out.println("");
                }
                sf.record();
                return;
            }
        }
        while(true);
    }
    protected void multip()throws IOException
    {
        while(true)
        {
            System.out.println("\f\n\n\t\t\tPATTERN CHART\n\n\n 1.  ƍωϵ₢\t- 0 coin\t\t2.  Ω#θλ\t- 0 coin\n 3.  ɸ₢Ωπ\t- 0 coin\t\t4.  #λρ#\t- 0 coin\n 5.  Ω@$ω\t- 0 coin\t\t6.  ρ&₢ɸ\t- 0 coin\n\n 7.  $Ψ$$\t- 1 coin\t\t8.  ρΩϵρ\t- 1 coin\n 9.  #ƍ∑Ψ\t- 1 coin\t\t10. ωΩρ∑\t- 1 coin\n 11. $πΩƍ\t- 1 coin\t\t12. ϵϵΔ∑\t- 1 coin\n 13. Ωω₢ɸ\t- 1 coin\t\t14. $ϵΩ∑\t- 1 coin\n\n 15. ρθ∑ƍ\t- 2 coins\t\t16. $Ωϵπ\t- 2 coins\n 17. @ρθθ\t- 2 coins\t\t18. Ωƍ@$\t- 2 coins\n\n 19. ∑θɸρ\t- 5 coins\t\t20. ω#ƍ@\t- 5 coins\n 21. ΩɸΩɸ\t- 5 coins\t\t22. λρƍω\t- 5 coins\n\n 23. ΨΔθ∑\t- 10 coins\t\t24. ΨλΨπ\t- 10 coins\n 25. $$@#\t- 10 coins\t\t26. ₢₢θ#\t- 10 coins\n\n 27. @θλ#\t- 20 coins\t\t28. Ωϵ&Δ\t- 20 coins\n\n 29. Ψ∑ωπ\t- 50 coins\t\t30. ƍ₢ƍω\t- 50 coins\n 31. θ#@Ω\t- 50 coins\t\t32. π##&\t- 50 coins\n\n 33. ∑πϵρ\t- 75 coins\t\t34. πρ∑Ψ\t- 75 coins\n 35. ∑ΔΨϵ\t- 75 coins\t\t36. ΔΔρΔ\t- 75 coins\n\n 37. ∑ΩΩ∑\t- 100 coins\t\t38. ππππ\t- 150 coins\n 39. ΩΩΩΩ\t- 200 coins\t\t40. θθθθ\t- 250 coins");
            System.out.print("\n\nPress 'ENTER' to rotate the wheel : "); 
            if(br.readLine().equalsIgnoreCase("STOP"))
                 break;
            System.out.print("PATTERN ACHIEVD FOR THIS ROUND IS : "+pat[(int)(Math.random()*40)]); new Time("", "3s");
        }
    }
}