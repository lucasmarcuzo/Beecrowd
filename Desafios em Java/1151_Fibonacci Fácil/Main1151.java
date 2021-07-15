//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1151 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x,y, a=0,b=1,c=0;

        x=scan.nextInt();

        for(y=1; y<x; y++)
        {
            if(y % 2 == 1)
            {
                System.out.printf("%d ",c);
                c=a+b;
                a=c;

            }else if(y ==2){

                System.out.printf("%d ",c);

            }else if(y % 2 == 0){

                System.out.printf("%d ",c);
                c=a+b;
                b=c;
            }
        }
            
            System.out.printf("%d\n",c);

        scan.close();
    
    }
}