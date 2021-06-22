package intro2

fun main()
{
    fun process(input: Any)
    {
        when(input)
        {
            1 -> println("One!")
            2 -> println("Two!")
            7,8 -> println("Seven or Eight!")
            is String -> println("$input is of length $input.length")
            else -> println("Not a natural number")
        }
    }
    process(1)
    process(0)
    process(2)
    process(7)
    process(8)
    process(String())
    process("We are glad to onboard you!")
}