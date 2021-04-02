fun main() {
    loop()
    numberloop()
    new()
}

// (->)
fun loop() {
    var namesArray = arrayOf("Juliet","Sarah","Pamera","Kay","Hunter","Jane","Wato")
    namesArray.forEach { name->
        println(name)
    }
}

fun numberloop() {
    var ageArray = arrayOf(21,35,5,34,65,32,21)
    ageArray.forEach { age->
        var x = age+1
        println(x)
    }
}
//another looping method
fun new() {
    var namesArray = arrayOf("Juliet","Sarah","Pamera","Kay","Hunter","Jane","Wato")

    var output = "["
    for (name in namesArray){
        output+=", "
    }
    output+="]"
    println(output)
}