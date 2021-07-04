package com.cognizant.traineemanager.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator{

	 static Pattern p = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = p.matcher(emailStr);
		        boolean b = matcher.matches();
		        return b;
		        
		}
		
	   static Pattern name = Pattern.compile("^[\\p{L} .'-]+$");
	   public static boolean validateName(String traineeName)
	   {
		   Matcher matcher = name.matcher(traineeName);
	        boolean b = matcher.matches();
	        return b;
	   }
	   
	   static Pattern empid = Pattern.compile("^[0-9]{1,6}$");
	   public static boolean validateId(int traineeId)
	   {
		   int length = String.valueOf(traineeId).length();
		   if(length == 6)
			   return true;
		   else
			   return false;

		   
	   }
	   
	   static Pattern cohort = Pattern.compile("^[A-Za-z]{3}[0-9]{2}[A-Za-z]{2}[0-9]{2}$");
	   public static boolean validateCohort(String traineeCohort)
	   {
		   Matcher matcher = cohort.matcher(traineeCohort);
	        boolean b = matcher.matches();
	        return b;
	   }
	   
	   
	   
	  
	   
	   
}
