package intro

fun main(){
    println(listOf('a', 'b', 'c').joinToString(separator="", prefix="(", postfix=")"))//(abc)
    println(listOf(1,2,3).joinToString(separator=",",postfix = "."))//1,2,3.
    println(listOf(1,2,3).joinToString(postfix = "."))//1, 2, 3.

    displaySeparator('*', 5)
    println()
    displaySeparator('*')
    println()
    displaySeparator(size=5)
    println()
    displaySeparator()
    println()
    displaySeparator(size=5, character = '*')
}

fun displaySeparator(character: Char ='*', size:Int =10)
{
    repeat(size)
    {
        print(character)
    }
}

fun sum(a:Int =0, b: Int =0, c:Int =0):Int
{
    return a+b+c
}

