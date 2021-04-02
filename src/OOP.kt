fun main() {
//    var gari = Car("Toyota","Prado","KAC 123",0)
//    gari.start()
//    println(gari.registration)
//    gari.accelerate(50)
//    println(gari.speed)
//    gari.carName()
//    gari.deccelerate(20)
//    println(gari.speed)
//    gari.hoot()



//    var benz = Car("Mercedes Benz","E250","AEG 250", 0)
//    benz.start()
//    println(benz.speed)
//    benz.accelerate(100)
//    benz.accelerate(50)
//    println(benz.speed)
//    benz.carName()
//    benz.hoot()


//    var bic = BiroPen()
//    bic.write("I live in Nairobi")

    var janet = Registration("Janet Museveni",21,"Kampala","Senior High")
    println(janet.name)
    println(janet)

    var alexa = Registration("Alexa Makhula",22,"Nairobi","College")
    println(alexa.toString())
    println(alexa.equals(janet))
}
//a class is a template
class Car(var make:String, var model:String,var registration:String,var speed:Int ){
    fun start(){
        println("I am starting ,vroooom")
    }

  //  accelerate is a behaviour
    fun accelerate(acceleration : Int): Int {
        speed = speed + acceleration
        return speed

    }

    fun deccelerate(acceleration : Int): Int {
        speed = speed - acceleration
        return speed

    }

    fun carName(){
        println("$make $model")
    }

    fun hoot(){
        println("Peeeeeeep")
    }


}
class BiroPen(){
    fun write(writting:String){
        println(writting)
    }
}

data class Registration (var name:String,var age:Int,var location:String,var educationLevel:String){

}























//functions are used to represent how an object can have a behavior
//You cannot pass parameters to something that's not a behavior but just functions
//    You do not need an invoke operator when calling the attribute