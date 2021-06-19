for (i in 1..100){
        if((i% 3 ==0) && (i % 5== 0)) {println("FizzBuzz")}
        else if (i % 3 == 0) {println("Fizz")}
        else if(i % 5== 0){println("Buzz")}
        else {println(i)}
    }


fun reverse(str: String): String {
    var reverse = ""
 
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
 
    return reverse
}
 
fun main() {
    var str = "Good Food"
 
    var reverse = reverse(str)
    println(reverse)
}
