package com.optimagrowth.license.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";

    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ANSI_BLUE + "Текущее время: " + now.format(formatter) + ANSI_RESET);
    }
}
