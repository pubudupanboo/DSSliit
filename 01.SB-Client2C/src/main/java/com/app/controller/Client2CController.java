package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Client2C;
import com.app.service.Client2CService;

@RestController
@RequestMapping("/Client2C")
public class Client2CController {
	
	@Autowired
	private Client2CService client2CService; 
	
	@PostMapping("/")
	public Client2C saveClient2CData(@RequestBody Client2C client2C) {
			
		return client2CService.insertClient2CDb(client2C);
		
	} 
	
	@GetMapping("/{id}")
	public Client2C getClient2CDataByID(@PathVariable("id") Long client2C ) {
		
		return client2CService.getClient2CByClient2CId(client2C);
	}

}
