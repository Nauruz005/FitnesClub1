package data

import model.Client
import model.Ticket.Ticket
import model.Trainer

interface FitnesClubDataSourse {
    fun getClients(): List<Client>
    fun getTrainer(): List<Trainer>
    fun getTickets(): List<Ticket>
}