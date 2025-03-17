package ch07.NonnullTypesWithoutImmediateInitializationLateinitializedProperties1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

class MyService {
    fun performAction(): String = "Action Done!"
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyTest {
    private lateinit var myService: MyService

    @BeforeAll
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        assertEquals("Action Done!", myService.performAction())
    }
}