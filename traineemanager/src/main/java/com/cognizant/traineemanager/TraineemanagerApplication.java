package com.cognizant.traineemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.traineemanager.dao.TraineeDaoImpI;
import com.cognizant.traineemanager.exception.InvalidTraineeDataException;
import com.cognizant.traineemanager.exception.InvalidTraineeOperationException;
import com.cognizant.traineemanager.model.Trainee;
import com.cognizant.traineemanager.repository.TraineeRepoImpI;
import com.cognizant.traineemanager.util.Validator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication()
@ComponentScan(basePackages = {"com.cognizant.traineemanager.dao.TaineeDaoImpI"})
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class TraineemanagerApplication {
	final static Logger LOGGER = LoggerFactory.getLogger(TraineemanagerApplication.class);
	private static TraineeDaoImpI traineeDaoImpi;
	private static TraineeRepoImpI traineeRepoImpi;
	
	private static void testGetAlltrainee()
	{
		LOGGER.info("Start");
		List<Trainee> traineeList;
		traineeList = traineeDaoImpi.getTrainee();
		LOGGER.debug("Trainees:{}", traineeList);
		LOGGER.info("End");
	}
	private static void testGetTraineeByName()
	{
		LOGGER.info("Start");
		Trainee trainee = null;
		try {
			trainee = traineeDaoImpi.getTraineeByName("A");
		} catch (InvalidTraineeDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.debug("Trainees:{}",trainee);
		LOGGER.info("End");
	}
	private static void testAddTrainee() throws InvalidTraineeOperationException
	{
		LOGGER.info("Start");
		Trainee trainee = new Trainee();
		trainee.setName("g");
		trainee.setEmpId(1);
		trainee.setEmail("Avanish@gmail.com");
		trainee.setCohort("AAA12AA12");
	
		if(Validator.validateId(trainee.getEmpId()) && Validator.validateName(trainee.getName())
				&& Validator.validateCohort(trainee.getCohort()) && Validator.validate(trainee.getEmail())) 
			traineeRepoImpi.addTrainee(trainee);
			else {
				throw new InvalidTraineeOperationException();
			}
			
		
		//traineeRepoImpi.addTrainee(null);
		
		LOGGER.info("Added");
		LOGGER.info("End");
	}
	private static void testDeleteTrainee()
	{
		LOGGER.info("Start");
		Trainee trainee  = new Trainee();
		traineeRepoImpi.deleteTrainee(1);
		LOGGER.info("Deleted");
		LOGGER.info("End");
	}
	public static void main(String[] args) throws InvalidTraineeDataException, InvalidTraineeOperationException {
		ApplicationContext context = SpringApplication.run(TraineemanagerApplication.class, args);
		traineeDaoImpi = context.getBean(TraineeDaoImpI.class);
		testGetAlltrainee();
		testGetTraineeByName();
		testAddTrainee();
		testDeleteTrainee();
		
	}

}
