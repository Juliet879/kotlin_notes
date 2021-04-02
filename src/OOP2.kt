fun main() {

    var calc = Calculator()
    println(calc.add(40,12))
    println(calc.sub(70,22))



}

class Calculator(){
        fun add(num1:Int,num2:Int):Int{
            return num1 + num2
        }
    fun sub(num1:Int,num2:Int):Int{
        return num1 - num2
    }
    }

