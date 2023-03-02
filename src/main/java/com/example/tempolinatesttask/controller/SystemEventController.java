package com.example.tempolinatesttask.controller;

import com.example.tempolinatesttask.dto.SystemEventDto;
import com.example.tempolinatesttask.model.SystemEvent;
import com.example.tempolinatesttask.service.SystemEventService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/event")
public class SystemEventController {

    private final SystemEventService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<SystemEvent>> getEvent(@RequestParam @Nullable String type) {
        List<SystemEvent> listOfEvents = service.getEvent(type);
        return ResponseEntity.ok(listOfEvents);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<SystemEvent> saveEvent(@RequestBody @Valid SystemEventDto eventDto) {
        return ResponseEntity.ok(service.saveEvent(eventDto));
    }
}
