package com.hardiktrivedi.kmpandroidios

actual fun getServiceFee(): Int {
    return (1..5).shuffled().first()
}

actual fun getPlatformName() = "Android"