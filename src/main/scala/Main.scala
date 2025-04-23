// scala2
// object Main extends App {
//     println("Hello, World!")
// }

// scala3
@main def main(): Unit = {
    println("Hello, World!")

    // variable
    val name: String = "Mike" // immutable
    var age          = 20     // mutable
    println(s"Hello, $name! You are $age years old.")
    age += 1
    println(s"Hello, $name! You are $age years old.")

    // if-else
    if age >= 18 then println(s"$name is an adult.")
    else println(s"$name is a minor.")

    // lists
    val fruites = List("apple", "banana", "orange")
    println(fruites(1)) // banana

    val prices = Map("apple" -> 1.0, "banana" -> 0.5, "orange" -> 0.75)
    println(prices("banana")) // 0.5

    // for
    val nums = List(1, 2, 3, 4, 5)
    for num <- nums do println(num)
    nums.foreach(num => println(num))

    // class
    class Person(val name: String, var age: Int) {
        def greet(): Unit = {
            println(s"Hello, my name is $name and I am $age years old.")
        }
    }

    val person = Person("John", 30)
    person.greet()

    // match
    val day = "Monday"
    day match
        case "Monday" | "Tuesday"  => println("It's a weekday.")
        case "Saturday" | "Sunday" => println("It's a weekend.")
        case _                     => println("Unknown day.")

    // function
    def add(x: Int, y: Int): Int = {
        x + y
    }
    println(add(2, 3)) // 5
}
