//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2006 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y;
        x=y=0;

        x=scan.nextInt();

        int[] vet = new int[5];

        vet[0]=scan.nextInt();
        vet[1]=scan.nextInt();
        vet[2]=scan.nextInt();
        vet[3]=scan.nextInt();
        vet[4]=scan.nextInt();

        for (int i = 0; i <vet.length; i++)
        {
            if(x == vet[i])
            {
                y++;
            }
        }

        System.out.println(y);
        


        scan.close();
    
    }
}