// package lista_matriz;
// import java.util.*;

// public class l1 {   
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double[][] matriz = new double[2][2];
//         System.out.println("Preenchimento da matriz");
//         preencherMatriz(matriz, input);

//         System.out.println("Exibição da matriz: ");
//         exibirMatriz(matriz);

//         double maiorElemento = contadordemaiornumero(matriz);
//         double[][] matrizR = multiplicarPorMaiorElemento(matriz, maiorElemento);

//         System.out.println("Matriz resultante R após a multiplicação:");
//         exibirMatriz(matrizR);
//     }

//     public static void preencherMatriz(double[][] mat, Scanner input) {
//         for (int i = 0; i < mat.length; i++) {
//             for (int j = 0; j < mat[i].length; j++) {
//                 System.out.println("Digite o elemento da matriz: ");
//                 try {
//                     mat[i][j] = input.nextDouble();
//                 } catch (java.util.InputMismatchException e) {
//                     System.out.println("Entrada inválida. Digite um número válido.");
//                     input.nextLine(); // Limpar o buffer do scanner
//                     j--; // Ficar na mesma posição do loop
//                 }
//             }
//         }
//     }

//     public static double contadordemaiornumero(double[][] matriz) {
//         double cont = matriz[0][0];
//         for (int i = 0; i < matriz.length; i++) {
//             for (int j = 0; j < matriz[i].length; j++) {
//                 if (matriz[i][j] > cont) {
//                     cont = matriz[i][j];
//                 }
//             }
//         }
//         return cont; // Retorna o valor do maior elemento
//     }

//     public static double[][] multiplicarPorMaiorElemento(double[][] matriz, double maiorElemento) {
//         double[][] matrizR = new double[2][2];
//         for (int i = 0; i < matriz.length; i++) {
//             for (int j = 0; j < matriz[i].length; j++) {
//                 matrizR[i][j] = matriz[i][j] * maiorElemento;
//             }
//         }
//         return matrizR; // Retorna a matriz resultante R
//     }

//     public static void exibirMatriz(double[][] mat) {
//         for (int i = 0; i < mat.length; i++) {
//             for (int j = 0; j < mat[i].length; j++) {
//                 System.out.print(mat[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
