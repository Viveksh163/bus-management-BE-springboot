package com.busmangement.system.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ticket_number")
	private Long ticketNumber;
	
	@Column(name = "ticket_date")
	private Date ticketDate;
	
	@Column(name = "ticket_amount")
	private Float ticketAmount;
	
	@Column(name = "crated_on")
	private Date createdOn;

}
