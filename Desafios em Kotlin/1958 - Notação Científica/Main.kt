import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextDouble()

    System.out.printf("%+.4E%n", x)

    scan.close()
}
