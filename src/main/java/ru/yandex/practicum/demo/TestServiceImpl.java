package ru.yandex.practicum.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    private final TestMapper testMapper;

    @Override
    @Transactional
    public EchoDto logEntry(String message) {
        LogEntry newLogEntry = new LogEntry();
        newLogEntry.setCreatedOn(LocalDateTime.now());
        newLogEntry.setMessage(message);

        testRepository.save(newLogEntry);

        return testMapper.toEchoDto(newLogEntry);
    }

}
