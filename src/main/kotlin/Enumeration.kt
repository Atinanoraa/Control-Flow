fun main (){
    val colors: Array<Color> = enumValues<Color>()
    colors.forEach { color ->
        println(color)
    }
    val color : Color = enumValueOf("GOLD")
    println("Color is $color")
}
enum class Color(val value : Int){
    COKLAT (0x964B00),
    GOLD (0xFFD700),
    BLUE (0x0000FF),
}
