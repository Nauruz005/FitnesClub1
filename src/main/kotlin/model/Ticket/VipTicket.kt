package model.Ticket

import model.Client

data class VipTicket(
    override val id: Int,
    override val price: Int,
    override val client: Client,
    override val name: String = TYPE_TICKET
): Ticket {

    override fun printInfo() {
        println("Это абонемент, включающий персональную тренировку, бассейн и сауну")
    }

    companion object {
         const val TYPE_TICKET = "Vip"
    }
}