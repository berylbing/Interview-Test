/** 
A TruckParking Class - The implementation of VehicleParking specific for trucks.
@author Beryl 
@version v.1.0 
*/ 

package org.berylbing.parking;

public class TruckParking implements VehicleParking{

	private static final int unitSpace = 2;
	private static final int unitFee = 3;
	
	@Override
	public int getSpaceOccupied(){
		// TODO Auto-generated method stub
        return unitSpace;
	}
	
	@Override
	public int getFee(int time) {
		// TODO Auto-generated method stub
		return unitFee * time;
	}

}
