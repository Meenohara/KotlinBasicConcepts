package intro2

fun max(vararg numbers:Int) =
        numbers.reduce { max, e -> if(max > e) max else e}

//TODO//write for arithsum

fun main(){
    println(max(1,2))
    println(max(7,3,9,4))

    val values = intArrayOf(4, 5, 23, 2)

    //println(max(values))//gives error fixed below
    println(max(1,2,3,*values,9, 2))//spread operator used//TODO learn it
}