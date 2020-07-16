package functions

fun max(a:Int, b:Int): Int = if(a > b) a else b
//converted using Convert to expression body
//the return statement looked like regular statement with return keyword in it
//{} have also been eliminated from the original

//Top level function
fun topLevel() =1

//Member function
class A
{
    fun member() = 2
}

//Local function = nested function?
fun other()
{
    fun local() = 3
}