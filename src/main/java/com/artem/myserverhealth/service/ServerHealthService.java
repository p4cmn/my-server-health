package com.artem.myserverhealth.service;

import com.artem.myserverhealth.dto.ServerHealthDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServerHealthService {

    private final RestTemplate restTemplate;

    public ServerHealthDTO getHealth(String serverName) {
        var isAvailable = false;
        try {
            restTemplate.getForEntity(serverName, Void.class);
            isAvailable = true;
        } catch (Exception e) {
            log.error("Error when checking server health for {}: {}", serverName, e.getMessage(), e);
        }
        return ServerHealthDTO.builder()
                .serverName(serverName)
                .isAvailable(isAvailable)
                .build();
    }

}
