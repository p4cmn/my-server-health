package com.artem.myserverhealth.service;

import com.artem.myserverhealth.entity.Server;
import com.artem.myserverhealth.repository.ServerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServerService {

    private final ServerRepository serverRepository;

    public Server create(String address) {
        var server = Server.builder()
                .address(address)
                .build();
        return serverRepository.findByAddress(address)
                .orElseGet(() -> serverRepository.save(server));
    }
}
