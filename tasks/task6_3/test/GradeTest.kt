// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    
    //typical values
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }
    
    @Test
    fun `Mark of 75 gives a Distinction`() {
        assertEquals("Distinction", grade(75))
    }

    @Test
    fun `Mark of 35 gives a Fail`() {
        assertEquals("Fail", grade(35))
    }

    @Test
    fun `Mark of 105 gives a ?`() {
        assertEquals("?", grade(105))
    }
    
    @Test
    fun `Mark of -5 gives a ?`() {
        assertEquals("?", grade(-5))
    }

    //boundary tests

    //pass boundaries
    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }
    
    @Test
    fun `Mark of 69 gives a Pass`() {
        assertEquals("Pass", grade(69))
    }
    
    //distinction boundaries
    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }
    
    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }
    
    //fail boundaries
    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }
    
    @Test
    fun `Mark of 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }
    
    //? boundaries
    @Test
    fun `Mark of -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }
    
    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }
}
