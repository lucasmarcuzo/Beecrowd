//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1074 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N,X,a;
    
        N=scan.nextInt();

        for(a=1;a<=N;a++){

            X=scan.nextInt();

            if(X==0){

                System.out.println("NULL");

            }else if(X<=0&&X%2==0){

                System.out.println("EVEN NEGATIVE");

            }else if(X<=0&&X%2==-1){

                System.out.println("ODD NEGATIVE");

            }else if(X>=0&&X%2==0){

                System.out.println("EVEN POSITIVE");

            }else if(X>=0&&X%2==1){

                System.out.println("ODD POSITIVE");
            }
        }

        scan.close();

    }
    
}