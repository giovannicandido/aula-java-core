import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ExampleWhile {
    private static List<Aluno> alunos = List.of(
            new Aluno("Ana", LocalDate.parse("1992-01-14")),
            new Aluno("João", LocalDate.parse("1998-10-20")),
            new Aluno("Antonio", LocalDate.parse("1982-07-13")),
            new Aluno("Beatriz", LocalDate.parse("1986-03-01"))
    );

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 10;
        while (opcao != 0) {
            opcao = imprimirMenu();
        }
        System.out.println("Programa finalizado!");
        scanner.close();
    }

    public static int imprimirMenu() {
        System.out.println("Escolha uma ação: ");
        System.out.println("1. Lista de alunos");
        System.out.println("2. Criar aluno");
        System.out.println("3. Deletar Aluno");
        System.out.println("0. Sair");
        return scanner.nextInt();
    }

    public static void listarAluno() {

    }
}
