package kyu6

fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a == null || b == null) return false

    // Проверяем, имеют ли массивы одинаковую длину
    if (a.size != b.size) return false

    // Создаем mutableMap для подсчета кратности элементов массива a
    val countsA = mutableMapOf<Int, Int>()

    // Заполняем countsA
    for (num in b) {
        countsA[num] = countsA.getOrDefault(num, 0) + 1
    }

    // Проверяем, что квадраты элементов массива b присутствуют в countsA с правильной кратностью
    for (num in a) {
        val square = num * num
        if (countsA.containsKey(square) && countsA[square]!! > 0) {
            countsA[square] = countsA[square]!! - 1
        } else {
            return false
        }
    }

    return true
}