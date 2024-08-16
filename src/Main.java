public class Main {
    public static int max_value = 100;
    public static String FUNCTION_NAME = "Main function";


    // Exemplo de chamada de methodo não estatica
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // instanciando objetos do tipo MinhaCalculadora
        var objetoCalculadora = new MinhaCalculadora();
        MinhaCalculadora objetoCalculadora2 = new MinhaCalculadora();

        // Acessando methodos dentro dos objetos
        var somatorio = objetoCalculadora.soma(2, 4);
        int subtracao = objetoCalculadora2.subtrair(4, 5);

        System.out.println("O somatorio é: " + somatorio);
        System.out.println("A subtração é " + subtracao);

    }


}