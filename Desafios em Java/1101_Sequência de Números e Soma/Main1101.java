//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1101 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int m, n, t=0;

        m=scan.nextInt();
        n=scan.nextInt();

       while (m > 0 && n > 0)
       {
           t=0;

           if(m <= 0 || n <= 0)
           {

           }else if(m > n)
           {
               for (int i = n; i <= m; i++)
               { 
                   t+=i;
                  System.out.printf("%d ",i);
               }

              System.out.printf("Sum=%d\n",t);

           }else if(n > m)
           {
               for (int i = m; i <= n; i++)
               { 
                   t+=i;
                  System.out.printf("%d ",i);
               }

              System.out.printf("Sum=%d\n",t);
           }

           m=scan.nextInt();
           n=scan.nextInt();
           
       }

        scan.close();
    
    }
}