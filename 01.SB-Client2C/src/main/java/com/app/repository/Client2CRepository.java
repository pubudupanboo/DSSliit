package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Client2C;

public interface Client2CRepository  extends JpaRepository<Client2C,Long> {

	Client2C findByClientId(Long client2c);

}
