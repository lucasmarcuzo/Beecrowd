//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        float[][] m = new float[12][12];
        float soma = 0, media = 0;
        float elemento;
        int linha;
        char operacao;

        linha = scan.nextInt();
        operacao = scan.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                elemento = scan.nextFloat();
                m[i][j] = elemento;
            }
        }

        if (operacao == 'S') {
            int i = linha;
            while (i == linha) {
                for (int j = 0; j < 12; j++) {
                    soma += m[i][j];
                }
                i++;
            }
            System.out.printf("%.1f\n", soma);
        } else if (operacao == 'M') {
            int i = linha;
            while (i == linha) {
                for (int j = 0; j < 12; j++) {
                    media += m[i][j];
                }
                i++;
            }
            System.out.printf("%.1f\n", media / 12);
        }

        scan.close();
    }
}
