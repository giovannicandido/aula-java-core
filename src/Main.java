import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Exemplo de chamada de methodo não estatica
    public static void main(String[] args) {
        System.out.println("Bem vindo a caluladora");
        System.out.println("Qual tipo de calculo você quer fazer? (Digite um numero)");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");

        // Pego o numero digitado no teclado
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 0;
        try {
            opcao = scanner.nextInt();
            MinhaCalculadora calculadora = new MinhaCalculadora();

            if(opcao == 1) {
                System.out.println("Soma escolhida.");
                ValoresDigitados valoresDigitados = lerValores();
                Integer resultado = calculadora.soma(valoresDigitados.valorA, valoresDigitados.valorB);
                System.out.println("Resultado: " + resultado);
            }else if (opcao == 2) {
                System.out.println("Subtracao escolhida. Digite o primeiro valor: ");
                ValoresDigitados valoresDigitados = lerValores();
                Integer resultado = calculadora.subtrair(valoresDigitados.valorA, valoresDigitados.valorB);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida, favor digite novamente");
            }

        } catch (InputMismatchException exception){
            System.out.println("Valor invalido, favor digitar um numero");
        }


    }

    public static ValoresDigitados lerValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        Integer valorA = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        Integer valorB = scanner.nextInt();
        ValoresDigitados valoresDigitados = new ValoresDigitados(valorA, valorB);
//        valoresDigitados.valorA = valorA;
//        valoresDigitados.valorB = valorB;
        return valoresDigitados;
    }


}