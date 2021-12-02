package day1

object SonarSweep {

    // Part 1: How many measurements are larger than the previous measurement?
    fun numberOfIncreasingDepthMeasurements(measurements: List<Int>): Int {
        var x = 0
        measurements.forEachIndexed { index, value ->
            if (index >= 1) {
                if (value > measurements[index - 1]) {
                    x++
                }
            }
        }
        return x
    }

    // Part 2: Consider sums of a three-measurement sliding window. How many sums are larger than the previous sum?
    fun numberOfIncreasingSumsDepthMeasurements(measurements: List<Int>): Int {
        var x = 0
        var lastSum: Int? = null
        for (i in 2..measurements.lastIndex) {
            val sum = measurements[i - 2] + measurements[i - 1] + measurements[i]
            lastSum?.let {
                if (sum > it) {
                    x++
                }
            }
            lastSum = sum
        }
        return x
    }

}