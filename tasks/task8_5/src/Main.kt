// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "This is a test string to test the how many function"
    
    val vowelCount = text.howMany {it.lowercase() in "aeiou"}
    println("${vowelCount} vowels in string")
    
    val wordCount = text.howMany {it in " "} + 1
    println("${wordCount} words in string")
}
