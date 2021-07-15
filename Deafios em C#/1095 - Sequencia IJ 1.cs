using System; 

//Developed by: @LucasMarcuzo
class URI1095 {

    static void Main(string[] args) { 

        int v, i=1, x=1, z=60;
        
        while (i <= 13)
        {
            v=x;
            x=x+3;
            i++;

            Console.WriteLine("I={0} J={1}",v,z);
            z-=5;
        }
    }
}