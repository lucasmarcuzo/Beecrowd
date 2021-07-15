//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1131 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y, i, g, e, s, grenais;
        x=y=i=g=e=s=grenais=0;

        do
        {
            x=scan.nextInt();
            y=scan.nextInt();

            if(x > y)
            {
                i++;
                grenais++;
                
            }else if(y > x)
            {
                g++;
                grenais++;
            }else
            {
                e++;
                grenais++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            s=scan.nextInt();
            
        } while (s == 1);


        if (i > g)
        {
            System.out.printf("%d grenais\n",grenais);
            System.out.printf("Inter:%d\n",i);
            System.out.printf("Gremio:%d\n",g);
            System.out.printf("Empates:%d\n",e);
            System.out.printf("Inter venceu mais\n");

        }else if (g > i)
        {
            System.out.printf("%d grenais\n",grenais);
            System.out.printf("Inter:%d\n",i);
            System.out.printf("Gremio:%d\n",g);
            System.out.printf("Empates:%d\n",e);
            System.out.printf("Gremio venceu mais\n");

        }else
        {
            System.out.printf("%d grenais\n",grenais);
            System.out.printf("Inter:%d\n",i);
            System.out.printf("Gremio:%d\n",g);
            System.out.printf("Empates:%d\n",e);
            System.out.printf("Nao houve vencedor\n");
        }

        scan.close();
    
    }
}