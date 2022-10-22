import java.util.Locale;
import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o mês");
        String mes = sc.nextLine();

        switch (mes.toLowerCase(Locale.ROOT)){
            case "janeiro":
            case "maio":
            case "março":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                trintaDias(mes);
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                trintaEUmDias(mes);
                break;
            case "fevereiro":
                System.out.println("Fevereiro possui 28 dias");
            default:
                System.out.println("Entrada inválida!");

        }
    }

    public static void trintaDias(String mes){
        System.out.printf("%s possui 30 dias", mes);

    }
    public static void trintaEUmDias(String mes){
        System.out.printf("%s possui 31 dias", mes);

    }
}
