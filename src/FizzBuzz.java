import java.util.Random;

public class FizzBuzz {
    public static void main(String[] args) {
        

        for(int i = 1; i <= 100; i++){
            
            boolean divisivelPor3 = i % 3 == 0;
            boolean divisivelPor5 = i % 5 == 0;
            
            if(divisivelPor3 && divisivelPor5){
                System.out.println("FizzBizz");
            } else if (divisivelPor3) {
                System.out.println("Fizz");
            } else if (divisivelPor5) {
                System.out.println("Bizz");
            } else {
                System.out.println(i);
            }
        }
        
        

    }
}