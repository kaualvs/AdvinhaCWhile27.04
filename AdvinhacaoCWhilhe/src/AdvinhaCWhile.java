import java.util.Scanner;

public class AdvinhaCWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogo da advinhação");


        int numeroaleatorio = (int) (Math.random() * 100) + 1;
        int palpite;
        int contador = 0;

        do {
            System.out.println("Tente advinhar o número");
            palpite = scanner.nextInt();
            contador++;

            if (palpite < numeroaleatorio) {
                System.out.println("Escolha um número maior!");
            } else if (palpite > numeroaleatorio) {
                System.out.println("Escolha um número menor!");
                
            }
        } while (palpite != numeroaleatorio);

        System.out.println("Párabens! depois de muito tempo você acertou.");












        scanner.close();
    }
}
