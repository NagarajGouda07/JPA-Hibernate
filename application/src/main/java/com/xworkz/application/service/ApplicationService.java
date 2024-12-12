package com.xworkz.application.service;

import org.springframework.stereotype.Service;

import com.xworkz.application.dto.ApplicationDTO;

@Service
public interface ApplicationService {

	boolean save(ApplicationDTO applicationDTO);

}
