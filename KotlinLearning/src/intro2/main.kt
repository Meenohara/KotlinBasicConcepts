package intro2

fun main() {
var name = "Meena M"
    println(name.length)
var naam : String = "Meena Murthy"
    println(naam.decapitalize()) //decapitalizes only first word
var yoB:Int = 1980
    println(yoB)
val age:Byte = 40 // 8-bit signed integer
val professionalexperience: Short = 6 // 16-bit signed integer
    println("My professional experience of "+professionalexperience+" years is valuable")
val yearofgraduation : Int = 2002 // 32-bit signed integer
val phonenumber : Long = 9999999444 // 64-bit signed integer
val height: Float = 5.3f //32-bit floating point number
val myDouble: Double = 64.00 //64-bit floating point number
// all of the above extend Number() class
//therefore the above are objects

    println("age.toLong()::class is "+age.toLong()::class)
    println("age.toDouble()::class is "+age.toDouble()::class)
    println("What class does phonenumber belong to: "+phonenumber::class)

    val bigLong: Long = 1_000_000_000 //underscores only for readability
    println(bigLong)

    val newInt = yearofgraduation +12 //val CANNOT be reassigned
    println(newInt)
    var n1 = yearofgraduation.plus(12) //var CAN be reassigned
    println(n1)
    n1  = yearofgraduation +12
    println(n1)
    n1 = yearofgraduation.minus(12) //var CAN be reassigned
    println("Minus 12 is "+n1)
    n1 = yearofgraduation.times(12) //var CAN be reassigned
    println(n1)

    val c:Char = 'x'
    val c1:Char = '\t'
    val c2:Char ='\n'
    println("\u0394")
    println(c)
    println("tab"+c1+"tab")
    println("newline"+c2+"newline")

    var foo: String = "yes"
    var fooc: Char = 'y'

    var message: String = """
        Twinkle Twinkle
        Little Star
        How I wonder
        What you are
    """.trimIndent()

     println(message)

    val rhyme: String = """
        Ring Ringa Roses
         Pocket full of posies
         A-tishoo! A-tishoo!
         We all fall down
    """.trimMargin()
    println(rhyme)
    println("Nursery Rhyme $rhyme \n $message")

    val p1 = 7;
    var p2 = 11;
    println(p1!=p2)
    println(p1==p2)//Structural equality
    p2 = 7;
    println(p1==p2)
    //Notice that val and var are being compared
    println(p1===p2)//Referential equality
    //Both are same at run time for numbers, chars and boolean

    var g = Company("Google")
    var f = Company("Google")
//Referential equality more relevant with Objects
    println(g!==f)
    println(g===f)


    var nonull: String = "Can not be null ever"
    //nonull =null //this is not allowed
    val len1 = nonull.length //? not necessary here as nonull is never null value
    nonull.drop(2);

    var canNull: String? = "Can have null value"
    //canNull = null //for testing
    val len2 = canNull?.length
    val len4: Int?  = canNull?.length
    //val len5: Int  = canNull?.length//Type mismatch required int fount int?
    val len6: Int  = if(canNull!=null) canNull.length else 0 //because null is checked for
    var len3 = if (canNull != null) canNull.length else 0//because null is checked for
    //? not needed here because null has already been checked for by if condition
    val len7:Int = canNull?.length?:0 //because null is checked for using elvis operator?:
    val len8:Int = canNull?.substring(0,3)?.length?:0//? must be applied to substring too and any method that gets added in this line
    canNull?.drop(2);//gave error when canNull = null
    //TODO Investigate ?. ?:

    var myage: Int? =40
    myage = null

    var fb:Company? = Company("Facebook")
    fb = null

    var nooo:String? = "No"
    val lengno1 = nooo?.substring(2)?.length
    //val lengno2 = nooo?.substring(3)?.length //Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
                                                     // String index out of range: -1

    //KOTLIN FUNCTIONS
    //**********************************************************************
    comeBack()
   var p = returnUnit()
    println(p)
   var q = returnDefault()
    println(q)

    nestedFunction()
    singleLine()
    ifelse(13)
    ifelse(23)
    awards(employeeName = "Meena Murthy", accolades = "Best Employee Award",
        meritCriteria = "Smartest Performing Employee", peoplesVote = "Best Coach")
    //awards(employeeName = "Meena Murthy", "Best Employee Award",
       // meritCriteria = "Women Techmaker Advocate", peoplesVote = "Best Coach")
    //gives error Mixing named and positioned arguments is not allowed
    payPacket(year=2020, varPayinLakhs = 4.0f, perks="Medical Insurance")
    //alt enter will help put arguments in separate lines
    //alt enter also helps with adding argument names if not already there
    payPacket(
        basicPayinLakhs= 15.4f,
        year=2021,
        varPayinLakhs = 5.0f,
        perks="Medical Insurance, pick and drop in a plush car"
    )
    payPacket(
        year=2022,
        varPayinLakhs = 20.0f,
        basicPayinLakhs= 25.4f,
        perks="Medical Insurance, home, paid world travel"
    )
    //order has been changed but no error

    ctc()//ctc overloaded with default perks, called with supplying no arguments
    ctc(
        "Meena",
        "World Travel","Pick and Drop in a plush car",
        "Car maintenance and fuel charges",
        "Luxurious Car",
        "Condominium"
    )
//TODO want to pass only perks here and want the default value for empName
    ctc(
        "Meena",
        "World Travel","Pick and Drop in a plush car",
        "Car maintenance and fuel charges",
        "Luxurious Car",
        "Condominium"
    )
//unable to do same with varargs
    ctc(
            perks="World Travel"
    )

    println(returnEncouragement())
}

