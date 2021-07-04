package com.cognizant.traineemanager.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.traineemanager.exception.InvalidTraineeDataException;
import com.cognizant.traineemanager.model.Trainee;

public class TraineeDaoImpI {
	
	@Autowired
	private TraineeDao traineeDao;
	
	@Transactional
	public Trainee getTraineeByName(String name) throws InvalidTraineeDataException{
		Optional<Trainee> result = traineeDao.findById(String.valueOf(name));
		if(!result.isPresent())
			throw new InvalidTraineeDataException();
		else
		{
			Trainee trainee = result.get();
			return trainee;
		}
		
	}
	
	@Transactional
	public List<Trainee> getTrainee(){
		List<Trainee> traineeList = new ArrayList<Trainee>();
		traineeList.addAll(traineeDao.findAll());
		return traineeList;
	}

}
