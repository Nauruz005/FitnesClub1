package model.Ticket

import model.Client

interface Ticket {
    val id: Int
    val price: Int
    val client: Client
    val name: String

    fun printInfo()
}