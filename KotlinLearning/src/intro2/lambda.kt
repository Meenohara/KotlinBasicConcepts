package intro2

fun main(){
val double ={ e: Int -> e*2 }

listOf(1,2,3,4,5,6)
        .filter { e -> e%2==0 }
        .map(double)
      //  .forEach{ e -> println(e)}//this line is also ok
        .forEach{println(it)}//ok when there is only one parameter
}