//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1046 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);       

        int x, y, z, w=60, v=24;

        x = scan.nextInt();
        y = scan.nextInt();

        if(x < y){

            z=((y*w-x*w)/w);
            System.out.printf("O JOGO DUROU %d HORA(S)\n",z);

        }else if(x > y){

            z=((v-x)+y);
            System.out.printf("O JOGO DUROU %d HORA(S)\n",z);
            
        }else{
            z=24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",z);
        }

        scan.close();
    }        
}
