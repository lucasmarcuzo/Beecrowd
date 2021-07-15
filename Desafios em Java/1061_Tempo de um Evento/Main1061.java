//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1061 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int d1, h1, m1, s1, d2, h2, m2, s2; 

        char x;

        String dia;

        dia=scan.next();
        d1=scan.nextInt();

        h1=scan.nextInt();
        x=scan.next().charAt(0);
        m1=scan.nextInt();
        x=scan.next().charAt(0);
        s1=scan.nextInt();

        dia=scan.next();
        d2=scan.nextInt();

        h2=scan.nextInt();
        x=scan.next().charAt(0);
        m2=scan.nextInt();
        x=scan.next().charAt(0);
        s2=scan.nextInt();

        s1 = s2 - s1;
        m1 = m2 - m1;
        h1 = h2 - h1;
        d1 = d2 - d1;

        if (s1 < 0 ) {
	        s1 += 60 ;
	        m1--;
        }

        if (m1 < 0 ) {
	        m1 += 60 ;
	        h1--;
        }

        if (h1 < 0 ) {
	        h1 += 24 ;
	        d1--;
        }

        System.out.printf("%d dia(s)\n", d1);
        System.out.printf("%d hora(s)\n", h1);
        System.out.printf("%d minuto(s)\n", m1);
        System.out.printf("%d segundo(s)\n", s1);

        scan.close();

    }
    
}