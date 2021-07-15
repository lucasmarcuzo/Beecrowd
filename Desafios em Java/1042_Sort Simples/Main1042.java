//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1042 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a, b, c;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a < b && a < c){

            System.out.println(a);

            if(b < c){

                System.out.println(b);
                System.out.println(c);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            }else if(c < b){

                System.out.println(c);
                System.out.println(b);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }

        }else if(b < a && b < c){

            System.out.println(b);

            if(a < c){

                System.out.println(a);
                System.out.println(c);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            }else if(c < a){

                System.out.println(c);
                System.out.println(a);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }

        }else if(c < a && c < b){

            System.out.println(c);

            if(b < a){

                System.out.println(b);
                System.out.println(a);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            }else if(a < b){

                System.out.println(a);
                System.out.println(b);
                System.out.println("");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
        scan.close();
    }        
}
