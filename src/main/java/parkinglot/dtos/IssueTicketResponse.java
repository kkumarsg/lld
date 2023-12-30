package parkinglot.dtos;

import parkinglot.models.Ticket;

public class IssueTicketResponse {

    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String message;

    public IssueTicketResponse(Ticket ticket, ResponseStatus responseStatus, String message) {
        this.ticket = ticket;
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
