package com.awsandspringboot.demo.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}