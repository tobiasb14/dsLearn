package com.devsuperior.dslearnbds.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.service.NotificationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

	private final NotificationService notificationService;
	
	@GetMapping
	public ResponseEntity<Page<NotificationDTO>> notificationsToCurrentUser(Pageable pageable) {
		return ResponseEntity.ok(notificationService.notificationsToCurrentUser(pageable));
	}
}
