package Chapters.`6_ Breadth_first_search`

import java.util.Hashtable
import java.util.LinkedList
import java.util.Queue


fun main() {
    val graph = Hashtable<String, List<String>>()
    graph["you"] = mutableListOf("alice", "bob", "claire")
    graph["bob"] = mutableListOf("anuj", "peggy")
    graph["alice"] = mutableListOf("peggy")
    graph["claire"] = mutableListOf("thom", "jonny")
    graph["anuj"] = mutableListOf()
    graph["peggy"] = mutableListOf()
    graph["thom"] = mutableListOf()
    graph["jonny"] = mutableListOf()

    val verified = mutableListOf<String>()

    fun mangoSeller(name: String): Boolean = name.last() == 'm'

    fun search(name: String): Boolean {
        val searchQueue: Queue<String> = LinkedList<String>()
        searchQueue.addAll(graph[name]!!)

        while (searchQueue.isNotEmpty()) {
            println("get on the queue")
            val person = searchQueue.poll()
            println(person)
            if (person !in verified) {
                println("$person is not verified yet")
                if (mangoSeller(person)) {
                    println("$person is a mango seller")
                    println("current queue: $searchQueue")
                    return true
                } else {
                    searchQueue.addAll(graph[person]!!)
                    println("added $person graph: ${graph[person].toString()}")
                    verified.add(person)
                    println("added $person to verified list")
                }
            }
        }
        println("there is not mango seller on the queue")
        return false
    }

    search("you")
}
