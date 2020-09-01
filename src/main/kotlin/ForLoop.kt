fun main() {
    val angka = 10.downTo(1) step 2
    angka.forEachIndexed { index, i ->
        println("Angka mu adalah $i menempati urutan ke-$index")
    }
}
/*fun main() {
    val angka = 1.rangeTo(20) step 5
    for ((index, value) in angka.withIndex()){
        println("Angka $value adalah urutan ke-$index")
    }
}
fun main() {
    val angka = 1..20 step 4
    for (x in angka){
        println("This number is $x")
    }
}*/