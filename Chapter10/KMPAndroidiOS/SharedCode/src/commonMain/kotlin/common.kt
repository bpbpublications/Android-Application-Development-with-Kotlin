package com.hardiktrivedi.kmpandroidios

import kotlin.random.Random

expect fun getServiceFee(): Int

expect fun getPlatformName(): String

val conversionRate = Random.nextDouble(90.0, 97.0)

fun convertToGBP(fromAmount: Float): Double {
    return fromAmount * conversionRate
}