package com.xworkz.application.service;

import org.springframework.stereotype.Service;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.entity.ApplicationEntity;
import com.xworkz.application.repository.ApplicationRepoImpl;
import com.xworkz.application.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Override
	public boolean save(ApplicationDTO applicationDTO) {

		System.out.println("applicationDTO == " + applicationDTO.toString());

		ApplicationEntity applicationEntity = new ApplicationEntity();
		applicationEntity.setName(applicationDTO.getName());
		applicationEntity.setEmail(applicationDTO.getEmail());
		applicationEntity.setPassword(applicationDTO.getPassword());
		
		ApplicationRepository applicationRepository = new ApplicationRepoImpl();
		applicationRepository.save(applicationEntity);
		System.out.println("applicationEntity == " + applicationEntity.toString());

		return true;
	}

}
