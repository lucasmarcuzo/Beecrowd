//Developed by: @LucasMarcuzo

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1786 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready())
        {
            String cpf = in.readLine();

            int verificar=0, verificar2=0, teste1=1, teste2=9;
            String[] cpf_ver=new String[9];
            String[] cpf_ver2=new String[9];

            for (int i = 0; i < cpf_ver.length; i++)
            {
                cpf_ver[i]=cpf.substring(i, i+1);
                verificar+=(Integer.parseInt(cpf_ver[i])*teste1);
                teste1++;
            }

            verificar%=11;

            if(verificar == 10)
            {
                verificar=0;
            }

            for (int j = 0; j < cpf_ver2.length; j++)
            {
                cpf_ver2[j]=cpf.substring(j, j+1);
                verificar2+=(Integer.parseInt(cpf_ver2[j])*teste2);
                teste2--;
            }

            verificar2%=11;

            if(verificar2 == 10)
            {
                verificar2=0;
            }

            String teste = "";

            for (int i = 0; i < cpf_ver.length; i++) {
                teste += cpf_ver[i];
                if(i == 2 || i == 5){
                    teste += ".";
                }
                else if(i == 8){
                    teste += "-";
                }
            }

            teste += String.valueOf(verificar) + String.valueOf(verificar2);

            System.out.println(teste);

        }

    }
 
}