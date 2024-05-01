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
@Entity(name = "bus_details")
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "bus_number")
	private Long busNumber;
	
	@Column(name = "bus_time")
	private Date busTime;
	
	@Column(name = "bus_route")
	private String busRoute;
	
	@Column(name = "bus_site")
	private String busSite;
	
	@Column(name = "bus_window")
	private String busWindow;
	
	@Column(name = "crated_on")
    private Date createdOn;
}
