package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
