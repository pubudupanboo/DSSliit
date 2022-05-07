package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Client2C;
import com.app.repository.Client2CRepository;


@Service
public class Client2CService {

	@Autowired
	private Client2CRepository client2CRepository; 
	
	public Client2C insertClient2CDb(Client2C client2c) {
		
		return client2CRepository.save(client2c);
	}

	public Client2C getClient2CByClient2CId(Long client2c) {
		
		return client2CRepository.findByClientId(client2c);
	}

}
