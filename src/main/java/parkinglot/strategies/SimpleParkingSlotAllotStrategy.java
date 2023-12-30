package parkinglot.strategies;

import parkinglot.exceptions.ParkingLotFullException;
import parkinglot.models.ParkingSlot;
import parkinglot.models.VehicleType;

public class SimpleParkingSlotAllotStrategy implements ParkingPlaceAllotmentStrategy{

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId)
        throws ParkingLotFullException {

        // get all the floors for this parking lot which are free
        // go through the free floors and return any spot for this vehicle type.
        return null;
    }
}
