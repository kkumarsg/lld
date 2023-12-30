package parkinglot.strategies;

import parkinglot.exceptions.ParkingLotFullException;
import parkinglot.models.ParkingSlot;
import parkinglot.models.VehicleType;

public interface ParkingPlaceAllotmentStrategy {

    ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId)
            throws ParkingLotFullException;

}
