import java.util.*

fun main(args: Array<String>) {
    
    tracos()

    println("")
    for (i in 0 until 39) {
        if (i == 0 || i == 38) {
            print("|")
        } else if (i == 10) {
            print("        Roberto                      ")
        }
    }

    espaco()

    println("")
    for (i in 0 until 39) {
        if (i == 0 || i == 38) {
            print("|")
        } else if (i == 10) {
            print("        5786                         ")
        }
    }

    espaco()

    println("")
    for (i in 0 until 39) {
        if (i == 0 || i == 38) {
            print("|")
        } else if (i == 10) {
            print("        UNIFEI                       ")
        }
    }

    println("")
    tracos()
    println("")
}

private fun espaco() {
    println("")
    for (i in 0 until 39) {
        if (i == 0 || i == 38) {
            print("|")
        } else {
            print(" ")
        }
    }
}

private fun tracos() {
    for (i in 0 until 39) {
        print("-")
    }
}