package intro


@JvmOverloads
fun product(a:Int =1, b: Int =1, c: Int =1):Int
{
    return a*b*c
}

fun main()
{
    product(c=5);//TODO Investigate calling this from a different file or package, did not work
}