package com.app.dto;

import com.app.model.Client2C;

public class Client1Data {

	private Long clientId;
	private int start_Number;
	private int end_Number;
	private Long client1Id;
	
	private Client2C client2C;

	public Client1Data() {
		super();
	}

	public Client1Data(Long clientId, int start_Number, int end_Number, Long client1Id, Client2C client2c) {
		super();
		this.clientId = clientId;
		this.start_Number = start_Number;
		this.end_Number = end_Number;
		this.client1Id = client1Id;
		client2C = client2c;
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

	public Client2C getClient2C() {
		return client2C;
	}

	public void setClient2C(Client2C client2c) {
		client2C = client2c;
	}

	
	

	


	

	

	

	

	

	

	

	

	

	

	
	
	
}
