import java.util.Scanner;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperaturas a serem transformadas.");
        int quantidade = sc.nextInt();
        double[] temperaturas = new double[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.printf("Informe a temperatura %d", i + 1);
            temperaturas[i] = sc.nextDouble();

        }
        sc.nextLine();
        System.out.println("Digite a unidade de origem. [C -> celsius, F -> Fahrenheit, k -> Kelvin]");
        String origem = sc.nextLine();
        if (!validaEntrada(origem)) {
            return;
        }
        System.out.println("Digite a unidade de destino. [C -> celsius, F -> Fahrenheit, k -> Kelvin]");
        String destino = sc.nextLine();
        if (!validaEntrada(destino)) {
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            double temperatura = temperaturas[i];
            double temperaturaConvertida = conversao(temperatura, origem, destino);
            System.out.printf("%s %s = %s %s%n", temperatura, origem,temperaturaConvertida, destino);
        }


    }
    private static double conversao(double temperatura, String origem, String destino) {
        double temperaturaOrigem = origemToCelsius(temperatura, origem);
        double temperaturaDestino = celciusToDestino(temperaturaOrigem, destino);
        return temperaturaDestino;
    }
    public static double origemToCelsius(double temperatura, String origem){
        switch (origem.toUpperCase()) {
            case "F":
                return FahnToCelsius(temperatura);
            case "K":
                return KelvinToCelsius(temperatura);
            case "C":
            default:
                return temperatura;
        }
    }
    public static double celciusToDestino(double temperatura, String destino){
        switch (destino.toUpperCase()) {
            case "F":
                return CelsiusToFahn(temperatura);
            case "K":
                return CelsiusToKelvin(temperatura);
            case "C":
            default:
                return temperatura;
        }
    }

    public static double FahnToCelsius(double temperatura){
        return (temperatura - 32) * 5 / 9;
    }
    public static double CelsiusToFahn(double temperatura){
        return (temperatura * 9 / 5) + 32;
    }
    public static double KelvinToCelsius(double temperatura){
        return temperatura  - 273.15;
    }
    public static double CelsiusToKelvin(double temperatura){
        return temperatura  + 273.15;
    }
    public static boolean validaEntrada(String entrada) {
        switch (entrada.toUpperCase()) {
            case "C":
            case "K":
            case "F":
                return true;
            default:
                System.out.printf("A entrada %s não é válida", entrada);
                return false;
        }
    }

}
