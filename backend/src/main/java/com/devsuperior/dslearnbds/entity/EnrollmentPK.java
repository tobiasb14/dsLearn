package com.devsuperior.dslearnbds.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EnrollmentPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Offer offer;
}
