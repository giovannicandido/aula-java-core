import java.util.Scanner;

public class ExemploCarteiraMotorista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = entrada.nextInt();
        System.out.print("Você possui carteira de motorista? ");
        boolean possuiCarteira = entrada.nextBoolean();
        System.out.print("Você está bebado? ");
        boolean estaBebado = entrada.nextBoolean();
        // Operacao logica.
        if(idade >= 18 && possuiCarteira && !estaBebado) {
            System.out.println("Você pode dirigir");
        } else {
            System.out.println("Você não pode dirigir!");
        }
    }
}
