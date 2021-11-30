package com.tseng.guess

import java.util.*
import kotlin.random.Random.Default.nextInt

class SecretNumber {
    val secret = Random().nextInt(10)+1
    var count = 0

    fun validate(number:Int): Int {
        count++
        return number-secret
    }
}

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.validate(3)}, count: ${secretNumber.count}")
}