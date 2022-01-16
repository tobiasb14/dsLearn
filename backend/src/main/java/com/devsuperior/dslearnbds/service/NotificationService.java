package com.devsuperior.dslearnbds.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {

	private final NotificationRepository notificationRepository;
	private final AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsToCurrentUser(Pageable pageable) {
		return notificationRepository.findByUser(authService.authenticated(), pageable).map(NotificationDTO::new);
	}
}
