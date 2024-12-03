package ru.yandex.practicum.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<LogEntry, Long> {



}
