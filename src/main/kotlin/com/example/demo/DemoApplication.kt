package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Spring Boot 애플리케이션의 시작점입니다.
 * @SpringBootApplication 어노테이션은 설정 자동화, 컴포넌트 스캔 등을 포함합니다.
 */
@SpringBootApplication
class DemoApplication

/**
 * 프로젝트를 구동하는 메인 함수입니다.
 */
fun main(args: Array<String>) {
    // 스프링 애플리케이션을 실행합니다.
    runApplication<DemoApplication>(*args)
}
