//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        for (int i = 0; i < numCases; i++) {
            int populationA = scanner.nextInt();
            int populationB = scanner.nextInt();
            double growthRateA = scanner.nextDouble();
            double growthRateB = scanner.nextDouble();

            int years = calculateYearsToExceed(populationA, populationB, growthRateA, growthRateB);
            printResult(years);
        }

        scanner.close();
    }

    public static int calculateYearsToExceed(int populationA, int populationB, double growthRateA, double growthRateB) {
        int years = 0;

        while (populationA <= populationB) {
            populationA += (int) (populationA * growthRateA / 100);
            populationB += (int) (populationB * growthRateB / 100);
            years++;

            if (years > 100) {
                return -1; // Mais de 1 século
            }
        }

        return years;
    }

    public static void printResult(int years) {
        if (years == -1) {
            System.out.println("Mais de 1 seculo.");
        } else {
            System.out.println(years + " anos.");
        }
    }
 
}