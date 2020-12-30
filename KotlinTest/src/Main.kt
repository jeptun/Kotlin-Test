import kotlin.math.sqrt

    fun main(args: Array<String>) {
        println("Vitej v kalkulacce")
        var pokracovat = "ano"
        while (pokracovat=="ano") {
            println("Zadej prvni cislo")
            val a = readLine()!!.toDouble()
            println("Zadej druhe cislo")
            val b = readLine()!!.toDouble()
            println("Zvolte si operaci:")
            println("1 - sčítání")
            println("2 - odčítání")
            println("3 - násobení")
            println("4 - dělení")
            println("5 - mocnina")
            println("6 - odmocnina prvniho cisla")
            println("7 - odmocnina druheho cisla")
            val volba = readLine()!!.toInt()
            var vysledek: Double = 0.0
            when (volba) {
                1 -> vysledek = a + b
                2 -> vysledek = a - b
                3 -> vysledek = a * b
                4 -> vysledek = a / b
                5 -> vysledek = a * a
                6 -> vysledek = sqrt(a)
                7 -> vysledek = sqrt(b)
            }
            if ((volba > 0) && (volba < 8)) {
                println("Vysledek: $vysledek")
            } else {
                println("Neplatna volba")
            }
            println("Přejete si zadat další příklad? [ano/ne]")
            pokracovat = readLine()!!
        }
    }

