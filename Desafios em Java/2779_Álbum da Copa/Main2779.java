//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2779 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num_album = 0, fig_compradas = 0;

        num_album = scan.nextInt();

        fig_compradas = scan.nextInt();

        int[] figurinhas = new int[fig_compradas];

        for (int i = 0; i < figurinhas.length; i++)
        {
            boolean y = false;
            int id = scan.nextInt();

            for (int x : figurinhas)
            {
                if (x == id)
                {
                    y = true;
                    break;
                }
            }   

            if(y == false)
            {
                figurinhas[i]=id;
                num_album--;
            }         
        
             
        }

        System.out.println(num_album);  



        scan.close();
    
    }
}