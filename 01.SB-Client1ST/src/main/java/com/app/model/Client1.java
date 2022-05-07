package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client1")
public class Client1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientId;
	private int start_Number;
	private int end_Number;
	private Long client1Id;
	
	public Client1() {
		super();
	}

	public Client1(Long clientId, int start_Number, int end_Number, Long client1Id) {
		super();
		this.clientId = clientId;
		this.start_Number = start_Number;
		this.end_Number = end_Number;
		this.client1Id = client1Id;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public int getStart_Number() {
		return start_Number;
	}

	public void setStart_Number(int start_Number) {
		this.start_Number = start_Number;
	}

	public int getEnd_Number() {
		return end_Number;
	}

	public void setEnd_Number(int end_Number) {
		this.end_Number = end_Number;
	}

	public Long getClient1Id() {
		return client1Id;
	}

	public void setClient1Id(Long client1Id) {
		this.client1Id = client1Id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
