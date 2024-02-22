package prog_imperativa;
import java.util.Random;

public class funcoes {
    public static void main(String args[]) {

    }

    public static int[] metodoBolha(int[] vet) {
        int i = vet.length;
        while (i >= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
            i = i - 1;
        }
        return (vet);
    }

    public static int[] insercaoDireta(int vet[]) {
        int i, j, chave;
        int fim = vet.length - 1;

        for (i = 1; i <= fim; i++) {
            chave = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > chave) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = chave;
        }
        return (vet);
    }

    public static int[] selecaoDireta(int[] vet) {
        int i, j, menor, aux;

        for (i = 0; i < vet.length - 1; i++) {
            menor = i;
            for (j = i + 1; j <= vet.length - 1; j++) {
                if (vet[j] < vet[menor]) {
                    menor = j;
                }
            }
            aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
        }
        return (vet);
    }

    public static void exibeVetor(int[] vet) {

        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
    }

    public static int buscaSequencial(int v[], int procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < v.length; i++) {
            if (v[i] == procurado) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i; // retorna a posição onde encontrou a chave
        } else {
            return -1; // retorna -1 indicando que não achou a chave
        }
    }

    public static int buscaMelhorada(int v[], int procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < v.length; i++) {
            if (v[i] == procurado) {
                achou = true;
                break;
            } else if (v[i] > procurado) {
                break;
            }
        }
        if (achou == true) {
            return i; // retorna a posição onde encontrou a chave
        } else {
            return -1; // retorna -1 indicando que não achou a chave
        }
    }

    public static int buscaBinaria(int[] v, int procurado) {
        int inicio = 0, meio = 0, fim = v.length - 1;
        boolean achou = false;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (v[meio] == procurado) {
                achou = true;
                break;
            } else if (v[meio] > procurado) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        if (achou == true) {
            return meio; // retorna a posição onde encontrou a chave
        } else {
            return -1; // retorna -1 indicando que não achou a chave
        }
    }

    public static int[] vetorAleatorio(int[] vet, int intervalo) {
        // Declaração da variável para trabalhar com
        // números inteiros aleatórios
        Random r;
        r = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(intervalo) + 1;
        }
        return (vet);
    }
}
