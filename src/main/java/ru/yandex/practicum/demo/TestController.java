package ru.yandex.practicum.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TestDto getGreeting() {
        return new TestDto("Hello user!");
    }

    @GetMapping("/{word}")
    @ResponseStatus(HttpStatus.OK)
    public TestDto getEcho(@PathVariable String word) {
        return new TestDto(word);
    }

}
