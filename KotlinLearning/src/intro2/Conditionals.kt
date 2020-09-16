package intro2

import intro2.Color.*;
import java.lang.Exception

enum class Color{
    BLUE, RED, ORANGE, YELLOW, VIOLET, GREEN, INDIGO
}

fun main(){
   println(getDescription(ORANGE))
    println(respondToInput("What"))
}

fun getDescription(color: Color): String = when (color){
    BLUE -> "cold"
    ORANGE -> "mild"
    else -> "hot"
}//equivalent of Java switch

//Any expression can be used as a branch condition
fun mix(c1: Color, c2: Color) =
        {
            when(setOf(c1,c2))
            {
                setOf(RED, YELLOW) -> ORANGE
                setOf(YELLOW, BLUE) -> GREEN
                setOf(BLUE, VIOLET) -> INDIGO
                else -> throw Exception("Muddy color")
            }
        }

fun respondToInput(input:String) = when (input)
{
    "y", "yes" -> "I'm glad you agree"
    "n", "no" -> "I witness"
    else -> "Please explain more"
}

fun updateWeather(degrees: Int)
{
    val (description, colour) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        //RHS is boolean expression evaluation
        else -> "hot" to RED
    }
}

//TODO code later

open class Pet
{

}
class Cat : Pet(){ fun meow(){ println("meow")}}
class Dog : Pet(){ fun woof(){ println("woof")}}

/*
fun getSound(): String
{
    when(val pet = getMyFavouritePet())
    {
        is Cat -> pet.meow()
        is Dog -> pet.woof()//smart casting is happening on LHS
        //is is equivalent if instanceOf in Java
        //great replacement for multiple if else
        else -> "No pet"

    }
}
*///TODO
open class Animal(colour: String, age: Int) {
    init {
        println("Color is: $colour.")
        println("Age is: $age")
    }
}

class Dog1(colour: String, age: Int): Animal(colour, age) {

    fun woof() {
        println("Dog makes sound of woof")
    }
}

class Cat2(colour: String, age: Int): Animal(colour, age) {

    fun meow() {
        println("Cat makes sound of meow")
    }
}

class Horse(colour: String, age: Int): Animal(colour, age) {

    fun neigh() {
        println("Horse makes sound of neigh")
    }
}
