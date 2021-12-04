package day3

import util.InputReader

object BinaryDiagnostic {

    // Part 1: What is the power consumption of the submarine?
    fun getPowerConsumption() {
        val input = InputReader.getDay3Input()
        val inputItemLength = input?.get(0)?.length
        val columns = mutableListOf<Int?>()
        inputItemLength?.let { itemLength ->
            for (i in 0 until itemLength) {
                val col = mutableListOf<Int>()
                for (element in input) {
                    col.add(element[i].toString().toInt())
                }
                columns.add(col.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key)
            }
            println(columns)

//            for (i in 0 until input.lastIndex) {
//                for (j in 0 until itemLength) {
//                    input[j]
//                }
//            }
        }
    }
}