class Company(var name: String)

fun comeBack()
{
    println("Bounce Back")
}

fun returnUnit() :Unit
{
    println("By default Unit is the return type")
}

fun returnDefault()
{
    /*Unit in Kotlin corresponds to the void in Java.
    Like void, Unit is the return type of any function that does not return any meaningful value,
    and it is optional to mention the Unit as the return type.
    But unlike void, Unit is a real class (Singleton) with only one instance.*/
    println("By default Unit is the return type, specified or not")
}

fun returnEncouragement():String
{
    return "You are doing good!"
}

fun nestedFunction()
{
    println("Nested function below")
    fun nest()
    {
        println("I am a nested function")
    }
    println("Calling a nested function")
    nest()
}

fun singleLine() = println("I am a Single Line Expression function")

fun ifelse(age: Int) = if(age>=18) println("Major at $age") else println("Minor at $age")

fun awards(employeeName: String, accolades: String, meritCriteria: String, peoplesVote: String )
{
    println("$employeeName has won $accolades for being a $meritCriteria and $peoplesVote");
}

fun payPacket(employeeName: String= "Meena Murthy", basicPayinLakhs:Float=11.1f, year: Int, varPayinLakhs: Float, perks:String)
{
    println("$employeeName's basic pay is $basicPayinLakhs in $year and Variable Pay is $varPayinLakhs with perks $perks")
}

fun ctc(empName:String= "Meena Murthy", vararg perks: String)
{
    //var args does not support default arguments!
    //println("$empName's gorgeous perks are $perks")//$perks gives out put [Ljava.lang.String;@45283ce2
    //correct way of printing
    println("$empName's gorgeous perks are:")
    perks.forEach { println(it) }

}

fun ctc(empName:String= "Meena Murthy", perks: String="Medical Insurance")
{
    //function ctc overloaded to accommodate default perk value
    println("$empName's gorgeous perks are: $perks")
}

//Kotlin is statically typed
//A language is statically-typed if the type of a variable is known at compile-time instead of at run-time.
//but the types can be omitted therefore concise similar to dynamically typed languages
//safe with compiler errors
//Both FP and OOP
