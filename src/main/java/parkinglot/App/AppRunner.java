package parkinglot.App;

import parkinglot.controllers.TicketController;
import parkinglot.dtos.IssueTicketRequest;
import parkinglot.models.Ticket;
import parkinglot.models.VehicleType;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.ParkingLotRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.services.TicketService;

public class AppRunner {

    public static void main(String[] args) {

        /*
            1. create gates, floors, parking slots, parking lot
               Option 1 : You create controller for floot, gates etc
               Option 2 : You can directly call repositories and create them

            2. just 2 floors, each floor will have only 2 spots. Make it full
            3. Is issueTicket working fine (It should throw an error)
            4. Test all the exceptions.
            5. Try to implement few other features along with issue ticket.
         */

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

//        IssueTicketRequest request = new IssueTicketRequest(VehicleType.FOUR_WHEELER, "KA-02, MB-1234", "Keerhti", gateId, parkingLotId);
//        ticketController.issueTicket(request);
    }
}
