package com.jieun.springboot.dto;
import com.jieun.springboot.web.dto.HelloResponseDto;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void RombokTest(){
        String name="test";
        int amount=1000;

        HelloResponseDto dto=new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }


}
