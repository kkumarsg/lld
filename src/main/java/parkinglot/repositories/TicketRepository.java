package parkinglot.repositories;

import parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long, Ticket> tickets = new HashMap<>();
    Long previousId = 0l;
    public Ticket save(Ticket ticket) {

        previousId++;
        ticket.setId(previousId);
        tickets.putIfAbsent(previousId, ticket);
        return ticket;
    }
}
