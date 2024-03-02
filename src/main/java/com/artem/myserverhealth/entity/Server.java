package com.artem.myserverhealth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "server")
public class Server {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

    @OneToMany(mappedBy = "server", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<History> histories;

    @ManyToMany(mappedBy = "servers")
    private List<User> users;
}
