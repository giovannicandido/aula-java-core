import java.lang.reflect.Array;
import java.util.Arrays;

public class ExemploArrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;

        int[] numeros2 = {1, 2, 3, 4, 5};
        numeros2[4] = 100;

        Object[] numeros3 = {1, 2, "3", 2.3, new Motor(), new Oficina()};
        Object[] numeros4 = {1, 2, "3", 2.3};

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros2));

        for(int index = 0; index < numeros4.length; index++) {
            System.out.print(numeros4[index] + "; ");
        }

        int [][] matriz = new int[3][6];
        int [][][] matriz3d = new int[3][3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;

        matriz3d[0][0][0] = 1;
        matriz3d[0][1][0] = 4;
        matriz3d[0][2][0] = 7;
        matriz3d[0][0][1] = 10;




    }
}
