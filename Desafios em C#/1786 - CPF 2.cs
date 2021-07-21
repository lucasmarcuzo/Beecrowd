using System;

//Developed by: @LucasMarcuzo

class URI
{
    static void Main(string[] args)
    {   

        while(true) 
        {
            string cpf = " "; 
            int verificar=0, verificar2=0, teste1=1, teste2=9;
            int[] cpf_ver=new int[9];
            int[] cpf_ver2=new int[9];

            cpf=Console.ReadLine();
            
            if (string.IsNullOrEmpty(cpf))
            {
                break;
            }    
            else
            {  

                for (int i = 0; i < cpf_ver.Length; i++)
                {
                    cpf_ver[i]=Convert.ToInt32(cpf.Substring(i, 1)); 
                    verificar+=cpf_ver[i]*teste1;
                    teste1++;
                }

                verificar%=11;

                if(verificar == 10)
                {
                    verificar=0;
                }
            
                for (int j = 0; j < cpf_ver2.Length; j++)
                {
                    cpf_ver2[j]=Convert.ToInt32(cpf.Substring(j, 1)); 
                    verificar2+=cpf_ver2[j]*teste2;
                    teste2--;
                }

                verificar2%=11;

                if(verificar2 == 10)
                {
                    verificar2=0;
                }  

                int[] cpf_completo = new int[11];
                Array.Copy(cpf_ver, cpf_completo, 9); 

                cpf_completo[9]=verificar;
                cpf_completo[10]=verificar2;

                Console.WriteLine("{0}{1}{2}.{3}{4}{5}.{6}{7}{8}-{9}{10}", cpf_completo[0], cpf_completo[1], cpf_completo[2],
                cpf_completo[3], cpf_completo[4], cpf_completo[5], cpf_completo[6], cpf_completo[7], cpf_completo[8], cpf_completo[9], cpf_completo[10]);

                
            }
        }
    } 
}
