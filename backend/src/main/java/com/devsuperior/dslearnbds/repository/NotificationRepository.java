package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
