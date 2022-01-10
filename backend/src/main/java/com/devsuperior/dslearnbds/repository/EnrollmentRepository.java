package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.Enrollment;
import com.devsuperior.dslearnbds.entity.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
