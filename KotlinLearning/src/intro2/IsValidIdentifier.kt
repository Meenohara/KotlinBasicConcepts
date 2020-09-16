package intro2

fun isValidIdentifier(s:String) : Boolean
{
    //TODO
 //only letters and underscores allowed
    // digits with underscores and/or letters
//use startsWith() for checking letter or underscore if no return false
    //check for presence of special characters return false
    //check for all digits return false
    return true
}

fun main(args: Array<String>)
{
    println(isValidIdentifier("name"))
    println(isValidIdentifier("_name"))
    println(isValidIdentifier("_12"))
    println(isValidIdentifier(""))
    println(isValidIdentifier("012"))
    println(isValidIdentifier("no$"))

}