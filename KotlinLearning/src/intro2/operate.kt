package intro2

class Robot
{
    val right = "Right"
    val left = "Left"

    infix fun turns(direction: String)
    {
        println("turns $direction")
    }
}
fun operate(func: (Robot) -> Unit)
{
    println("called...")
    val robot = Robot()

    with(robot)
    {
        func(robot)
    }
}
fun main()
{
/*
operate {
    it turns intro2.Robot.right
    it turns left
}*///TODO Investigate this
}