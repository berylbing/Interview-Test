/** 
Interview test - car park simulation
The entry of the project verifying the input of Users.
@author Beryl 
@version v.1.0 
*/ 

package org.berylbing.parking;

import java.util.Scanner;

public class Application {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSpace = 0;
		System.out.println("How many spaces does the car park have?");
		Scanner reader=new Scanner(System.in);
		if(reader.hasNextInt()){
			totalSpace = reader.nextInt();
			reader.nextLine();
		}else if(reader.nextLine().equals("QUIT")){
			System.out.println("SYSTEM QUIT!");
			reader.close();
			System.exit(0);
		}else{
			System.out.println("Invild Input!");
		}
		String userInput = reader.nextLine();
		ParkingRecords pr = new ParkingRecords(totalSpace);
		while(!userInput.equals("QUIT")){
			switch(userInput){
				case "ENTER CAR": pr.EnterCar(); break;
				case "ENTER TRUCK": pr.EnterTruck(); break;
				case "REPORT": pr.printCurrentReport();break;
				default:
					int time = 0;
					if (userInput.startsWith("EXIT CAR")){
	                       time = Integer.parseInt(userInput.substring("EXIT CAR ".length()));
	                       pr.ExitCar(time);
	                   }
	                   else if(userInput.startsWith("EXIT TRUCK")){
	                       time = Integer.parseInt(userInput.substring("EXIT TRUCK ".length()));
	                       pr.ExitTruck(time);
	                   }
	                   else{
	                       System.out.println("Invild Input!");
	                   }
					break;
			}
			userInput = reader.nextLine();
		}
		
		System.out.println("SYSTEM QUIT!");
		reader.close();
	}

}
