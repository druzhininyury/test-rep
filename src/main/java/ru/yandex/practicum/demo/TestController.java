package ru.yandex.practicum.demo;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;

    @GetMapping("/echo")
    @ResponseStatus(HttpStatus.OK)
    public EchoDto getEcho(@PathParam("message") String message) {
        log.info("Request: echo for {}", message);
        return testService.logEntry(message);
    }

}
