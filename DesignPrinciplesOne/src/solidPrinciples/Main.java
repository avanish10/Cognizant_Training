package solidPrinciples;

import java.util.Scanner;

public class Main {
 public static void main(String[] args)
 {
	 System.out.println("Welcome to our site. Would you like to order or repair");
	 Scanner scn = new Scanner(System.in);
	 String option = scn.next();
	 
	 switch(option)
	 {
	 case "order":
		 System.out.println("Please provide the phone model name");
		 String productDetails = scn.nextLine();
		 PhoneOrderRepair order = new PhoneOrderRepair();
		 order.processOrder(productDetails);
		 break;
	 case "repair":
		 System.out.println("Is it phone or accessory you want to be repaired?");
		 String productType = scn.next();
		 if(productType.equalsIgnoreCase("phone"))
		 {
			 System.out.println("Please provide the phone model name");
			 String productDetail = scn.nextLine();
			 ProcesssPhoneRepair phone = new ProcesssPhoneRepair();
			 phone.processPhoneRepair(productDetail);
		 }
		 else
		 {
			 System.out.println("Please provide the accessory detail,like headphone, tempered glass");
			 String productDetailss = scn.nextLine();
			 ProcessAccessoryRepair accessory = new ProcessAccessoryRepair();
			 accessory.processAcessoryRepair(productDetailss);
			 
			 
		 }
		 break;
		 default:break;
	 }
 }
}
