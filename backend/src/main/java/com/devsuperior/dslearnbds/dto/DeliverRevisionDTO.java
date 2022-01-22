package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entity.enums.DeliverStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeliverRevisionDTO {

	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
}
