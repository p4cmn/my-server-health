package com.artem.myserverhealth.repository;

import com.artem.myserverhealth.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long> {

    Optional<Server> findByAddress(String address);
}
