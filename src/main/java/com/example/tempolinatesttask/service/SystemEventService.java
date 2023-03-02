package com.example.tempolinatesttask.service;

import com.example.tempolinatesttask.dto.SystemEventDto;
import com.example.tempolinatesttask.model.SystemEvent;
import com.example.tempolinatesttask.repository.SystemEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SystemEventService {

    private final SystemEventRepository repository;

    public SystemEvent saveEvent(SystemEventDto eventDto) {
        SystemEvent event = SystemEvent.builder()
                .type(eventDto.getType())
                .date(eventDto.getDate())
                .message(eventDto.getMessage())
                .build();
        return repository.save(event);
    }

    public List<SystemEvent> getEvent(@Nullable String type) {
        List<SystemEvent> list = repository.getSystemEventByTypeOrderByDateDesc(type);
        list.sort((e1, e2) -> e1.getDate().equals(e2.getDate()) ? e1.getType().compareTo(e2.getType()) : 0);
        return list;
    }
}
