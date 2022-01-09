package com.devsuperior.dslearnbds.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.devsuperior.dslearnbds.entity.enums.ResourceType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	private ResourceType type;
	
	@ManyToOne
	private Offer offer;
	
	@OneToMany(mappedBy = "resource")
	@Setter(AccessLevel.NONE)
	private List<Section> sections = new ArrayList<>();
}
