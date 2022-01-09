import java.util.Scanner;

public class Main1408 {

    public static int n,l;
    public static int[] Num_armarios = new int[100000];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i;
        while(true)
        {
            n = scan.nextInt();
            l = scan.nextInt();
            if(n == 0) {
                break;
            }
            for(i=0; i < l; i++) {
                Num_armarios[i] = scan.nextInt();
            }

            System.out.println(n-melhorSeq());
        }
    }

    public static int melhorSeq(){
        int i;
        int MaiorSeqPossivel = 0;
        int indFinal = l-1;

        while(indFinal > 0 && Num_armarios[indFinal] > Num_armarios[l-1]-n){
            indFinal--;
        }

        if(indFinal < l-1 && Num_armarios[indFinal] < Num_armarios[l-1]-n){
            indFinal++;
        }

        for(i=0; i <= indFinal; i++)
        {
            int x = verifica(i);
            if(x > MaiorSeqPossivel){
                MaiorSeqPossivel = x;
            }
        }

        return MaiorSeqPossivel;
    }

    public static int verifica(int inicio){
        int i=inicio;
        int posFinal = Num_armarios[inicio] + n;

        while(true)
        {
            if(i < l && Num_armarios[i] < posFinal){
                i++;
            }
            else {
                break;
            }
        }

        return i-inicio;
    }


}
