package model.Ticket

import model.Client

data class TicketWithTrainer(
    override val id: Int,
    override val price: Int,
    override val client: Client,
    override val name: String = TYPE_TICKET
): Ticket {

    override fun printInfo() {
        println("Это абонемент c персональной тренировкой с тренером")
    }

    companion object {
         const val TYPE_TICKET = "With Trainer"
    }
}
