//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1094 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, C=0, R=0, S=0, x, coelhos=0, ratos=0, sapos=0, total;
        float tc, tr, ts;
        char y;

        n=scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            x=scan.nextInt();
            y=scan.next().charAt(0);

            if(y == 'C')
            {
                C++;
                coelhos+=x;

            }else if(y == 'R')
            {
                R++;
                ratos+=x;

            }else if(y == 'S')
            {
                S++;
                sapos+=x;
            }
        }

        total=coelhos+ratos+sapos;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n",coelhos);
        System.out.printf("Total de ratos: %d\n",ratos);
        System.out.printf("Total de sapos: %d\n",sapos);

        tc=(float)coelhos/total*100;
        tr=(float)ratos/total*100;
        ts=(float)sapos/total*100;

        System.out.printf("Percentual de coelhos: %.2f %%\n", tc);
        System.out.printf("Percentual de ratos: %.2f %%\n", tr);
        System.out.printf("Percentual de sapos: %.2f %%\n", ts);

        scan.close();

    }
    
}