package org.berylbing.parking;

public class CarParking implements VehicleParking{

	private static final int unitSpace = 1;
	private static final int unitFee = 2;
	
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
