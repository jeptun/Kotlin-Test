
fun main(args: Array<String>)
{

    var pole = arrayOf<Int>()
    for (i in 10 downTo 1)
    {
        pole += i
    }
    for (i in pole)
    {
        println("$i ")
    }
    var brouci = arrayOf("Pytlik", "Brčálník", "Šmehula")
    brouci.sort()
    for (brouk in brouci)
    println(brouk)
}