package com.hardiktrivedi.kmpandroidios

import platform.UIKit.UIDevice

actual fun getServiceFee(): Int {
    return (6..10).shuffled().first()
}

actual fun getPlatformName(): String = UIDevice.currentDevice.systemName()
