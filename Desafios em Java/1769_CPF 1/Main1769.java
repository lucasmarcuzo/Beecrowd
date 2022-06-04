//Developed by: @LucasMarcuzo

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.NullPointerException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NullPointerException, IOException {

        List<String> t = new ArrayList<>();

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready())
        {
           String cpf = in.readLine();

            int verificar=0, verificar2=0, teste1=1, teste2=9;
            String[] cpf_ver=new String[9];
            String[] cpf_ver2=new String[10];
            String[] cpf_completo=new String[11];
            
            cpf = cpf.replaceAll("[()-.\"]", "");
        
            for (int i = 0; i < cpf_completo.length; i++)
            {
                cpf_completo[i]=cpf.substring(i, i+1);
            }

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

            int x=0;

            for (int i = 0, k = 1; k < cpf_completo.length; i++, k++)
            {
                if(cpf_completo[i].equals(cpf_completo[k]))
                {
                    x++;

                    if(x == 10)
                    {
                        t.add("CPF valido");
                        break;
                    }
                }
                else if (cpf_completo[9].equals(String.valueOf(verificar)) && cpf_completo[10].equals(String.valueOf(verificar2)))
                {
                    t.add("CPF valido");
                    break;
                }
                else
                {
                    t.add("CPF invalido");
                    break;
                }
            }
        }

        if(!t.isEmpty()){
            for (String teste : t){
                System.out.println(teste);
            }
        }
    }
 
}