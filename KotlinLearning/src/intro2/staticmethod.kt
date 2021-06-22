package intro2

import java.lang.RuntimeException

object Util
{
    fun getNumberOfCore() =4
}

open class Car(val year: Int, initialColor: String)
{   // TODO NOTE without the preceding val or var ot cannot be considered a property
    //Here initialColor is just a parameter passed

    open var color = initialColor //Is this a field or property?
    //It is filed and property can be assigned to it
    //get() = field
        get() {
        //experimenting
            println("Getter called from Car class")
        return field
    }
    //private set(value: String)//Private setters are not allowed for open properties
    set(value: String)
    {
       if(value=="")
       {
           println("impossiblecase")
       }
    }

    companion object forProvidingStatic
    {
        fun kind()
        {
            println("kind called ...")
        }
    }
    fun drive(){ println("driving")}

}

class Celerio(year: Int, initialColor: String): Car(year, initialColor)
{
    override var color = "Silver"
    get(){return "$field from Derived class"}
}


fun main(){
println(Util.getNumberOfCore())//static method on Util class
    val car = Car(2017, "Silky Silver")
    println(car.year)
    //println(car.initialColor)//Unresolved reference: initialColor because it is not a property
    println(car.color)

    val redCar = Car(2006, "Red")
    println(redCar.color) //this is calling your get method
    redCar.color = "" //this is calling your set method
    //TODO note that passing "" does nt print the same statement impossiblecase
    val futureCar = Car(2029, "")
    println(futureCar.color)

    println(car.drive())
    Car.kind()
    val reference = Car.forProvidingStatic
    //val reference = Car.Companion//if the companion object was not named

    val celerio3 = Celerio(2029, "Blue")
    println(celerio3.color)
    celerio3.year

    //val celerio:Celerio = Car(2025, "Blue") //TODO Investigate is t not child obj = new parent()?
   /* val celerio2: Celerio= Car(2025, "Blue") as Celerio
   // class intro2.Car cannot be cast to class intro2.Celerio (intro2.Car and intro2.Celerio are in unnamed module of loader 'app')
    celerio2.color
    celerio2.year*/


}