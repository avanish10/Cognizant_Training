package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.OrmLearnApplication;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.SkillRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository skillRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	@Transactional

	public Skill get(int id) {

	LOGGER.info("Start");

	return skillRepository.findById(String.valueOf(id)).get();

	}
	
	@Transactional

	public void save(Skill skill) {

	LOGGER.info("Start");

	skillRepository.save(skill);

	LOGGER.info("End");

	}

}
