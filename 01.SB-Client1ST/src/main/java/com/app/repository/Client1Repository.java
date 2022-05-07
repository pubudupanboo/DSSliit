package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Client1;

public interface Client1Repository extends JpaRepository<Client1 , Long> {

	Client1 findByClientId(Long client1Id);

}
