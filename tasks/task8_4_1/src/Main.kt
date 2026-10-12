// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)

    // val result = numbers
    // Outputs: [1, 4, 7, 2, 9, 3, 8]
    
    
    // val result = numbers.asSequence() 
    // outputs: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1@27c170f0
    
    
    // val result = numbers.asSequence().filter {it % 2 != 0}
    // Outputs: Kotlin.sequences.FilteringSequence@4a574795
    
    // val result = numbers.asSequence().filter {it % 2 != 0}.map {it * it}
    // Outputs: kotlin.sequences.TransformingSequence@4f023edb
    
    val result = numbers.asSequence().filter {it % 2 != 0}.map {it * it}.toList()
    // Output: [1, 49, 81, 9]

    println(result)
}
