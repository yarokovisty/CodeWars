package kyu8

fun points(games: List<String>): Int {
    // Enter the logic here!
    var points = 0
    games.forEach {
        val yourTeam = it.substringBefore(':').toInt()
        val oppositeTeam = it.substringAfter(':').toInt()

        if (yourTeam > oppositeTeam) points+=3
        else if (yourTeam == oppositeTeam) points++
    }

    return points
}