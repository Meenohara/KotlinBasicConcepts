package classes

/*fun main()
{
    val x = FavFood()
    val y = FavFood()
}

class FavFood{
    var name = "unknown"
    var ingredients = mutableListOf<String>()
}
*///Non Singleton

fun main()
{
    println(FavFood.name)
    FavFood.name= "Idli"
    println(FavFood.name)
    doStuff()
    println(FavFood.name)
    FavFood.ingredients.add("Eggs")
    println(FavFood.ingredients.first())

    println(FavFood==FavFood)//one way of checking singleton
}

fun doStuff()
{
    FavFood.name = "Birinj"
}

object FavFood{
    var name = "unknown"
    var ingredients = mutableListOf<String>()
}