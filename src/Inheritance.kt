fun main() {
    var banker = Banker("Grace",26)

    banker.countMoney(listOf(200,500,100))

    var doctor = Doctor("Edwin",34)

    doctor.treatPatient("Janet","Malaria")

}
open class Person(var name: String, var age: Int){
    fun talk(words: String) {
        println(words)
    }

    fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzzzz")
    }

}

class Banker( name: String,  age: Int) :Person(name,age){
    fun countMoney(notes: List<Int>): Int {
        var sum = 0;
        for (note in notes) {
            sum += note
        }
        return sum
    }
}

class Doctor( name: String,  age: Int) :Person(name,age){
    fun treatPatient(patient: String, disease: String) {
        println("Treat $patient for $disease")
    }
}

class Farmer( name: String,  age: Int) :Person(name,age){
    fun cultivateLand() {
        println("Dig dig dig")
    }
}
