Hash Functions

There are two requiriments to a hash function:

1. It has to be consistence. It must return the same id very same string
2. It has to map different ids to different strings.

A HashTable is a hash function plus an array

Kotlin HashTables references:
    [kotlin documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/)
    [android developers](https://developer.android.com/reference/kotlin/java/util/Hashtable)
    [medium](https://bddesai.medium.com/hashtables-in-kotlin-e5d6d5775a1d)

Recap page 105.
 - Modeling relationships from one thing to another thing
 - Filtering out duplicates
 - Caching/memorizing data instead of making your server do work

To use hashTables you have to watchout with collisions (just to be aware of)

In the average case hashTables is O(1) constant time, in the worst case it's O(n) linear time