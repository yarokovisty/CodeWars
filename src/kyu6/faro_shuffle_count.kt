package kyu6

object Kata {
    fun faroCycles(deckSize: Int): Int {
        val deck = MutableList(deckSize) { it + 1 }
        val deckChangeable = MutableList(deckSize) { it + 1 }
        var d : MutableList<Int>
        var half1 : MutableList<Int>
        var half2 : MutableList<Int>
        var shuffleCounter = 0
        val halfDeckSize = deckSize / 2

        while (true) {
            shuffleCounter++
            half1 = deckChangeable.subList(0, halfDeckSize).toMutableList()
            half2 = deckChangeable.subList(halfDeckSize, deckSize).toMutableList()
            deckChangeable.clear()

            for (i in 0..halfDeckSize-1) {
                deckChangeable.add(half1[i])
                deckChangeable.add(half2[i])
            }


            if (deckChangeable == deck) break
        }

        return shuffleCounter
    }
}