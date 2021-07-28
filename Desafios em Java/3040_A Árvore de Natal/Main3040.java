//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main3040 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int ts = scan.nextInt();

        for (int i = 0; i < ts; i++)
        {
            int altura = scan.nextInt();
            int diametro = scan.nextInt();
            int galhos = scan.nextInt();

            if(altura >= 200 && altura <= 300)
            {
                if (diametro >= 50)
                {
                    if(galhos > 150)
                    {
                        System.out.println("Sim");
                    }
                    else
                    {
                        System.out.println("Nao");
                    }
                }
                else
                {
                    System.out.println("Nao");
                }
            }
            else
            {
                System.out.println("Nao");
            }
        }

        scan.close();
    
    }
}