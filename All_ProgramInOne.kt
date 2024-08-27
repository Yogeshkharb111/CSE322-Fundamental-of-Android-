// fun main() {
//     println("Hello, world!!!")
//     println("Hello Yogesh")
// } 


// fun main(args:Array<String>) {
//     var a: Int
//     a=10
//     a=20
//     val b=10
//     var c: Int
//     c=a+b
//     print("------" + c + "------")
//     var A=20
//     var ___a=40
//     println(___a)
//     var String=44
//     println(String)
//     var Int=34
//     println(Int)
//     var Integer=46
//     print(Integer)
//     var $string=34
// }



// variables declared inside a function are only accessiable withhin that function

// fun greet() {
//    val message: String="Hello, kotlin!"
//     println(message)
// }

// Variables declared inside a class can be aceesd by all methods in the class

// fun Person() {
//    val name: String="Yogesh kharb"
//     val age: Int=30
//     fun displayInfo() {
//         println("Name: $name, Age: $age")
//     }
//     fun main(){
//         val person=Person()
//         person.displayInfo()
//     }
// }

// String Interpolatic with $ 

// fun main(){
//     val a=10
//     val b=20
//     val result = "Sum of $a a $b is $(a+b)"
//     print(result)
// }

// fun main(args:Array<String>) {
//     print("this is my \nfirst program \nof kotlin")
     
//  }

//  fun main(args: Array<String>) {
//     val letter: Char  // defining the Char variable
//     letter = 'A'  // assigning a value to the variable
//     print("$letter ")  // printing the value of the variable
//     print(letter)
// }

// fun main(args: Array<String>) {
//     // Array of integers
//     val numbers = arrayOf(1, 2, 3, 4, 5)
//     var words: Array<String> = arrayOf("Kotlin", "Java", "Python", "C++")
//     val squares = Array(5) { i -> i * i }
    
//     val firstNumber = numbers[0]
//     val secondWord = words[1] // Corrected from `word[1]` to `words[1]`
    
//     println("First number: $firstNumber")
//     println("Second word: $secondWord") // Corrected from `SecondNumber` to `secondWord`

//     numbers[0] = 10
//     words[1] = "Kotlin"
    
//     println("Modified first number: ${numbers[0]}")
//     println("Modified second word: ${words[1]}")
    
//     println("Words array using forEach: ")
//     words.forEach { word -> println(word) } // Corrected from `word` to `words`

//     println("Squares array using indices:")
//     for (i in squares.indices) { // Corrected from `square` to `squares`
//         println("Element at index $i is ${squares[i]}") // Corrected from `square[i]` to `squares[i]`
//     }
    
//     val size = numbers.size
//     println("Size of numbers array: $size")

//     // Checking if numbers array is not empty
//     if (numbers.isNotEmpty()) {
//         println("Numbers array is not empty")
//     }
// }


// import java.io.File
// import kotlin.math.*

// fun main() {
//     // 1. Basic Functions
//     println("Hello, Kotlin!")
//     val input = readLine() ?: "No input"

//     // 2. Mathematical Functions
//     val number = -42
//     println("Absolute value of $number is ${abs(number)}")
//     println("Square root of 25 is ${sqrt(25.0)}")

//     // 3. String Functions
//     val text = "  Kotlin is Fun!  "
//     println("Original: '$text'")
//     println("Trimmed: '${text.trim()}'")
//     println("Uppercase: '${text.toUpperCase()}'")

//     // 4. Collections and Sequences
//     val numbers = listOf(1, 2, 3, 4, 5)
//     val doubled = numbers.map { it * 2 }
//     println("Doubled numbers: $doubled")

//     val evenNumbers = numbers.filter { it % 2 == 0 }
//     println("Even numbers: $evenNumbers")

//     // 5. File I/O Functions
//     val file = File("example.txt")
//     file.writeText("Hello, File!")
//     val fileContent = file.readText()
//     println("File content: $fileContent")

//     // 6. Scope Functions
//     val person = Person("John", 30).apply {
//         age = 31
//         greet()
//     }

//     val length = text.let {
//         println("Original text: $it")
//         it.length
//     }
//     println("Length of trimmed text: $length")

//     // 7. Higher-Order Functions
//     val sum: (Int, Int) -> Int = { x, y -> x + y }
//     println("Sum of 5 and 10: ${sum(5, 10)}")

//     // 8. Extension Functions
//     println("Is 10 even? ${10.isEven()}")

//     // 9. Coroutines (Requires kotlinx.coroutines library)
//     // Uncomment below code if you have kotlinx.coroutines set up.
//     /*
//     runBlocking {
//         launch {
//             delay(1000L)
//             println("World!")
//         }
//         println("Hello,")
//     }
//     */

//     // 10. Reflection
//     println("Class of person: ${person::class}")

//     // 11. Companion Object Functions
//     Person.printPersonInfo(person)
// }

// // Extension Function Example
// fun Int.isEven(): Boolean = this % 2 == 0

// class Person(val name: String, var age: Int) {
//     fun greet() = println("Hello, my name is $name and I am $age years old.")

//     companion object {
//         fun printPersonInfo(person: Person) {
//             println("Person Info: Name = ${person.name}, Age = ${person.age}")
//         }
//     }
// }

// fun main(args:Array<String>) {
//     var a = 8
//     var b = 5
//     println(""" 
//         Which operation you want to do?
//         1. +
//         2. -
//         3. *
//         4. /
//     """.trimIndent())

//     val choice = readLine()

//     val res = when (choice) {
//         "1" -> a + b
//         "2" -> a - b
//         "3" -> a * b
//         "4" -> a / b
//         else -> "Not a valid operation"
//     }
//     println("Result: $res")
// }

fun main(args: Array<String>) {
    val a = arrayOf(3, 4, 5, 6, 7, 8, 9)
    var sum = 0

    for (i in a) {
        if (i % 2 == 0) {
            println(i)
            sum += i
        }
    }
    println("Sum of even numbers: $sum")
}

fun main(args: Array<String>) {
    val a = arrayOf(3, 4, 5, 6, 7, 8, 9)
    var sum = 0

    for (i in a) {
        if (i % 2 != 0) {
            println(i)
            sum += i
        }
    }
    println("Sum of odd numbers: $sum")
}

// functions


fun main(args: Array<String>){  
    sum()  
    println("code after sum")  
    greet()
    println(sum1(5,3))
    println(sum2(5,3))
    println("%.2f".format(sum3(10, 5)))
}  
fun greet(){
    println("Hello world")
}
fun sum1(a: Int,b: Int) : Int{
    return a+b;
}
fun sum(){  
    var num1 =5  
    var num2 = 6  
    println("sum = "+(num1+num2))  
}  
fun sum2(a: Int,b: Int) : Long{
    return (a+b).toLong();
}
fun sum3(a: Int,b: Int) : Double{
    val x : Double= (a+b).toDouble()
    return x
}

var count = 0  
fun rec(){  
    count++;  
    if(count<=5){  
        println("hello "+count);  
        rec();  
    }  
}  
fun main(args: Array<String>) {  
    rec();  
}  
var count=0
fun rec(n: Int){
    if(n==0){
        return 1;
    }
    println("Hello world")
    rec(n-1)
}
fun main(args : Array<String>){
    rec(5)
}

// fint a factorial of n numbers using recursion
// find the sum of n numbers using recursion
// find the sum of even numbers from 1 to n using recursion

