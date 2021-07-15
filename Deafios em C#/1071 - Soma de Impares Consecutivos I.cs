using System; 

//Developed by: @LucasMarcuzo
class URI1071 {
    static void Main(string[] args) { 

        int a, b, y=0;

        a=int.Parse(Console.ReadLine());
        b=int.Parse(Console.ReadLine());


        if(a == b){
        
            y=0;
        
        }else if(a < b){
        
            for(a= a+1; a < b; a++){
                
                if(a%2==1||a%2==-1)
                y+=a;
            }
    
        }else if(a > b){
        
            for(b= b+1; b < a; b++){
                
                if(b%2==1||b%2==-1)
                y+=b;
            }

        } 
        
        Console.WriteLine(y);  
    }

}