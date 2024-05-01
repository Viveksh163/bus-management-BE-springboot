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
@Entity(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "passenger_name")
	private String paasengerName;
	
	@Column(name = "age")
	private Long age;
	
	@Column(name = "site_name")
	private String siteNumber;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;

	@Column(name = "crated_on")
	private Date createdOn;

}
