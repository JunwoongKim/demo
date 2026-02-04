package com.example.demo.service

import org.springframework.stereotype.Service

/**
 * 인사를 담당하는 서비스 클래스입니다.
 * 비즈니스 로직을 처리하며 Controller에서 호출하여 사용합니다.
 */
@Service
class HelloService {
    /**
     * 기본 인사말을 반환하는 함수입니다.
     * @return "Hello, Kotlin!" 문자열
     */
    fun getGreeting(): String {
        // 고정된 인사말 문자열을 반환합니다.
        return "Hello, Kotlin!"
    }
}
