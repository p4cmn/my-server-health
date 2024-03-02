package com.artem.myserverhealth.service;

import com.artem.myserverhealth.entity.History;
import com.artem.myserverhealth.entity.Server;
import com.artem.myserverhealth.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class HistoryService {

    private final HistoryRepository historyRepository;

    public History create(boolean isAvailable, Server server) {
        var history = History.builder()
                .checkedAt(LocalDateTime.now())
                .isAvailable(isAvailable)
                .server(server)
                .build();
        return historyRepository.save(history);
    }
}
