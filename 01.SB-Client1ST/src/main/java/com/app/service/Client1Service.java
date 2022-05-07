package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.app.dto.Client1Data;
import com.app.model.Client1;
import com.app.model.Client2C;
import com.app.repository.Client1Repository;

@Service
public class Client1Service {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Client1Repository client1Repository;

	@PostMapping("/")
	public Client1 saveClient1(Client1 client1) {
		
		return client1Repository.save(client1);
	}

	public Client1Data getClient1Data(Long client1Id) {
		
		Client2C client2c = restTemplate.getForObject("http://localhost:8086/Client2C/"+client1Id,Client2C.class);
		
		Client1 client1 = client1Repository.findByClientId(client1Id);
		
		Client1Data client1Data = new Client1Data();
		BeanUtils.copyProperties(client1, client1Data);
		
		client1Data.setClient2C(client2c);
		
		return client1Data;
	}
	
}
