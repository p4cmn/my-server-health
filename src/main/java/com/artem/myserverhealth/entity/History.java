package com.artem.myserverhealth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime checkedAt;
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "server_id")
    private Server server;
}
