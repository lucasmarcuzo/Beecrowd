using System;

//Developed by: @LucasMarcuzo

namespace _2763___Entrada_e_Saída_CPF
{
    class Program
    {
        static void Main(string[] args)
        {
            string cpf = Console.ReadLine().Replace(".", "").Replace("-", "");  

            string[] cpf_completo = new string[4];

            cpf_completo[0]=cpf.Substring(0,3); 
            cpf_completo[1]=cpf.Substring(3,3); 
            cpf_completo[2]=cpf.Substring(6,3); 
            cpf_completo[3]=cpf.Substring(9,2); 

            foreach (string i in cpf_completo)
            {
                Console.Write("{0}\n", i);
            }       
        }
    }
}
