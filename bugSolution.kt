```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    val sum = doubledList.sum()
    println(sum)

    val words = listOf("apple", "banana", "cherry")
    val firstLetter = words.map { it[0] }
    println(firstLetter)

    //Safe handling of empty lists
    val emptyList = emptyList<String>()
    val firstWordOrNull = emptyList.firstOrNull()
    println(firstWordOrNull) // Output: null

    val lastWordOrNull = emptyList.lastOrNull()
    println(lastWordOrNull) // Output: null

    val firstWord = words.firstOrNull() ?: "No first word" //default value
    println(firstWord)

    val lastWord = words.lastOrNull() ?: "No last word" //default value
    println(lastWord)
}
```