//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1021 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double dinheiro = scan.nextDouble();
        double[] valor = { 100, 50, 20, 10, 5, 2, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };
        int quantidade_notas=(int)dinheiro;
        int quantidade_moedas= (int)((dinheiro - quantidade_notas) * 100);
        //final int a=2;

        System.out.println("NOTAS:");
        for (int i=0;i<6;i++)
        {
            quantidade_notas = (int)(dinheiro / valor[i]);
            System.out.printf("%d nota(s) de R$ %.2f\n",quantidade_notas, valor[i]);
            dinheiro -= quantidade_notas * valor[i];

        }
        System.out.println("MOEDAS:");
        for (int i = 6; i <= 11; i++)
        {
            quantidade_moedas = (int)(dinheiro / valor[i]);
            System.out.printf("%d moeda(s) de R$ %.2f\n",quantidade_moedas, valor[i]);
            dinheiro -= quantidade_moedas * valor[i];
            dinheiro = Math.round(dinheiro * 100.0)/100.0;
        }
        
        
        scan.close();

    } 
}