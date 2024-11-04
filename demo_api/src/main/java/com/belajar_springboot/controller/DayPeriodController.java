package com.belajar_springboot.controller;


import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DayPeriodController {

    @GetMapping("/getDayPeriod")
    public Map<String, String> getDayPeriod() {
        // Mendapatkan waktu saat ini
        LocalTime currentTime = LocalTime.now();

        // Tentukan siang atau malam
        String period;
        if (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(18, 0))) {
            period = "Siang";
        } else {
            period = "Malam";
        }

        // Buat respons
        Map<String, String> response = new HashMap<>();
        response.put("Periode", period);

        return response;
    }
}
