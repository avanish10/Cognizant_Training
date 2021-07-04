package com.cognizant.traineemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.traineemanager.model.Trainee;

@Repository
public interface TraineeDao extends JpaRepository<Trainee, String> {



}
