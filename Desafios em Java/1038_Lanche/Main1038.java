//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1038 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y;
        double z;
        int[] cod = {1,2,3,4,5};
        double[] valor = {4.00, 4.50, 5.00, 2.00, 1.50};

        x=scan.nextInt();
        y=scan.nextInt();

        if(x == cod[0]){

            z=(double)(y * valor[0]);
            System.out.printf("Total: R$ %.2f\n",z);

        }else if(x == cod[1]){

            z=(double)(y * valor[1]);
            System.out.printf("Total: R$ %.2f\n",z);

        }else if(x == cod[2]){

            z=(double)(y * valor[2]);
            System.out.printf("Total: R$ %.2f\n",z);

        }else if(x == cod[3]){

            z=(double)(y * valor[3]);
            System.out.printf("Total: R$ %.2f\n",z);
        
        }else if(x == cod[4]){

            z=(double)(y * valor[4]);
            System.out.printf("Total: R$ %.2f\n",z);

        }    
        scan.close();

    } 
}