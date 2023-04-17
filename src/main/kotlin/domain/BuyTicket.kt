package domain

import model.Client
import model.Ticket.BaseTicket
import model.Ticket.Ticket
import model.Ticket.TicketWithTrainer
import model.Ticket.VipTicket

// Клиент покупает абонемент

class BuyTicket() {
    fun buyTicket(client: Client, ticket: String): Ticket {
        return when(ticket){
            BaseTicket.TYPE_TICKET -> BaseTicket(1, 2500, client)
            TicketWithTrainer.TYPE_TICKET -> TicketWithTrainer(2, 3500, client)
            VipTicket.TYPE_TICKET -> VipTicket(3, 5000, client)
            else -> throw Exception("Unknown ticket type")
        }
    }
}
