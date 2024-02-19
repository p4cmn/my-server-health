package com.artem.myserverhealth.controller;

import com.artem.myserverhealth.dto.ServerHealthDTO;
import com.artem.myserverhealth.service.ServerHealthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServerHealthController {

    private final ServerHealthService serverHealthService;

    @GetMapping("/health")
    public ServerHealthDTO getHealth(@RequestParam String serverURL) {
        return serverHealthService.getHealth(serverURL);
    }
}
