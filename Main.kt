fun main() {
    println("Hello World")
   // exercise1()
   // exercise2()
   // exercise3()

}
/*
// TODO: 1.- Write a function called exercise1()
// that prints the numbers from 1 to 10 with
// println() and invoke it from main().
// look for how to make a "for" loop here:
// https://kotlinlang.org/docs/reference/control-flow.html

fun exercise1() {
    for (i in 1..10){
        println(i)
    }
}

// TODO: 2.- Uncomment this function:
 fun exercise2() {
    var month = 1
    while(month != 0) {
        println("Enter the number of the month (0 to finish)")
        val monthStr = readLine()
        if (month > 0 && month <= 12) {
            month = monthStr!!.toInt()
            when (month){
                1, 3, 5, 7, 8, 10, 12 -> print("El mes " + month + " tiene 31 días")
                4, 6, 9, 11 -> print("El mes " + month + " tiene 30 días")
                2 -> print("El mes " + month + " tiene 28 o 29 días")
            }
            // Don't worry about the !! yet. We will study it later
            // TODO: 2 write the number of days that has that month, using the "when" structure
            // You can read about it here:
            // https://kotlinlang.org/docs/reference/control-flow.html
            // take into account that some months have 30, others 31 and one 28 or 29.
            // Invoke the function from main()
        }
    }
}



// TODO: 3 Write a function called exercise3()
// that accepts a  number and returns a String
// that represents the corresponding NIF (number + letter)
// https://www.ordenacionjuego.es/en/calculo-digito-control
// https://kotlinlang.org/docs/reference/basic-types.html#arrays

fun exercise3(){

    println("Introduce NIF/DNI la parte númerica:")
    val dni = readLine()
    val n= dni!!.toInt()
    val n_letter = n % 23
    val array = arrayOf('T','R','W', 'A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E')
    println("La letra de tu DNI es : "+ array[n_letter])
    println("Tu DNI es : "+ dni+array[n_letter])

}
*/


// TODO: 4 Modify this function abbreviating it with "=" as return type
// (simplification 2)
// https://developer.android.com/kotlin/learn#simplifying
// Note: You can remove the : Int in the declaration
//fun countAs(str: String): Int {
//    val count = str.count { c -> c == 'a' }
//    return count
//}

    fun countAs(str: String): Int {
        return str.count { c -> c == 'a' }
    }

    fun stringMapper(str: String, mapper: (String) -> Int): Int {
        return mapper(str)
    }





/*
// TODO 5: Write a function called exercise5()
// In it you will invoke the function stringMapper declared above twice.
// The first one with a function that returns the number of characters
// and the second one with a function that returns the number of a’s.
// Print its results.


data class Reader(val name: String, val age: Int)
// TODO 6: Create a data class Book that has 2 parameters
// title as a String that can not be modified (read only)
// and reader as a Reader
fun assignReadersToBooks() {
    val reader1 = Reader("John", 23)
    val reader2 = Reader("Mary", 34)
    // TODO 6: Uncomment these sentences
    // val book1 = Book("The name of the wind", reader1)
    // book1.reader = reader2
}

// TODO 7: Write the body of this function
// That prints the length of the string parameter.
// If the string is null, print 0
fun printStringLength(string: String?) {
    // Body
}

// TODO 8: Write a method concatenate() that concatenates 2 Strings
// received as parameters.
// If a String is null, convert it to “”.
// This is the invocation:
// println("Concatenation: " + concatenate("hello", null))

 */