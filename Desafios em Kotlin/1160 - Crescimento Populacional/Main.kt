import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numCases = scanner.nextInt()

    for (i in 0 until numCases) {
        var populationA = scanner.nextInt()
        var populationB = scanner.nextInt()
        val growthRateA = scanner.nextDouble()
        val growthRateB = scanner.nextDouble()

        val years = calculateYearsToExceed(populationA, populationB, growthRateA, growthRateB)
        printResult(years)
    }

    scanner.close()
}

fun calculateYearsToExceed(populationA: Int, populationB: Int, growthRateA: Double, growthRateB: Double): Int {
    var years = 0
    var popA = populationA
    var popB = populationB

    while (popA <= popB) {
        popA += (popA * growthRateA / 100).toInt()
        popB += (popB * growthRateB / 100).toInt()
        years++

        if (years > 100) {
            return -1 // Mais de 1 século
        }
    }

    return years
}

fun printResult(years: Int) {
    if (years == -1) {
        println("Mais de 1 seculo.")
    } else {
        println("$years anos.")
    }
}
