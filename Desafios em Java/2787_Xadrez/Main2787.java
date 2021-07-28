//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2787 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();

        int[][] xadrez = new int[x][y];

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                int o = i + j;
                if (o % 2 == 0)
                {
                    xadrez[i][j] = 1;
                }
                else
                {
                    xadrez[i][j] = 0;
                }

            }

        }

        System.out.printf("%d\n", xadrez[x-1][y-1]);

        scan.close();
    
    }
}