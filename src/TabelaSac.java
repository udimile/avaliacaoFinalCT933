import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class TabelaSac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo.");
        BigDecimal saldoDevedor = sc.nextBigDecimal();
        System.out.println("Informe a taxa de juros do empréstimo.");
        BigDecimal juros = sc.nextBigDecimal();
        System.out.println("Informe o tempo para pagamento em meses.");
        BigDecimal tempo = sc.nextBigDecimal();
        BigDecimal cem = BigDecimal.valueOf(100);
        BigDecimal jurosAoMes = juros.divide(cem);
        MathContext casasDecimais = new MathContext(5);
        BigDecimal valorAmortizacao = saldoDevedor.divide(tempo);
        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com juros de %.2f ao mês.\n", valorAmortizacao, saldoDevedor, juros);

        BigDecimal saldoDevedorAtual = saldoDevedor;
        BigDecimal totalJuros = BigDecimal.ZERO;
        BigDecimal totalParcelas = BigDecimal.ZERO;
        BigDecimal totalAmortizacao = BigDecimal.ZERO;

        for (int i = 1; i <= tempo.intValue(); i++){
            BigDecimal jurosMensal = saldoDevedorAtual.multiply(jurosAoMes);
            BigDecimal parcelaMensal = jurosMensal.add(valorAmortizacao);
            saldoDevedorAtual = saldoDevedorAtual.subtract(valorAmortizacao);
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, jurosMensal, parcelaMensal, saldoDevedorAtual);
            totalJuros = totalJuros.add(jurosMensal);
            totalAmortizacao = totalAmortizacao.add(valorAmortizacao);
            totalParcelas = totalParcelas.add(parcelaMensal);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", totalParcelas, totalJuros, totalAmortizacao);




    }
}
