package com.devsuperior.dslearnbds.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.controller.exception.ForbiddenException;
import com.devsuperior.dslearnbds.controller.exception.UnauthorizedException;
import com.devsuperior.dslearnbds.entity.User;
import com.devsuperior.dslearnbds.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedException("Usuário Inválido");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if (!user.getId().equals(userId) && !verifyAdmin(user, "ROLE_ADMIN")) {
			throw new ForbiddenException("acesso negado");
		}
	}
	
	private boolean verifyAdmin(User user, String userAuthority) {
		return user.getRoles().stream().anyMatch(role -> role.getAuthority().contains(userAuthority));
	}
}
