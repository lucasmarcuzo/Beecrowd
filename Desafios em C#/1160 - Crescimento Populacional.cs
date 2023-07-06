using System; 

//Developed by: @LucasMarcuzo

public class Beecrowd{
    
    public static void Main(string[] args){
        
        int numCases = Convert.ToInt32(Console.ReadLine());

        for (int i = 0; i < numCases; i++){
            
            string[] input = Console.ReadLine().Split(' ');
            int populationA = int.Parse(input[0]);
            int populationB = int.Parse(input[1]);
            double growthRateA = double.Parse(input[2]);
            double growthRateB = double.Parse(input[3]);

            int years = CalculateYearsToExceed(populationA, populationB, growthRateA, growthRateB);
            PrintResult(years);
        }
    }

    public static int CalculateYearsToExceed(int populationA, int populationB, double growthRateA, double growthRateB){
        
        int years = 0;

        while (populationA <= populationB){
            
            populationA += (int)(populationA * (growthRateA / 100));
            populationB += (int)(populationB * (growthRateB / 100));
            years++;

            if (years > 100)
            {
                return -1; // Mais de 1 século
            }
        }

        return years;
    }

    public static void PrintResult(int years){
        
        if (years == -1){
            
            Console.WriteLine("Mais de 1 seculo.");
        }
        else{
            
            Console.WriteLine(years + " anos.");
        }
    }
}
