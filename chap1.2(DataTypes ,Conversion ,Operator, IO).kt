// Kotlin Data Type
// Data type (basic type) refers to type and size of data associated with variables and functions. Data type is used for declaration of memory location of variable which determines the features of data.

// In Kotlin, everything is an object, which means we can call member function and properties on any variable.

// Kotlin built in data type are categorized as following different categories:

// Number
// Character
// Boolean
// Array
// String


// Number Types
// Number types of data are those which hold only number type data variables. It is further categorized into different Integer and Floating point.

// Data Type	Bit Width (Size)	Data Range
// Byte	8 bit	-128 to 127
// Short	16 bit	-32768 to 32767
// Int	32 bit	-2,147,483,648 to 2,147,483,647
// Long	64 bit	-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
// Float	32 bit	1.40129846432481707e-45 to 3.40282346638528860e+38
// Double	64 bit	4.94065645841246544e-324 to 1.79769313486231570e+308

// program

// val value1 = 'A'  
// //or  
// val  value2: Char  
// value2= 'A'  

// val text1 ="Hello, JavaTpoint"  
// //or  
// val text2 ="Hello, JavaTpoint\n"  
// //or  
// val text3 ="Hello, \nJavaTpoint"  

// type conversion

// var value1 = 10  
// val value2: Long = value1  //Compile error, type mismatch  

// var value1 = 10  
// val value2: Long = value1.toLong()  

// The list of helper functions used for numeric conversion in Kotlin is given below:

// toByte()
// toShort()
// toInt()
// toLong()
// toFloat()
// toDouble()
// toChar()

// fun main(args : Array<String>) {  
//     var value1 = 100  
//     val value2: Long =value1.toLong()  
//     println(value2)  
// }  

// operator 

// Kotlin Operator
// Operators are special characters which perform operation on operands (values or variable).There are various kind of operators available in Kotlin.

// Arithmetic operator
// Relation operator
// Assignment operator
// Unary operator
// Bitwise operation
// Logical operator

// Arithmetic Operator
// Arithmetic operators are used to perform basic mathematical operations such as addition (+), subtraction (-), multiplication (*), division (/) etc.

// Operator	Description	Expression	Translate to
// +	Addition	a+b	a.plus(b)
// -	Subtraction	a-b	a.minus(b)
// *	Multiply	a*b	a.times(b)
// /	Division	a/b	a.div(b)
// %	Modulus	a%b	a.rem(b)

fun main(args : Array<String>) {  
    var a=10;  
    var b=5;  
    println(a+b);  
    println(a-b);  
    println(a*b);  
    println(a/b);  
    println(a%b);  
    }  


// Relation Operator

fun main(args : Array<String>) {  
    val a = 5  
    val b = 10  
    val max = if (a > b) {  
        println("a is greater than b.")  
        a  
    } else{  
        println("b is greater than a.")  
        b  
    }  
    println("max = $max")  
}  

// Assignment operator

fun main(args : Array<String>) {  
  
    var a =20;var b=5  
    a+=b  
    println("a+=b :"+ a)  
    a-=b  
    println("a-=b :"+ a)  
    a*=b  
    println("a*=b :"+ a)  
    a/=b  
    println("a/=b :"+ a)  
    a%=b  
    println("a%=b :"+ a)  
  
}  

// Unary Operator

fun main(args: Array<String>){  
    var a=10  
    var b=5  
    var flag = true  
    println("+a :"+ +a)  
    println("-b :"+ -b)  
    println("++a :"+ ++a)  
    println("--b :"+ --b)  
    println("!flag :"+ !flag)  
}  

// logical operator

fun main(args: Array<String>){  
    var a=10  
    var b=5  
    var c=15  
    var flag = false  
    var result: Boolean  
    result = (a>b) && (a>c)  
    println("(a>b) && (a>c) :"+ result)  
    result = (a>b) || (a>c)  
    println("(a>b) || (a>c) :"+ result)  
    result = !flag  
    println("!flag :"+ result)  
  
}  

// Bitwise operator 

fun main(args: Array<String>){  
    var a=10  
    var b=2  
  
    println("a.shl(b): "+a.shl(b))  
    println("a.shr(b): "+a.shr(b))  
    println("a.ushr(b:) "+a.ushr(b))  
    println("a.and(b): "+a.and(b))  
    println("a.or(b): "+a.or(b))  
    println("a.xor(b): "+a.xor(b))  
    println("a.inv(): "+a.inv())  
  
}  

// Input /output

fun main(args: Array<String>) {  
    println("Hello World!")  
    print("Welcome to  lpu")  
}  

fun main(args: Array<String>){  
    println(10)  
    println("Welcome to  lpu")  
    print(20)  
    print("Hello")  
}  

fun main(args: Array<String>) {  
    println("Enter your name")  
    val name = readLine()  
    println("Enter your age")  
    var age: Int =Integer.valueOf(readLine())  
    println("Your name is $name and your age is $age")  
}  


import java.util.Scanner  
fun main(args: Array<String>) {  
    val read = Scanner(System.`in`)  
    println("Enter your age")  
    var age = read.nextInt()  
    println("Your input age is "+age)  
}  

// Multiline comment 

fun main(args: Array<String>) {  
    /* this statement 
       is used 
       for print */  
        println("Hello World!")  
    }  