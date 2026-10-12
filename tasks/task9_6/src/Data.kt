// Task 9.6: readData() function

import kotlin.io.path.Path
import kotlin.io.path.forEachLine



fun readData(filename: String) = buildList {
    val filePath = Path(filename)
    filePath.forEachLine {
        add(it.toDouble())
    }
}