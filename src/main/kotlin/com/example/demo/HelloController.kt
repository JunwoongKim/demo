package com.example.demo

import com.example.demo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 사용자 요청을 처리하는 RestController입니다.
 * 외부에서 들어오는 HTTP 요청을 받아 해당 서비스로 연결합니다.
 */
@RestController
class HelloController(private val helloService: HelloService) {

    /**
     * '/hello' 경로로 GET 요청이 들어오면 호출되는 메서드입니다.
     * Swagger UI에서 이 API를 테스트해 볼 수 있습니다.
     */
    @GetMapping("/hello")
    fun hello(): String {
        // HelloService를 통해 인사말 로직을 실행하고 결과를 반환합니다.
        return helloService.getGreeting()
    }
}
