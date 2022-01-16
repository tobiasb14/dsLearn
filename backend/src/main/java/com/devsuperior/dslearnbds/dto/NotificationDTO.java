package com.devsuperior.dslearnbds.dto;

import java.time.Instant;

import com.devsuperior.dslearnbds.entity.Notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {

	private Long id;
	private String text;
	private Instant moment;
	private boolean read;
	private String route;
	private Long userId;
	
	public NotificationDTO(Notification notification) {
		this.id = notification.getId();
		this.text = notification.getText();
		this.moment = notification.getMoment();
		this.read = notification.isRead();
		this.route = notification.getRoute();
		this.userId = notification.getUser().getId();
	}
}
