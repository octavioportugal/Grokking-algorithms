package Chapters.`5`

import java.util.Hashtable

val votedList = Hashtable<String, Boolean>()

fun main() {
    checkVoter("tom")
    checkVoter("mike")
    checkVoter("mike")
}

fun checkVoter(name: String) {

    votedList[name]?.let {
        return println("Kick them out")
    } ?:
    votedList.put(name, true)
    return println("Let them vote")
}