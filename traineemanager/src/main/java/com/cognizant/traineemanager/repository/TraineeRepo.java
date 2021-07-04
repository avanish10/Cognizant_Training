package com.cognizant.traineemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.traineemanager.exception.InvalidTraineeOperationException;
import com.cognizant.traineemanager.model.Trainee;

@Repository
public interface TraineeRepo extends JpaRepository<Trainee, Integer> {

}
