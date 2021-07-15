using System; 

//Developed by: @LucasMarcuzo
class URI1828 {

    static void Main(string[] args) { 

        int qtdTeste = int.Parse(Console.ReadLine());
        
        string v1, v2;
        
        for (int i = 1; i <=qtdTeste; i++)
        {
            string[] valores = Console.ReadLine().Split();
            v1 = valores[0];
            v2 = valores[1];
            if((v1 == "tesoura" && v2 == "papel")||(v1 == "papel" && v2 == "pedra") 
                || (v1 == "pedra" && v2 == "lagarto") || (v1 =="lagarto" && v2 == "Spock")
                || (v1 == "Spock" && v2 == "tesoura") || (v1 == "tesoura" && v2 == "lagarto")
                || (v1 == "lagarto" && v2 == "papel") || (v1 == "papel" && v2 == "Spock")
                || (v1 == "Spock" && v2 == "pedra") || (v1 == "pedra" && v2 == "tesoura")){

                Console.WriteLine("Caso #{0}: Bazinga!", i);          
                    
            }else if(v1 == v2){
                
                Console.WriteLine("Caso #{0}: De novo!", i);
                    
            }else{
                
                Console.WriteLine("Caso #{0}: Raj trapaceou!", i);
            }     
        }
    }
}
