package classes

import java.lang.StringBuilder

class myFacets(var meMyself: String, var moreToMe: String = "More to Me") {
    val primConsString = "I am a $meMyself..... and there is $moreToMe".also(::println)
        get() = "$field......."//called backing field

    var meMy = "I am a $meMyself"
        get() = "$field"//called backing field

    //.also(::println) here :: is a member reference, function is being passed as a paramter
    //:: in Kotlin is about meta-programming, including method references, property references and class literals
        //TODO know about meta-programming

        private set(value) {    //can also be set to private
            //set(value) {
            field = value
        }

    val mTm = "There is $moreToMe"
        get() = "$field"//called backing field

    class emptyClass {   //TODO revisit this
        //TODO access tech in init?
        constructor(tech: String = "techSkills") {
            println("Inside empty class")
        }
    }

    constructor(meMyself: String) : this("Software Engineer", "More to Me") { //$meMyself is reflecting what was originally passed
        //on println in main the values set through this( is reflecting
        println("I am a $meMyself and ......there is $moreToMe")
    }

    /* constructor(moreToMe:  String):this("Software Engineer", "More to Me")
     {
         println("I am a $meMyself and there is $moreToMe")
     }*///Conflicting overload error because of previous constructor
    /*constructor(meMyself: String):this(meMyself, "More to Me")
    {
        println("I am a $meMyself and there is $moreToMe")
    }*///Allowed
    /*constructor(meMyself: String):this("Software Engineer", moreToMe)
    {
        println("I am a $meMyself and there is $moreToMe")
    }*///Cannot access moreToMe before superClass constructor has been called

    init {
        println("Smartist, Artist, Coder, Scientist, Healer")
        println(primConsString + ", ... lot More")
        var eC = emptyClass()
    }

    init {
        println("Phoenix")
    }

    fun getNewSkills(): String {
        var eh = "Energy Healer";
        var ca = "Cartoonist";
        return "$eh and $ca"
    }
}