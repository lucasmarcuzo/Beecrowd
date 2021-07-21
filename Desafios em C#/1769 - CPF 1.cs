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
            int[] cpf_ver2=new int[10];
            int[] cpf_completo=new int[11];

            cpf=Console.ReadLine();
            
            if (string.IsNullOrEmpty(cpf))
            {
                break;
            }    
            else
            {
                cpf = cpf.Replace(".", "").Replace("-", "");    
            
                for (int i = 0; i < cpf_completo.Length; i++)
                {
                    cpf_completo[i]=Convert.ToInt32(cpf.Substring(i, 1)); 
                }

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

                int x=0;


                for (int i = 0, k = 1; k < cpf_completo.Length; i++, k++)
                {
                    if(cpf_completo[i]==cpf_completo[k])
                    {
                        x++; 

                        if(x == 10)
                        {
                            Console.WriteLine("CPF valido");
                            break;
                        }
                    }
                    else if (cpf_completo[9] == verificar && cpf_completo[10] == verificar2)
                    {
                        Console.WriteLine("CPF valido",verificar, verificar2);
                        break;
                    }       
                    else
                    {
                        Console.WriteLine("CPF invalido");
                        break;
                    } 
                }
            }
        }
    } 
}
