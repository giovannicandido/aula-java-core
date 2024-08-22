import java.math.BigDecimal;
import java.util.Scanner;

public class ExemploIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu peso? ");
        float peso = scanner.nextFloat();
        System.out.print("Qual a sua altura? ");
        float altura = scanner.nextFloat();
        float imc = calcularIMC(peso, altura, 2);
//        String resultadoIMC = String.format("%.2f", imc);
//        System.out.printf("IMC: %.2f\n", imc);
        System.out.printf("IMC: %s \n", imc);
        if (imc < 18.5) {
            System.out.println("Você está magro(a)");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else if (imc >= 30 && imc < 39) {
            System.out.println("Você está acima do peso");
        } else if (imc >= 40) {
            System.out.println("Você está com obsidade grave, por favor se cuide");
        }

    }


    public static float calcularIMC(float peso, float altura, int numeroCasas) {
//        float imc = peso / (altura * altura);
        float imc = (float) (peso / Math.pow(altura, 2));
        BigDecimal bigDecimal = new BigDecimal(imc);
        imc = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        return imc;
    }
}
