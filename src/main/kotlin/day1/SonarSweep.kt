package day1

object SonarSweep {

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
}