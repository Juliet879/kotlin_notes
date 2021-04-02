fun main() {
//    print(joinString("Wanita","Blue"))
//    print(meClass("Juliet","Lovelace"))


    var continents = "Africa, America, Asia, Europe"
    var ans = continents.split("A")
    print(ans)


}
fun joinString(s1:String,s2:String):String {
    return s1 + " " + s2
}
fun meClass(name:String,stream:String): String {
    return "My name is " + name +  " from "  + stream
}
