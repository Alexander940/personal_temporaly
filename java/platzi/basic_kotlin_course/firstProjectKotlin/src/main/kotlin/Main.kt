const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Maria"
    println(nombre)
    println(PI)
    
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}