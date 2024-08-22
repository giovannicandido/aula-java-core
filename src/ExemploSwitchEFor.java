public class ExemploSwitchEFor {
    private static int numeroExemplo = 0;
    public static void main(String[] args) {
        separar("exemplo switch");
        ClassificacaoIMC classificacaoIMC = ClassificacaoIMC.MAGRO;

        switch (classificacaoIMC) {
            case MAGRO:
                System.out.println("Você está magro(a)");
                break;
            case SOBREPESO:
                System.out.println("Você está com sobrepeso");
                break;
            case NORMAL:
                System.out.println("Seu peso está normal");
                break;
            default:
                System.out.println("IMC não reconhecido");
        }

        String classificacao = classificacaoIMC.getClassificacaoPorExtenso();
        System.out.println(classificacao);
        separar("for tradicional");
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        separar("for natural ou syntax sugar");
        int numeros[] = {1, 2, 3, 4, 5, 7, 20, 30, 50};
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }


        separar("for com matriz");
        int matriz[][] = new int[2][2];
        matriz[0][0] = 10;
        matriz[1][0] = 20;
        matriz[0][1] = 30;
        matriz[1][1] = 40;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        separar("for com continue");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    continue; // pula apenas o for de dentro
                }
                System.out.print(matriz[i][j] + " ");
            }
        }
        separar("for com break");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    break;
                }
                System.out.print(matriz[i][j] + " ");
            }
        }

        separar("for com return");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    return;
                }
                System.out.print(matriz[i][j] + " ");
            }
        }
    }


    private static void separar(String exemplo) {
        System.out.println();
        System.out.println("%s: %s   -------------".formatted(numeroExemplo, exemplo));
        numeroExemplo++;
        System.out.println();
    }
}
