// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList(){
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count {it.status == ItemStatus.NotStarted} // compute no. of items with NotStarted status
    val inProgress get() = items.count {it.status == ItemStatus.InProgress} // compute no. of items with InProgress status
    val done get() = items.count {it.status == ItemStatus.Done}             // compute no. of items with Done status
    val overdue get() = items.count {it.isOverdue()}                        // compute no. of overdue items

    constructor(filename: String): this(){
        load(filename)
    }

    fun load(filename: String){
        Path(filename).forEachLine{
            val parsedLines = it.split(": ")
            items.add(ToDoItem(LocalDate.parse(parsedLines[0]), ItemStatus.valueOf(parsedLines[1]), parsedLines[2]))
        }
    }


    fun save(filename: String){
        Path(filename).writer().use{
            for (item in items){
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach {items.add(it)}

    fun deleteDone(): Boolean{
        if (items.removeAll {it.status == ItemStatus.Done}){
            return true
        } else{
            return false
        }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem>{
        if (status == null){
            return items
        } else{
            return items.filter {it.status == status}
        }
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem>{
        return items.filter {it.dueDate == date}
    }
}
