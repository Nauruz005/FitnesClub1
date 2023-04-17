package model.Ticket

import model.Client

data class BaseTicket(
    override val id: Int,
    override val price: Int,
    override val client: Client,
    override val name: String = TYPE_TICKET,
) : Ticket {

    override fun printInfo() {
        fun printInfo(){
            println(TYPE_TICKET)
        }
    }

    companion object {
         const val TYPE_TICKET = "Это абонемент в тренажёрный зал"
    }
}
