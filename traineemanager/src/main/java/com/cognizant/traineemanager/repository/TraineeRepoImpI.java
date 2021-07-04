package com.cognizant.traineemanager.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.traineemanager.model.Trainee;

@Service
public class TraineeRepoImpI {
   @Autowired 
   private TraineeRepo traineeRepo;
   
   @Transactional
   public void addTrainee(Trainee trainee)
   {
	   traineeRepo.save(trainee);
   }
   
   @Transactional
   public void deleteTrainee(int empId)
   {
	   traineeRepo.deleteById(empId);
   }
   
}
