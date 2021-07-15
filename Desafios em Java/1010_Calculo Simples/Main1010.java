import java.util.Scanner;

public class Main1010 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int cod1 = scan.nextInt();
        int qtd1 = scan.nextInt();
        double valor1 = scan.nextDouble();

        int cod2 = scan.nextInt();
        int qtd2 = scan.nextInt();
        double valor2 = scan.nextDouble();

        double total=(valor1 * qtd1) + (valor2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

        scan.close();

    }
}
