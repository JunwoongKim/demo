package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getGreeting(): String {
        return "Hello, Kotlin!"
    }
}
