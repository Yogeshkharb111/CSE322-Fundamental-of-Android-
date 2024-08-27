// if else

fun main(args: Array<String>) {  
    val num1 = 10  
    val num2 =20  
    val result = if (num1 > num2) {  
        "$num1 is greater than $num2"  
    } else {  
        "$num1 is smaller than $num2"  
    }  
    println(result)  
}  

fun main(args: Array<String>) {  
    val num = 10  
    val result = if (num > 0){  
        "$num is positive"  
    }else if(num < 0){  
        "$num is negative"  
    }else{  
        "$num is zero"  
    }  
    println(result)  
}  

// Using when make calculator 

fun main(args:Array<String>) {
    var a = 8
    var b = 5
    println(""" 
        Which operation you want to do?
        1. +
        2. -
        3. *
        4. /
    """.trimIndent())

    val choice = readLine()

    val res = when (choice) {
        "1" -> a + b
        "2" -> a - b
        "3" -> a * b
        "4" -> a / b
        else -> "Not a valid operation"
    }
    println("Result: $res")
}

// for loop

fun main(args : Array<String>) {  
    val marks = arrayOf(80,85,60,90,70)  
    for(i in marks){  
        println(i)  
    }  
}  

fun main(args : Array<String>) {  
     
    val marks = arrayOf(80,85,60,90,70)  
    for(item in marks.indices)  
       println("marks[$item]: "+ marks[item])  
}  

// calculate sum of odd numbers in an array

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

// calculate sum of even numbers in an array

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

// while loop

fun main(args: Array<String>){  
    var i = 1  
    while (i<=5){  
        println(i)  
        i++  
    }  
}  

// do while loop

fun main(args: Array<String>){  
    var i = 1  
    do {  
        println(i)  
        i++  
    }  
    while (i<=5);  
}  

fun main(args: Array<String>){  
    var i = 6  
    do {  
        println(i)  
        i++  
    }  
    while (i<=5);  
}  

// brwak statement 

fun main(args: Array<String>) {  
    for (i in 1..5) {  
        if (i == 3) {  
            break  
        }  
        println(i)  
    }  
}  