/** 
Vehicle parking interface includes methods of getSpaveOccupied() and getFee(int time).
@author Beryl 
@version v.1.0 
*/ 

package org.berylbing.parking;

public interface VehicleParking {
	
	public int getSpaceOccupied();
	public int getFee(int time);
	
}
