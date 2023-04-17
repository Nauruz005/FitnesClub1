package data

import model.Client
import model.Ticket.Ticket
import model.Trainer
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class FitnesClubDataSourseImpl: FitnesClubDataSourse {
    private val filename1 = "C:\\Users\\harot\\OneDrive\\Документы"
    fun readCsvFile(): List<String>{
        val bufferedReader = Files.newBufferedReader(Paths.get(filename1))
        var result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines)
            result.add(line)
        }
        return result
    }

    override fun getClients(): List<Client> = readCsvFile().map{ client ->
        val (name, id) = client.split(",")
        return@map Client(name, id.toInt())
    }

    private val filename2 = "C:\\Users\\harot\\OneDrive\\Документы"
    fun readCsvFile(): List<String>{
        val bufferedReader = Files.newBufferedReader(Paths.get(filename2))
        var result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines)
            result.add(line)
        }
        return result

    override fun getTrainer(): List<Trainer> = readCsvFile().map{ trainer ->
        val (name, id) = client.split(",")
        return@map Trainer(name, id.toInt())
    }

    override fun getTickets(): List<Ticket> {
        TODO("Not yet implemented")
    }
}