package pratica3.pkg2;
import java.util.Random;

public class Pratica32 {

    
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][5];
        int[] somaLinhas = new int[5];
        
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                somaLinhas[i] += matriz[i][j];
                System.out.printf("|"+ matriz[i][j]+"|");
            }
            System.out.println();
        }
            System.out.println("Soma dos elementos de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
}
    

