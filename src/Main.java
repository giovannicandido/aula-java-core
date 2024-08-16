public class Main {
    public static int max_value = 100;
    public static String FUNCTION_NAME = "Main function";


    // Exemplo de chamada de methodo estatico
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var somatorio = soma(2, 4);
        int subtracao = subtrair(4, 5);
        System.out.println("O somatorio é: " + somatorio);
        System.out.println("A subtração é " + subtracao);

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

}