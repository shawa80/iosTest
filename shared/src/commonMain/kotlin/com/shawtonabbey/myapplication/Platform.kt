package com.shawtonabbey.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform