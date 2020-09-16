package intro2

fun main()
{

    val names = listOf("Tom", "Jerry", "Spike")

    for(x in 1..10)
{
    println(x)
}
    for(x in 1 until 10)
    {
        println(x)
    }

    for(x in 1..10 step 2)
    {
        println(x)
    }

    for(x in 10 downTo 1)
    {
        println(x)
    }

    for(x in 10 downTo 1 step 2)
    {
        println(x)
    }

    for(name in names)
    {
        println(name)
    }

    for(index in names.indices)
    {
        println(index)
    }
    for(index in names.indices)
    {
        println("$index ${names[index]}")
    }
    //TODO what is the difference between above and below?
    for(index in names.indices)
    {
        println("$index ${names.get(index)}")
    }
}
