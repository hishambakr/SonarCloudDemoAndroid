package com.hisham.sonarclouddemo

import org.junit.Assert
import org.junit.Test

class MyKotlinClassTest {

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, MyKotlinClas().myPlus(1,3))
    }
}