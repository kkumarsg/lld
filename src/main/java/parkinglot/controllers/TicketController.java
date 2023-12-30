package parkinglot.controllers;

import parkinglot.dtos.IssueTicketRequest;
import parkinglot.dtos.IssueTicketResponse;
import parkinglot.dtos.ResponseStatus;
import parkinglot.exceptions.GateNotFoundException;
import parkinglot.exceptions.ParkingLotFullException;
import parkinglot.exceptions.ParkingLotNotFoundException;
import parkinglot.models.Ticket;
import parkinglot.services.TicketService;

public class TicketController {

    public static String TICKET_ISSUED_MESSAGE = "Ticket issued ";
    public static String INVALID_GATE = "Gate is not valid  ";
    public static String INVALID_PARKING_LOT = "Pakring Lot is not valid  ";
    public static String PARKING_LOT_FULL = "Pakring Lot is full, find a place on road.  ";
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest){

        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(ticketRequest);
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, INVALID_GATE);
        } catch (ParkingLotNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, INVALID_PARKING_LOT);
        } catch (ParkingLotFullException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, PARKING_LOT_FULL);
        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUED_MESSAGE);
    }
}
