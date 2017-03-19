# Test - CAR PARK SIMULATION

Using Java create a simulation of a car park regarding the requirement in [CAR_PARK_SIMULATION.docx](https://github.com/berylbing/Interview-Test/blob/master/CAR_PARK_SIMULATION.docx). The program will record vehicles entering and exiting the car park, as well as the total balance of parking fees paid.

## Introduction

This project has acomplished the reqirements in the CAR_PARK_SIMULATION.docx, with several tests on validating different user inputs. The following will describe the developing environment, project structure and the tests on the project.

### Developing environment

Java JDK 1.8

Eclipse 4.6

### Project structure

[Application.java](https://github.com/berylbing/Interview-Test/blob/master/ParkingSimulation/src/org/berylbing/parking/Application.java) - The entry of the project verifing the input of Users.

[VehicleParking.java](https://github.com/berylbing/Interview-Test/blob/master/ParkingSimulation/src/org/berylbing/parking/VehicleParking.java) - Vehicle parking interface

```
public interface VehicleParking {
	
	public int getSpaceOccupied();
	public int getFee(int time);
	
}
```

[CarParking.java](https://github.com/berylbing/Interview-Test/blob/master/ParkingSimulation/src/org/berylbing/parking/CarParking.java) - The implementation of VehicleParking specific for cars.

[TruckParking.java](https://github.com/berylbing/Interview-Test/blob/master/ParkingSimulation/src/org/berylbing/parking/TruckParking.java) - The implementation of VehicleParking specific for trucks.

[ParkingRecords.java](https://github.com/berylbing/Interview-Test/blob/master/ParkingSimulation/src/org/berylbing/parking/ParkingRecords.java) - It records the parking state including cars/trucks enter/exit number and the spaces of the parking lots, and prints the reports.

## Running the tests

The projet will be tested in user input and the correctness of the output.

### User input 

This project require user input commands to record the vehicles enter or exit. In this part, the invalid commands will be tested.

```
Give an example
```

### Correctness of the output

In this part, the correctness of the action of validated commands and the correctness of the reports will be verified.

```
Give an example
```



## Contributors

* **Beryl Yi** - *Independent work* - [berylbing](https://github.com/berylbing)





