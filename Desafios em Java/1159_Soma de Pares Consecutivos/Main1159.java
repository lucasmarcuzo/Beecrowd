//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1159 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

            do
            {
                int num = 0, i = 0, v = 0;

                num=scan.nextInt();

                if(num == 0)
                {
                    break;
                }
                else
                {
                    do
                    {
                        if(num % 2 == 0)
                        {
                            i+=num;
                            v++;
                        }
                        num++;
                        

                    } while (v < 5);

                   System.out.printf("%d\n",i);
                }
                
            } while (true);


        scan.close();
    
    }
}

