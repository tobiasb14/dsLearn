package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
