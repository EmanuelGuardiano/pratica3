
package pratica3;

import java.util.Scanner;


public class Pratica3 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] alturas = new int[10];
        int soma = 0;
        
        System.out.println("Digite as alturas de 10 pessoas:");
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = scanner.nextInt();
            soma += alturas[i];
            
            double media = (double) soma / alturas.length;
            
             System.out.printf("A média das alturas é: "+media);
        }
    }
    
}
