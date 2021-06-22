package intro2

class Pizza
{
    infix fun spread(item: String)
    {
        //println("spread $item")
        println("top with $item")
    }
}
fun main()
{
val pizza = Pizza()

pizza spread "Cheese"
}


//no infix operator version
/*
class Pizza
{
    fun spread(item: String)
    {
        println("spread $item")
    }
}
fun main()
{
    val pizza = Pizza()

    pizza.spread("Cheeeeeese")
}*/