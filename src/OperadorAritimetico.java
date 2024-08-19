import java.util.Objects;

public class OperadorAritimetico {
    public static void main(String[] args) {
        int valor = 1;
        valor = valor + 2;
        System.out.println(valor);
        valor = 1;
        valor += 2;
        System.out.println(valor);
        valor = 1;
        valor++;
        System.out.println(valor);
        valor = 1;
        ++valor;
        System.out.println(valor);

        int idade = 17;
        String nome = "Joao";
        if(!(idade < 18 || nome == "Alan")) {
            System.out.println("Entrou no if");
        }
        nome = null;
        if(Objects.nonNull(nome)) {
            System.out.println("Nome foi preenchido");
        } else {
            System.out.println("Nome é vazio");
        }
    }


}
