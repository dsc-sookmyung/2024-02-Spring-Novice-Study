package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EnableJpaAuditing 제거
// @EnableJpaAuditing  // JPA Auditing을 모두 활성화하도록 함.
// aws ec2 rds 연동 인증을 위한 주석 추가
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }
}