package ru.gazprombank.servermanager.request

data class ServerRequest(
    val name: String,
    val manufacturer: String,
    val ipv4Address: String,
    val ram: Double,
    val storage: Double,
    val responsibleEmployeeId: Long
)