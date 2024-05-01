package com.busmangement.system.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "bus_conductor_mapping")
public class BusConductorMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "bus_id", referencedColumnName = "id")
	private Bus busDetails;

	@OneToOne
	@JoinColumn(name = "conductor_id", referencedColumnName = "id")
	private Conductor conductorDetails;
	
	@Column(name = "crated_on")
    private Date createdOn;
}
