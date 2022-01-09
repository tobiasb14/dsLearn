package com.devsuperior.dslearnbds.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;

	@Column(columnDefinition = "TEXT")
	private String body;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;
	
	@ManyToOne
	private Offer offer;
	
	@ManyToOne
	private Lesson lesson;
	
	@ManyToOne
	private Reply answer;
	
	@ManyToMany
	@JoinTable(name = "tb_topic_likes",
		joinColumns = @JoinColumn(name = "topic_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))	
	@Setter(AccessLevel.NONE)
	private Set<User> likes = new HashSet<>();
	
	@OneToMany(mappedBy = "topic")
	@Setter(AccessLevel.NONE)
	private List<Reply> replies = new ArrayList<>();
	
}
