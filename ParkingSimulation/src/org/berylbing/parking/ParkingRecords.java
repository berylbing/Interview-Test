package org.berylbing.parking;

public class ParkingRecords {

	private final int totalSpace;
    private int carsParked = 0;
    private int trucksParked = 0;
    
    private int carsEntered = 0;
    private int carsExited = 0;
    
    private int totalFee = 0;
    
    private int trucksEntered = 0;
    private int trucksExited = 0;
	
   	public ParkingRecords(int tspace){
    	totalSpace = tspace;     
    } 
    
    public void EnterCar(){
        carsParked ++;
        carsEntered ++;
    }
    
    public void ExitCar(int time)
    {
        carsParked --;
        carsExited ++;
        totalFee += new CarParking().getFee(time);
    }
    
    public void EnterTruck(){
        trucksParked ++;
        trucksEntered ++;
    }
    
    public void ExitTruck(int time){
        trucksParked --;
        trucksExited ++;
        totalFee += new TruckParking().getFee(time);
    }
    
	public void printCurrentReport() {
		System.out.println("Cars entered: " + carsEntered);
		System.out.println("Trucks entered: " + trucksEntered);
		System.out.println("Cars exited: " + carsExited);
		System.out.println("Trucks entered: " + trucksExited);
		System.out.println("Parking Cars: " + carsParked);
		System.out.println("Parking Trucks: " + trucksParked);
		System.out.println("Spaces available: " + (totalSpace - (carsParked * new CarParking().getSpaceOccupied() + trucksParked * new TruckParking().getSpaceOccupied())));
		System.out.println("Fees paid: " + totalFee);
	}

}
