package com.hisham.sonarclouddemo

import org.junit.Assert
import org.junit.Test

class MyJavaClassTest {

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, MyJavaClass().myPlus(1,3))
    }
}