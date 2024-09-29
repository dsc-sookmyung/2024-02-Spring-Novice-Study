package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 클래스의 모든 필드에 대해 getter 메서드를 자동으로 생성
@RequiredArgsConstructor //  final이 붙은 필드에 대해 자동으로 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
