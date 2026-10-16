// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus
import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException>{
            median(listOf())
        }
    }

    // Test 1: only one item in list
    "A list containing 1 element returns that element"{
        median(listOf(1.0f)) shouldBe (1.0f plusOrMinus tolerance)
    }

    // Test 2: list of two elements
    "A list of 2 elements returns the average of those elements"{
        median(listOf(2.0f, 1.0f)) shouldBe (1.5f plusOrMinus tolerance)
    }

    // Test 3: list of three elements
    "list of 3 elements, when sorted, returns the middle element of the sorted list"{
        assertSoftly{
            withClue("List with no duplicate elements") {median(listOf(2.0f, 3.0f, 1.0f)) shouldBe (2.0f plusOrMinus tolerance)}
            withClue("List with duplicate elements") {median(listOf(1.0f, 2.0f, 1.0f)) shouldBe (1.0f plusOrMinus tolerance)}
        }
    }

    // Test 4: list of four elements
    "list of 4 elements, when sorted, returns the average of the middle two elements"{
        assertSoftly{
            withClue("List with no duplicate elements") {median(listOf(3.0f, 1.0f, 2.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)}
            withClue("List with duplicate elements") {median(listOf(1.0f, 2.0f, 1.0f, 3.0f)) shouldBe (1.5f plusOrMinus tolerance)}
        }
    }
})
