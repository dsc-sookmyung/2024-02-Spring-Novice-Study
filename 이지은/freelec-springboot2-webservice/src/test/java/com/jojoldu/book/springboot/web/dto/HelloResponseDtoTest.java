package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt.isEqualTo;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        String name="test";
        int amount = 1000;

        HelloResponseDto dto=new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
