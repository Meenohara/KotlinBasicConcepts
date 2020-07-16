package classes

import java.util.*

//class careerProfile(var firstName :String, var lastName :String)//all these 3 are allowed formats
//class careerProfile internal constructor(var firstName :String, var lastName :String)
class careerProfile constructor(var firstName :String , var lastName :String, var totalExp : Float)
{
    //println("What's going on?")//Expecting member declaration?//Below code helped
    //TODO 1 Is it possible to pass a function as a parameter in primary constructor?
    //TODO 2 Passing a class as a parameter in
    //TODO 3 Too many constructors, all called, is this not problematic if we are not wise while using it?
    //TODO 4 Is it a good idea to reverse what has been done in Primary Constructor just
    //in case not needed in subsequent constructor? is it even a good idea?
    val totalExperience = "First property: $totalExp".also(::println)
    get() = "$field" //called backing field
    val primConsString = "From Primary Constructor".also(::println)


    //modifiers allowed = protected and internal
    constructor(firstName :String, lastName :String): this(firstName, lastName, 7.8f)
    {
        println("$firstName $lastName's total experience is $totalExp")
        println("From Secondary Constructor")
    }

    //modifiers allowed = protected and internal
    constructor(firstName :String): this(firstName,"Stranger", 9.9f)
    {
        println("$firstName $lastName's total experience is $totalExp")
        println("From Tertiary Constructor")
    }
    var phoneNumber: Long = 0;

    class companyStint
    {
        var companyName = ""
        var joiningDate: Date = Date("1/1/2000");//TODO
        var skills =""
        var role =""
    }

    fun getFullName():String
    {
        return firstName+lastName;
    }

//a sub class for companies worked at? with name, years worked, dates, Project details etc?
    //should skills be in an array?
}