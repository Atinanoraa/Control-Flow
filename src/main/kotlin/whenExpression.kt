fun main() {
    val anyType : Any = 1000L
    when (anyType){
        is Long -> println("the value has a long type")
        is Int -> println("the value has a int type")
        is Double -> println("the value has a double type")
        else -> println("undefined")
    }
}
