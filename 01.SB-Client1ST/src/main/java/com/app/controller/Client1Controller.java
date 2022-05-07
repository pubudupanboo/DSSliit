package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Client1Data;
import com.app.model.Client1;
import com.app.service.Client1Service;

@RestController
@RequestMapping("/Client1")
public class Client1Controller {//http://localhost:8023/Client1/156 need to pass Empty value with jason
 
	@Autowired
	private Client1Service client1Service;
	
	@PostMapping("/{id}")
	public Client1 saveClient1Data(@RequestBody Client1 client1 ){
		
		return client1Service.saveClient1(client1);
	 }
	
	@GetMapping("/{id}")
	public Client1Data getClent1Details(@PathVariable("id") Long client1Id){
		
		return client1Service.getClient1Data(client1Id);
	}
	
	
	
	
}

