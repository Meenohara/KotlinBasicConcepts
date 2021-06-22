package intro2

fun main()
{
    for(i in 1..9)
    {
        print(i)
    }
    println()
    for(i in 1 until 9)
    {
        print(i)
    }
    var i=0
    do println("Hi") while (i++<=10)

    val perks = listOf("great salary", 26.0f, "Zenith")
    for(s in perks)
    {
        print(s)
        print("\t")
    }

    println()
    val map = mapOf(1 to "we", 2 to "want", 3 to "you")
    for((key, value) in map)
    {
        println("$key = $value")
    }

    println()
    val designation = listOf("Senior", "Software", "Developer")
    for((index, element) in designation.withIndex())
    {
        println("$index: $element")
    }

    //if (element in designation){}//getting unresolved reference
    //if (designation.contains(element)){}

    println()
//    print("with step i")
//    for(i in 9 downTo 1 step i.times(2))
    for(i in 9 downTo 1 step 2)
    {
        print(i)
    }

    println()
    for(ch in "Fnnfkd")
    {
        print(ch+1)
    }

    println()
    for(i in 'a'..'z') {//in operator for iteration
        print(i)
    }

    println()
    fun isLetter(c:Char) = c in 'a'..'z'|| c in 'A'..'Z'
    isLetter('q')//under the hood above equation is 'a'<=c&&c<='z'
    isLetter('?')//in operator to check belonging

    println()
    fun isNotDigit(c:Char) = c !in '0'..'9'
    println(isNotDigit('x'))

    fun recognize(c: Char) = when(c)
    {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        in '0' until '9' -> "It's a digit!" //9 is not checked for here '10' cannot be Char=
        else -> "I don't know.."
    }
//in a different data type startDate..endDate can also be checked for
    recognize('$')

    println("C++" in "Java".."Scala")//C is outside J to S
    println("Kotlin" in "Java".."Scala")//K is inside J to S
    println("Kotlin" in setOf("Java", "Scala"))
    //How this works under the hood?
    //"ball" in "a".."k"
    //"a"<= "ball" && "ball" <= "k"
    //"a".compareTo("ball")<=0 && "ball".compareTo("k") <=0
    //Strings are compared lexicographically

    val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    for(eachday in daysOfWeek.withIndex())
    {
       // eachday="Today"//to demonstrate that parameters always val by default
         println(eachday)
    }
    //Destructuring or Desconstructing
    for((i,eachday) in daysOfWeek.withIndex())
    {
        println("$i\t$eachday")
    }
}