//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1985 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, cod, qtd;
        double result=0f;
        n=scan.nextInt();

        int[] vet_cod = {1001, 1002, 1003, 1004, 1005};
        double[] vet_val = {1.50f, 2.50f, 3.50f, 4.50f, 5.50f};

        for (int i = 0; i < n; i++)
        {

            cod=scan.nextInt();
            qtd=scan.nextInt();

            for (int j = 0; j < vet_val.length; j++)
            {
                if(cod == vet_cod[j])
                {
                    result+=vet_val[j]*qtd;
                }
                
            }  

        }

        System.out.printf("%.2f\n",result);
        
        scan.close();

    } 
}