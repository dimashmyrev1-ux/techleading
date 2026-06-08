
import java.math.BigDecimal;
import java.time.LocalDate;


public class Javatechleading {
    public static void main(String[] args) {
        Integer A = 91;
        int a =7;
        
        Double B = 1000000000000000.5; 
        double b = 5192.252;
        
        boolean swag = true;
        Boolean SWAG = true;
        
       
        LocalDate date = LocalDate.of(2026, 6, 5);
        
        String words = "Sample text";
        
        BigDecimal val1 = new BigDecimal("1.10"); 
        BigDecimal val2 = BigDecimal.valueOf(1.10); 
        
        //арифметические операции
        System.out.println(A+b);
        int sum = A+a;
        double multiplication = b*B;
        double substraction = B-a;
        int division_int = A/a;
        int remainder = A%a;
        System.out.println(sum);
        System.out.println(multiplication);
        System.out.println(substraction);
        System.out.println(division_int);
        System.out.println(remainder);
        System.out.println("-------------------------");
        //логические
        if(a==7 && A.equals(91))
        {
            System.out.println("a==7 AND A is equal to 91");
        }
        else {
         System.out.println("False");
        }
        
      
        if(sum>0 && SWAG)
        {
         System.out.println("SWAG = True");
        }
        
        if(sum>0 && !SWAG)
        {
         System.out.println("SWAG = False");
        }
        System.out.println("-------------------------");
        Integer Integ1 = 200;
        Integer Integ2 = 200;
        System.out.println("Integ1 == Integ2 : " + (Integ1 == Integ2));        
        System.out.println("Integ1.equals(Integ2) : " + Integ1.equals(Integ2)); 
      

       
    }
}
         
