//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1072 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, x=0, y=0;

        n=scan.nextInt();

        int[] vet = new int[n];

        for(int i = 0; i <vet.length; i++){

            vet[i]=scan.nextInt();
            
            if(vet[i] >= 10 && vet[i] <= 20){

                x++;

            }else{

                y++;
            }
        }

        System.out.printf("%d in\n", x);
        System.out.printf("%d out\n", y);

        scan.close();

    }
    
}