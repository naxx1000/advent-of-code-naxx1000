package util

import day2.Dive
import day2.Dive.toDirectionEnum

object InputReader {

    fun getDay2Input(): List<Dive.SubCommand> {
        val text = object {}.javaClass.getResource("/day2input.txt")?.readText()
        val textList = text?.split("\n")
        val subCommands: MutableList<Dive.SubCommand> = mutableListOf()
        textList?.forEach { command ->
            if (command.isBlank()) return@forEach
            val (direction, unit) = command.split(" ")
            subCommands.add(Dive.SubCommand(direction.toDirectionEnum(), unit.toInt()))
        }
        return subCommands
    }
}