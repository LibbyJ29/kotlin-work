// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputDocument: String, textToRedact: String, charForRedact: Char = 'X'):String {
    val newString = inputDocument.replace(textToRedact, (charForRedact.toString().repeat(textToRedact.length)))
    return newString
}