package com.abifarhan.mycalculatorapp


fun main() {

    val listOfItems = listOf("Rafael", "Gina", "George", "James")
    val intItem = listOf(23,44,55,66)
    val finder = Finder(list = intItem)

    finder.findItem(23) {
        if (it == null) {
            println("Found item null")
        } else {
            println("you got it $it")
        }
    }
//    println(listOfItems.sorted())
//    for (i in 0 until finder)
}


class Finder(private val list: List<Any>) {
    fun findItem(element: Any, foundItem: (element: Any?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }

        if (itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList[1])
    }
}