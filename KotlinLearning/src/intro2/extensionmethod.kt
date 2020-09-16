package intro2
//extension methods cannot be overloaded
fun main()
{
fun String.shout()= toUpperCase()

val greet = "hello"

println(greet.shout())
}