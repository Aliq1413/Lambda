fun main(){
    data class Students(val name: String, val age:Int, val height :Double)

    val   students = listOf(
        Students("Ali",25,165.0),
        Students("Khalid",30,173.0),
        Students("Ahmad",29,165.0),
        Students("Abdullah",22,166.0),
        Students("Saad",25,165.0),
        Students("Faisal",33,170.0),
        Students("Suid",29,165.0),
        Students("Bader",23,177.0),
        Students("Fahad",25,169.0),
        Students("Rashid",26,180.0),
        Students("Talal",25,165.0),
        Students("Nasser",27,161.0),
        Students("Aziz",31,165.0),
        Students("Anas",25,175.0),
        Students("Naif",21,177.0),
        Students("Rakan",32,162.0),
        Students("Qasim",28,166.0),
        Students("Sultan",25,180.0),
        Students("Nawaf",30,171.0),
        Students("Firas",34,170.0)
    )
    val highestMan  = students.maxByOrNull { it.height }
    println("The Highest Man is : ${highestMan!!.name} ")

    val olderMan = students.find {
        it.age >= 30
    }
    println("The older man is: ${olderMan!!.name} his age: ${olderMan!!.age}")

    val highestMen = students.filter {
        it.height >= 170.0
    }
    println("The tallest Men:")
    highestMen.forEach{
        println(it.name)
    }

    fun getAdviceFun(){
        println("you can got it")
    }
    getAdviceFun()
    val getAdvice = { println("If you fall seven, get up eight") }
    getAdvice()
    fun greetingFun( name: String ) : String{
        println("Hello $name!")
        return name
    }
    greetingFun("Rakan")
    val greeting = {name:String -> println("Hi $name!")}
    greeting("Alia")
    fun sumFun(x : Int, y : Int) : Int{
        var result = x + y
        println(result)
        return result
    }
    sumFun(2,7)
    val sum = {x: Int,y: Int -> x+y }
    println(sum(6,9))
}