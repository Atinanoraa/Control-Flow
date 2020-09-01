fun main() {
    loop@ for (i in 1..5) {
        println("Outside Loop")
        for (j in 1..5) {
            println("Inside Loop")
            if ( j > 3) break@loop
        }
    }
}
/*fun main() {
    val listofchar = listOf('A', 'B', 'C', 'D', null, 'F')
    for (x in listofchar){
        if (x == null) break
        print("$x ")
    }
}
fun main() {
    val listofchar = listOf('A', 'B', null, 'D', null, null, 'G')
    for (x in listofchar){
        if (x == null) continue
        print("$x ")
    }
}
 */