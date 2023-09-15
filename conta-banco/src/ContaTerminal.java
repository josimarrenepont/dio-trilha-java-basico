
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("----------------------------------");
        System.out.println("        Seja Bem-Vindo            ");
        System.out.println("----------------------------------");
        System.out.print("Digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite numero da agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Inserir número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Quanto deseja depositar em sua conta: ");
        double volarDoDeposito = sc.nextDouble();
        System.out.println();
        System.out.println("Ola, " + nome + " Obrigado por criar uma conta em nosso banco");
        System.out.println("Numero da sua agencia, " + agencia + " conta "
                + numeroDaConta + " ,seu saldo apos abertura da conta " + (String.format("%.2f", volarDoDeposito)) + " ,ja esta disponivel para saque");

    }

}
