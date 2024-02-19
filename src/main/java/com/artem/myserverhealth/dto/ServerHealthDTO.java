package com.artem.myserverhealth.dto;

import lombok.Builder;

@Builder
public record ServerHealthDTO(String serverName, boolean isAvailable) {
}
