package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client2C")
public class Client2C {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientId;
	private int start_Number;
	private int end_Number;
	
	
	
	public Client2C() {
		super();
	}


	public Client2C(Long clientId, int start_Number, int end_Number) {
		super();
		this.clientId = clientId;
		this.start_Number = start_Number;
		this.end_Number = end_Number;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
