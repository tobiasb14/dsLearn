package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
