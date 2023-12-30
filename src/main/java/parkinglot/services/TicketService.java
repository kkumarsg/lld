package parkinglot.services;

import parkinglot.dtos.IssueTicketRequest;
import parkinglot.exceptions.GateNotFoundException;
import parkinglot.exceptions.ParkingLotFullException;
import parkinglot.exceptions.ParkingLotNotFoundException;
import parkinglot.models.*;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.ParkingLotRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategies.ParkingPlaceAllotmentStrategy;
import parkinglot.strategies.ParkingSlotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId());
        ticket.setEntryGate(gate);

        ticket.setVehicle(getVehicleForNumber(ticketRequest));

        ticket.setParkingSlot(getParkingSlot(ticketRequest));

        ticket.setNumber(ticketRequest.getOwnerName() + UUID.randomUUID());

        return ticketRepository.save(ticket);
    }

    private ParkingSlot getParkingSlot(IssueTicketRequest ticketRequest) throws ParkingLotNotFoundException, ParkingLotFullException {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(ticketRequest.getParkingLotId());
        ParkingPlaceAllotmentStrategy allotmentStrategy = parkingLot.getAllotmentStrategy();

        ParkingPlaceAllotmentStrategy parkingAllotmentRule =
                ParkingSlotAllotmentStrategyFactory.getParkingAllotmentStrategyForType(allotmentStrategy);

        ParkingSlot parkingSlot = parkingAllotmentRule.getParkingSlot(ticketRequest.getVehicleType(), ticketRequest.getParkingLotId());
        return parkingSlot;
    }

    private Vehicle getVehicleForNumber(IssueTicketRequest ticketRequest) {
        Vehicle vehicle = vehicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
        if (vehicle == null) {
            vehicle = new Vehicle(ticketRequest.getVehicleType(), ticketRequest.getVehicleNumber(),
                    ticketRequest.getOwnerName());
            vehicleRepository.save(vehicle);
        }
        return vehicle;
    }
}
