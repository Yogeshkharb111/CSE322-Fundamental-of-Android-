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

// recursion and fucntion


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

// 1. Factorial of a Number Using Recursion

fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1 
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    println("Factorial of $number is: ${factorial(number)}")
}

// 2. Sum of First n Numbers Using Recursion

fun sum(n: Int): Int {
    return if (n == 0) {
        0 
    } else {
        n + sum(n - 1) 
    }
}

fun main() {
    val number = 5 
    println("Sum of first $number numbers is: ${sum(number)}")
}


// 3. Sum of Even Numbers from 1 to n Using Recursion

fun sumOfEvens(n: Int): Int {
    return if (n <= 0) {
        0 
    } else if (n % 2 == 0) {
        n + sumOfEvens(n - 2) 
    } else {
        sumOfEvens(n - 1) 
    }
}

fun main() {
    val number = 10 
    println("Sum of even numbers from 1 to $number is: ${sumOfEvens(number)}")
}

