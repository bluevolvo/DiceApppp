package com.example.diceapp

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
 @Test
 fun testDiceRoll(){
     val dice = DiceLogic(6)
     assertTrue("The test is wrong", dice.roll() in 1..6)
 }
}