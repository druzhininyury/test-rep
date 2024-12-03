package ru.yandex.practicum.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EchoDto {

    private Long id;

    private String message;

    private LocalDateTime createdOn;

}
