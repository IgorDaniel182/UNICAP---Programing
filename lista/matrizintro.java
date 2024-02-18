import java.util.Scanner;

public class matrizintro{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaração da matriz:([L][C])
        double[][] matriz = new double[3][4];
        System.out.println("Preenchimento da matriz");
        preencherMatriz(matriz, input);
        System.out.println("Exibição da matriz: ");
        exibirMatriz(matriz);
    }

    public static void preencherMatriz(double[][] mat, Scanner input) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite o elemento da matriz: ");
                try {
                    mat[i][j] = input.nextDouble();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número válido.");
                    input.nextLine(); // Limpar o buffer do scanner
                    j--; // Ficar na mesma posição do loop
                }
            }
        }
    }

    public static void exibirMatriz(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
