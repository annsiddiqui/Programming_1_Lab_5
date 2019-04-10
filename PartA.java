import java.util.Scanner;
/**
 * 
 * @author Qurrat-al-Ain Siddiqui
 */ 
public class PartA
{
    
    /**
     * Constructor for objects of class PartA
     */
    public PartA()
    {
        Scanner keyboard = new Scanner(System.in);
        
        double salary = keyboard.nextDouble();
        double pctgIncrease = keyboard.nextDouble();
        int numYears = keyboard.nextInt();
        int count = 1;
        
        System.out.println("SALARY SCHEDULE");
        System.out.println("Years of Service" + "     " + "Salary");
        
        while (count <= numYears)
        {
            salary = salary + salary * pctgIncrease;
                        
            System.out.printf("%16d" , count );
            System.out.println("     " + salary);
            
            count++;
        }
        
    }    
}
