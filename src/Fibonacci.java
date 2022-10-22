import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de termos que deseja exibir da sequência de Fibonnaci?");
        int quantidade = sc.nextInt();


        if (quantidade > 45 ){
            System.out.println("Não é possível mais que 45 termos.");
            return;
        } else if (quantidade < 0) {
            System.out.println("Somente são aceitos números positivos.");
            return;
        }

        int[] arr = new int[quantidade];



        for (int i = 0; i < quantidade; i++){
           if(i <= 1) {
               arr[i] = 1;
           } else {
               arr[i] = arr[i-1] + arr[i-2];
           }
            System.out.printf("%d ", arr[i]);

        }

    }

}
