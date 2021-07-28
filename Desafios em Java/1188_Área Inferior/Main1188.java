//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1188 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float[][] x = new float[12][12];
        char tipo;

        tipo = scan.next().charAt(0);

        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                x[i][j] = scan.nextFloat();
            }
        }

        float total = 0;

        for (int i = 5; i < 7; i++)
        {      
            total += x[7][i];     
        }

        for (int j = 4; j < 8; j++)
        {      
            total += x[8][j];     
        }

        for (int k = 3; k < 9; k++)
        {      
            total += x[9][k];     
        }

        for (int l = 2; l < 10; l++)
        {      
            total += x[10][l];     
        }

        for (int m = 1; m < 11; m++)
        {      
            total += x[11][m];     
        }

        if (tipo == 'S')
        {
            System.out.printf("%.1f\n",total);
        }
        else if (tipo == 'M')
        {
            System.out.printf("%.1f\n",total/30.0f);
        }   



        scan.close();
    
    }
}