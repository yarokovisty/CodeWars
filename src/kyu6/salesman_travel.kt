package kyu6

fun travel(r:String, zipcode:String):String {
    if (zipcode == "") return ":/"

    val addresses = r.split(",")
    val streets = mutableListOf<String>()
    val numbers = mutableListOf<String>()

    for (address in addresses){
        val parts = address.trim().split(" ")
        val partSize = parts.size
        val currentZipcode = "${parts[partSize - 2]} ${parts[partSize - 1]}"

        if (currentZipcode == zipcode) {
            val street = parts.subList(1, parts.size - 2).joinToString(" ")
            val number = parts[0]
            streets.add(street)
            numbers.add(number)
        }


    }

    val resultStreets = streets.joinToString(",")
    val resultNumbers = numbers.joinToString(",")

    return if (resultStreets.isNotEmpty()) {
        "$zipcode:$resultStreets/$resultNumbers"
    } else {
        "$zipcode:/"
    }
}