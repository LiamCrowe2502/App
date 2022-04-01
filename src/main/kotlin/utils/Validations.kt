package utils

import scanner
import java.util.*

class Validations {
    fun validator() {
        var number: Int
        do {
            print("Please enter a positive number: ")
            while (!scanner.hasNextInt()) {
                val input: String = scanner.next()
                System.out.printf("\"%s\" is not a valid number.%n", input)
            }
            number = scanner.nextInt()
        } while (number > 0)
    }
}