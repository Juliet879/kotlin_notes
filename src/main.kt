fun main() {
//    var answer = average(20,30,40)
//    println(answer)
//    var result = sum(20,10.5f)
//    println(result)
//    var greeting = introduction("Juliet",21)
//    println(greeting)
//    comparison()


}
fun average(a:Int, b:Int, c:Int):Int {
    var sum = a + b + c
    var divide = sum / 3

    return divide

}

fun sum (num1:Int,num2:Float):Float{
    var add = num1 + num2

    return add
}
fun introduction(name:String, age:Int):String{
    return "Hello my name is  $name  am $age years old."

}
fun comparison() {
    var name = "Juliet"
    var name2 = "Juliet"
    if (name.equals(name2)){
        print("equal")
    }
}
