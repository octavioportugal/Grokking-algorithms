package Chapters.`5_Hash_tables`

import java.util.Hashtable


fun main(){

    val phoneList = Hashtable<String, Int>()

    phoneList["jenny"] = 8675309
    phoneList["emergency"] = 911

    println(phoneList["jenny"])
}
