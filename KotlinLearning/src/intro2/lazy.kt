package intro2

fun compute(n: Int) : Int
{
    println("called...")
    return n
}

fun main()
{
    val x = 44

    if(x>5 && compute(4) >7)//short circuit happens so "called..." does not get printed
        println("result...")

    val temp = compute(4)
    if(x>5 && temp >7)//compute is called but a waste of resources that could have been saved by short circuiting
        println("result...")

    val temp2  by lazy { compute(44) }
    //TODO why not val temp = lazy compute(4)
    if(x>5 && temp2 >7)//compute is called but a waste of resources that could have been saved by short circuiting
        println("result...")
}