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

    //This will throw an exception if list is empty
    val firstWord = words.first()
    println(firstWord)

    //This will return null if list is empty
    val firstWordOrNull = words.firstOrNull()
    println(firstWordOrNull)

    //This will throw an exception if list is empty
    val lastWord = words.last()
    println(lastWord)

    //This will return null if list is empty
    val lastWordOrNull = words.lastOrNull()
    println(lastWordOrNull) 
}
```