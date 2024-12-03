package ru.yandex.practicum.demo;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestMapper {

    EchoDto toEchoDto(LogEntry logEntry);

}
