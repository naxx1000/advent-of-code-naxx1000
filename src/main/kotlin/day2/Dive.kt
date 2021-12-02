package day2

import day2.Dive.Direction.*
import util.InputReader

object Dive {

    enum class Direction {
        FORWARD,
        DOWN,
        UP,
        UNDEFINED
    }

    fun String.toDirectionEnum(): Direction = when (this) {
        "forward" -> FORWARD
        "down" -> DOWN
        "up" -> UP
        else -> UNDEFINED
    }

    data class SubCommand(
        val direction: Direction,
        val moveUnits: Int
    )

    // Part 1: What do you get if you multiply your final horizontal position by your final depth?
    fun getDepthByHorizontalPosition(): Int {
        val subCommands = InputReader.getDay2Input()
        var horizontalPosition = 0
        var depth = 0
        subCommands.forEach { command ->
            when (command.direction) {
                FORWARD -> horizontalPosition += command.moveUnits
                DOWN -> depth += command.moveUnits
                UP -> depth -= command.moveUnits
                UNDEFINED -> Unit
            }
        }
        return horizontalPosition * depth
    }

    // Part 2: What do you get if you multiply your final horizontal position by your final depth?
    fun getDepthByHorizontalPositionWithAim(): Int {
        val subCommands = InputReader.getDay2Input()
        var horizontalPosition = 0
        var depth = 0
        var aim = 0
        subCommands.forEach { command ->
            when (command.direction) {
                FORWARD -> {
                    horizontalPosition += command.moveUnits
                    depth += (aim * command.moveUnits)
                }
                DOWN -> aim += command.moveUnits
                UP -> aim -= command.moveUnits
                UNDEFINED -> Unit
            }
        }
        return horizontalPosition * depth
    }
}